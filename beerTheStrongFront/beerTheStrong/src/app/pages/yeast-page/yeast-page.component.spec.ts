import { ComponentFixture, TestBed } from '@angular/core/testing';

import { YeastPageComponent } from './yeast-page.component';

describe('YeastPageComponent', () => {
  let component: YeastPageComponent;
  let fixture: ComponentFixture<YeastPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ YeastPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(YeastPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
