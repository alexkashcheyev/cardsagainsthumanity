import { Component, OnInit } from '@angular/core';
import { GameStateService } from '../game-state.service';

@Component({
  selector: 'cah-monitor',
  templateUrl: './monitor.component.html',
  styles: []
})
export class MonitorComponent implements OnInit {
  private get state() {
    return this.gameState.state;
  }

  constructor(private gameState: GameStateService) {
  }

  reload() {
    window.location.reload();
  }

  ngOnInit() {
    const gameId = localStorage['game'];
    setInterval(
      () => this.gameState.updateMonitorState(gameId),
      3000
    );
  }

}
