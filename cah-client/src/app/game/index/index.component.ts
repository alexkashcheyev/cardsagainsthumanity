import { Component, OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';
import { GameStateService } from '../game-state.service';

@Component({
  selector: 'cah-index',
  templateUrl: './index.component.html',
  styles: []
})
export class IndexComponent implements OnInit {

  private gameId: number;
  private name: string;

  constructor(private gameState: GameStateService) { }

  ngOnInit() {
    // todo: check if url parameter is present, and use it
  }

  public createGame(): void {
    this.gameState.createGame()
    .then(v => {
      localStorage['game'] = v['gameId'];
    }).catch(v => {
      console.error(v);
    });
  }

  public join(): void {
    this.gameState.join(this.gameId, this.name)
    .then(v => {
      localStorage['game'] = this.gameId;
      localStorage['player'] = v['me']['id'];
    }).catch(v => {
      console.error(v);
    });
  }

}
