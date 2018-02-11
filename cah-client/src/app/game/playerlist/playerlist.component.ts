import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'cah-playerlist',
  templateUrl: './playerlist.component.html',
  styles: []
})
export class PlayerlistComponent implements OnInit {
  @Input() players: Iterable<any>;

  constructor() { }

  ngOnInit() {
  }

}
