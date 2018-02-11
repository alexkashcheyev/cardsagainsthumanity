import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GamerootComponent } from './gameroot/gameroot.component';
import { GameStateService } from './game-state.service';
import { IndexComponent } from './index/index.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { PlayerComponent } from './player/player.component';
import { MonitorComponent } from './monitor/monitor.component';
import { PlayerlistComponent } from './playerlist/playerlist.component';
import { JokeComponent } from './joke/joke.component';
import { UnderscorePipe } from './underscore.pipe';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule
  ],
  declarations: [GamerootComponent, IndexComponent, PlayerComponent, MonitorComponent, PlayerlistComponent, JokeComponent, UnderscorePipe],
  exports: [GamerootComponent],
  providers: [GameStateService]
})
export class GameModule { }
