import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TravelsummaryComponent } from './travelsummary.component';

describe('TravelsummaryComponent', () => {
  let component: TravelsummaryComponent;
  let fixture: ComponentFixture<TravelsummaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TravelsummaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TravelsummaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
