import { Component, OnChanges, Input, Output, EventEmitter } from '@angular/core';
import { Task } from '../task';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-new-task-page',
  templateUrl: './new-task-page.component.html',
  styleUrls: ['./new-task-page.component.css']
})
export class NewTaskPageComponent implements OnChanges {

  @Input() task: Task;
  public model: Task;
  @Output() onSubmit = new EventEmitter<Task>();

  constructor() {}

  ngOnChanges(): void {
    this.model = Object.assign({}, this.task);
  }

  submit(form: NgForm): void {
    if (!form.valid) {
      return;
    }
    this.onSubmit.emit(this.model);
  }

}
