import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VariousPageComponent } from './various-page.component';

describe('VariousPageComponent', () => {
  let component: VariousPageComponent;
  let fixture: ComponentFixture<VariousPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VariousPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VariousPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
