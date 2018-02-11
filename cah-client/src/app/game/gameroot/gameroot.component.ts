import { Component, OnInit } from '@angular/core';
import { GameStateService } from './../game-state.service';

@Component({
  selector: 'cah-gameroot',
  templateUrl: './gameroot.component.html',
  styles: []
})
export class GamerootComponent implements OnInit {

  private get mode() {
    return this.gameState.mode;
  }

  constructor(private gameState: GameStateService) { }

  ngOnInit() {
  }

}
