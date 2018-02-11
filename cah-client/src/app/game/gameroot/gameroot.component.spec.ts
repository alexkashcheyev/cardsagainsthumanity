import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GamerootComponent } from './gameroot.component';

describe('GamerootComponent', () => {
  let component: GamerootComponent;
  let fixture: ComponentFixture<GamerootComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GamerootComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GamerootComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
