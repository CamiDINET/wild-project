import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HopPageComponent } from './hop-page.component';

describe('HopPageComponent', () => {
  let component: HopPageComponent;
  let fixture: ComponentFixture<HopPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HopPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HopPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
