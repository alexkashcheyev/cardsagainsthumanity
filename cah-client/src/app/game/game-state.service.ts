import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class GameStateService {
  private readonly API_ROOT = 'http://localhost:8080/api/';

  public mode = 'index';
  public state: any;

  constructor(private httpClient: HttpClient) { }

  public updateMonitorState(game: number): void {
    if (this.checkOver()) {
      return;
    }

    this.httpClient.get(this.API_ROOT + 'monitor?game=' + game, {}).toPromise()
    .then((v) => {
      this.state = v;
    }).catch((v) => {
      this.state = 'error';
    });
  }

  public updatePlayerState(game: number, player: number): void {
    if (this.checkOver()) {
      return;
    }

    this.httpClient.get(this.API_ROOT + 'client?game=' + game + '&player=' + player, {}).toPromise()
    .then((v) => {
      this.state = v;
    }).catch((v) => {
      this.state = 'error';
    });
  }

  public createGame(): Promise<any> {
    return this.httpClient.post(
      this.API_ROOT + 'creategame',
      {}
    ).toPromise()
    .then(v => {
      this.mode = 'monitor';
      return Promise.resolve(v);
    });
  }

  public join(gameId: number, name: string): Promise<any> {
    const body = new FormData();
    body.append('game', '' + gameId);
    body.append('name', name);
    return this.httpClient.post(
      this.API_ROOT + 'joingame',
      body,
    ).toPromise()
    .then(v => {
      // player joined
      this.mode = 'player';
      return Promise.resolve(v);
    });
  }

  public startGame(gameId: number, playerId: number) {
    const body = new FormData();
    body.append('game', '' + gameId);
    body.append('player', '' + playerId);

    this.httpClient.post(
      this.API_ROOT + 'startgame',
      body
    ).toPromise()
    .then(v => {
      console.log('success');
    });
  }

  public sendCards(gameId: number, playerId: number, cardIds: Array<number>) {
    const body = new FormData();
    body.append('game', '' + gameId);
    body.append('player', '' + playerId);
    cardIds.forEach(v => {
      body.append('card[]', '' + v);
    });

    this.httpClient.post(
      this.API_ROOT + 'sendcards',
      body
    ).toPromise()
    .then(v => {
      console.log('success');
    });
  }

  public chooseWinner(gameId: number, playerId: number, winnerId: number) {
    const body = new FormData();
    body.append('game', '' + gameId);
    body.append('player', '' + playerId);
    body.append('winner', '' + winnerId);

    this.httpClient.post(
      this.API_ROOT + 'choosewinner',
      body
    ).toPromise()
    .then(v => {
      console.log('success');
    });
  }

  public nextRound(gameId: number, playerId: number) {
    const body = new FormData();
    body.append('game', '' + gameId);
    body.append('player', '' + playerId);

    this.httpClient.post(
      this.API_ROOT + 'nextround',
      body
    ).toPromise()
    .then(v => {
      console.log('success');
    });
  }

  private checkOver(): boolean {
    if (!!this.state && !!this.state.gameState && this.state.gameState === 'OVER') {
      console.log('The game is over');
      localStorage.removeItem('active');
      return true;
    }
    return false;
  }

}
