import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MaltPageComponent } from './malt-page.component';

describe('MaltPageComponent', () => {
  let component: MaltPageComponent;
  let fixture: ComponentFixture<MaltPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MaltPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MaltPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
