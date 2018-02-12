import { Component, OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';
import { GameStateService } from '../game-state.service';

@Component({
  selector: 'cah-index',
  templateUrl: './index.component.html',
  styles: []
})
export class IndexComponent implements OnInit {
  private fromQr = false;
  private gameId: number;
  private name: string;

  constructor(private gameState: GameStateService) { }

  ngOnInit() {
    console.log(localStorage);
    if (!!localStorage['game'] && !!localStorage['active']) {
      if (!!localStorage['player']) {
        console.log('going to player mode');
        this.gameState.mode = 'player';
      } else {
        console.log('going to monitor mode');
        this.gameState.mode = 'monitor';
      }
      return;
    }
    console.log('trying to find if navigated through QR code...');

    const urlParams = this.parseSearch(window.location.search);

    if (urlParams !== null && !!urlParams['game']) {
      this.gameId = urlParams['game'];
      this.fromQr = true;
      console.log('...Yes');
    }

    console.log('...No. Proceeding in index mode');
  }

  public createGame(): void {
    this.gameState.createGame()
    .then(v => {
      localStorage['game'] = v['gameId'];
      localStorage['active'] = 'active';
    }).catch(v => {
      console.error(v);
    });
  }

  public join(): void {
    this.gameState.join(this.gameId, this.name)
    .then(v => {
      localStorage['game'] = this.gameId;
      localStorage['player'] = v['me']['id'];
      localStorage['active'] = 'very active';
    }).catch(v => {
      switch (v.status) {
        case 500: alert('Невозможно найти такую игру. Уточните её номер.'); break;
        case 409: alert('Это имя уже используется. Выберите другое'); break;
      }
    });
  }

  private parseSearch(search): Object {
    if (search == null || search.length < 1 || search[0] !== '?') {
      return null;
    }

    const pairs = search.substr(1).split('&');
    const res = new Object();

    pairs.forEach((p) => {
      const tokens = p.split('=');
      res[tokens[0]] = tokens[1];
    });

    return res;
  }
}
