import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StageFilterComponent } from './stage-filter.component';

describe('StageFilterComponent', () => {
  let component: StageFilterComponent;
  let fixture: ComponentFixture<StageFilterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StageFilterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StageFilterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
