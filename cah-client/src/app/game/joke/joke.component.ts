import { Component, OnInit, Input } from '@angular/core';
import { JokePart } from './joke-part';

@Component({
  selector: 'cah-joke',
  templateUrl: './joke.component.html',
  styles: []
})
export class JokeComponent implements OnInit {
  @Input() blackcard: any;
  @Input() player: any;

  getJokeParts(): Array<JokePart> {
    const whiteCards = this['player']['sentCards'];
    const whiteParts = Array<string>();
    const blackParts = this.blackcard['text'].split(new RegExp('_+'));
    const capitals = this.getCapitals(this.blackcard['text']);
    const res = Array<JokePart>();

    for (let i = 0; i < whiteCards.length; i++) {
      const theCase = this.blackcard['cases'][i];
      const ws = whiteCards[i];
      whiteParts.push(ws['cases'][theCase]);
    }

    let w = 0;
    let b = 0;
    let blackTurn = this.blackcard['text'][0] !== '_';

    while (w < whiteParts.length || b < blackParts.length) {
      if (blackTurn && b < blackParts.length) {
        res.push({isBlack: true, text: blackParts[b]});
        b++;
      } else if (w < whiteParts.length) {
        res.push({isBlack: false, text: this.buildWhitePart(whiteParts[w], capitals[w])});
        w++;
      }
      blackTurn = !blackTurn;
    }

    return res;
  }

  private getCapitals(s: string): Array<boolean> {
    const underscores = s.match(new RegExp(/_+/g));
    return underscores.map(v => v.length > 1);
  }

  private buildWhitePart(s: string, isCapital: boolean): string {
    if (!isCapital) {
      return s;
    } else {
      return s[0].toUpperCase() + s.substr(1);
    }
  }

  constructor() { }

  ngOnInit() {
  }

}
