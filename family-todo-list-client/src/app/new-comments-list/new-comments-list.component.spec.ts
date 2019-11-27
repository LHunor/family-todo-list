import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewCommentsListComponent } from './new-comments-list.component';

describe('NewCommentsListComponent', () => {
  let component: NewCommentsListComponent;
  let fixture: ComponentFixture<NewCommentsListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewCommentsListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewCommentsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
