import { Component, OnInit } from '@angular/core';
import { GameStateService } from '../game-state.service';

@Component({
  selector: 'cah-player',
  templateUrl: './player.component.html',
  styles: []
})
export class PlayerComponent implements OnInit {
  gameId: number;
  playerId: number;

  selectedCards = new Array<number>();
  winnerId: number = null;

  get state() {
    return this.gameState.state;
  }

  constructor(private gameState: GameStateService) { }

  ngOnInit() {
    this.gameId = localStorage['game'];
    this.playerId = localStorage['player'];

    setInterval(() => this.gameState.updatePlayerState(this.gameId, this.playerId), 1000);
  }

  public startGame() {
    if (!this.state['me']['czar']) {
      return;
    }

    this.gameState.startGame(this.gameId, this.playerId);
  }

  public toggleCard(id: number) {
    const i = this.selectedCards.indexOf(id);
    if (i > -1) {
      this.selectedCards.splice(i, 1);
    } else if (this.selectedCards.length < this.gameState.state['blackCard']['cases'].length) {
      this.selectedCards.push(id);
    }
  }

  public sendCards() {
    this.gameState.sendCards(this.gameId, this.playerId, this.selectedCards);
    this.selectedCards = new Array<number>();
  }

  public chooseWinner() {
    if (this.winnerId !== null) {
      this.gameState.chooseWinner(this.gameId, this.playerId, this.winnerId);
    }
  }

  public nextRound(haiku = false) {
    this.gameState.nextRound(this.gameId, this.playerId, haiku);
  }

  reload() {
    window.location.reload();
  }

}
