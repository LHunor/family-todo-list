import { Component, OnInit } from '@angular/core';
import { Task } from "../task";
import { TaskService } from "../task.service";

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {
  filteredTasks: Task[];
  selectedStage: string;

  tasks: Task[] = [];
  selectedTask: Task;

  constructor(private taskService: TaskService) { 
    this.tasks = taskService.getTasks();
  }

  ngOnInit() {
  	this.selectedStage = '';
  	this.filter();
  }

  onFilterChange(stage) {
  	this.selectedStage = stage;
  	this.filter();
  }

  onSelectTask(task) {
  	this.selectedTask = task;
  }

  filter() {
  	this.filteredTasks = this.selectedStage === ''
  	? this.tasks : this.tasks.filter(task => task.stage === this.selectedStage)
  }

}
