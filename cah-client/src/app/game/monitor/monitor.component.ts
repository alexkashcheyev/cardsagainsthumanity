import { Component, OnInit } from '@angular/core';
import { GameStateService } from '../game-state.service';

@Component({
  selector: 'cah-monitor',
  templateUrl: './monitor.component.html',
  styles: []
})
export class MonitorComponent implements OnInit {
  get state() {
    return this.gameState.state;

    // // Lobby
    // return {
    //   gameState: 'LOBBY',
    //   gameId: 42,
    //   players: [
    //     {czar: true, name: 'Player 1', points: 0},
    //     {czar: false, name: 'Player 2', points: 0},
    //     {czar: false, name: 'Player 3', points: 0},
    //     {czar: false, name: 'Player 5', points: 0},
    //     {czar: false, name: 'Player 6', points: 0},
    //     {czar: false, name: 'Player 7', points: 0},
    //     {czar: false, name: 'Player 8', points: 0},
    //     {czar: false, name: 'Player 9', points: 0}
    //   ]
    // };

    // // Round start
    // return {
    //   gameState: 'ROUND_START',
    //   gameId: 42,
    //   blackCard: {
    //     id: 69,
    //     text: '__! Как много в этом звуке!',
    //     cases: ['NOMINATIVE']
    //   },
    //   players: [
    //     {czar: true, name: 'Player 1', points: 0},
    //     {czar: false, name: 'Player 2', points: 0},
    //     {czar: false, name: 'Player 3', points: 0},
    //     {czar: false, name: 'Player 5', points: 0},
    //     {czar: false, name: 'Player 6', points: 0},
    //     {czar: false, name: 'Player 7', points: 0},
    //     {czar: false, name: 'Player 8', points: 0},
    //     {czar: false, name: 'Player 9', points: 0}
    //   ]
    // };

    // // Round end
    // return {
    //   gameState: 'ROUND_NEXT',
    //   gameId: 42,
    //   winnerId: 7,
    //   blackCard: {
    //     id: 69,
    //     text: '__ - это скользкая дорожка, которая непременно в итоге приведёт тебя к проституции.',
    //     cases: ['NOMINATIVE']
    //   },
    //   players: [
    //     {
    //       id: 1,
    //       czar: true,
    //       name: 'Player 1',
    //       points: 10,
    //     },
    //     {
    //       id: 2,
    //       czar: false,
    //       name: 'Player 2',
    //       points: 15,
    //       sentCards: [{
    //         id: 1,
    //         cases: {
    //           NOMINATIVE: 'клитор'
    //         }
    //       }]
    //     },
    //     {
    //       id: 3,
    //       czar: false,
    //       name: 'Player 3',
    //       points: 15,
    //       sentCards: [{
    //         id: 3,
    //         cases: {
    //           NOMINATIVE: 'рожок'
    //         }
    //       }]
    //     },
    //     {
    //       id: 4,
    //       czar: false,
    //       name: 'Player 4',
    //       points: 15,
    //       sentCards: [{
    //         id: 4,
    //         cases: {
    //           NOMINATIVE: 'урод'
    //         }
    //       }]
    //     },
    //     {
    //       id: 5,
    //       czar: false,
    //       name: 'Player 5',
    //       points: 15,
    //       sentCards: [{
    //         id: 5,
    //         cases: {
    //           NOMINATIVE: 'Гитлер'
    //         }
    //       }]
    //     },
    //     {
    //       id: 6,
    //       czar: false,
    //       name: 'Player 6',
    //       points: 15,
    //       sentCards: [{
    //         id: 6,
    //         cases: {
    //           NOMINATIVE: 'минет'
    //         }
    //       }]
    //     },
    //     {
    //       id: 7,
    //       czar: false,
    //       name: 'Player 7',
    //       points: 15,
    //       sentCards: [{
    //         id: 7,
    //         cases: {
    //           NOMINATIVE: 'кабан'
    //         }
    //       }]
    //     },
    //     {
    //       id: 8,
    //       czar: false,
    //       name: 'Player 8',
    //       points: 15,
    //       sentCards: [{
    //         id: 8,
    //         cases: {
    //           NOMINATIVE: 'салат'
    //         }
    //       }]
    //     },
    //     {
    //       id: 9,
    //       czar: false,
    //       name: 'Player 9',
    //       points: 15,
    //       sentCards: [{
    //         id: 9,
    //         cases: {
    //           NOMINATIVE: 'урюк'
    //         }
    //       }]
    //     },
    //   ]
    // };

    // // Round start
    // return {
    //   gameState: 'OVER',
    //   gameId: 42,
    //   blackCard: {
    //     id: 69,
    //     text: '__! Как много в этом звуке!',
    //     cases: ['NOMINATIVE']
    //   },
    //   players: [
    //     {czar: true, name: 'Player 1', points: 0},
    //     {czar: false, name: 'Player 2', points: 0},
    //     {czar: false, name: 'Player 3', points: 0},
    //     {czar: false, name: 'Player 5', points: 0},
    //     {czar: false, name: 'Player 6', points: 0},
    //     {czar: false, name: 'Player 7', points: 0},
    //     {czar: false, name: 'Player 8', points: 0},
    //     {czar: false, name: 'Player 9', points: 0}
    //   ]
    // };

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
