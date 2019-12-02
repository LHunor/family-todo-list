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
  selectedTask: Task;

  tasks: Task[] = [];

  constructor(private taskService: TaskService) { }

  async ngOnInit(): Promise<void> {
    this.selectedStage = '';
    this.tasks = await this.taskService.getTasks();
  	this.filter();
  }

  onFilterChange(stage: string) {
  	this.selectedStage = stage;
  	this.filter();
  }

  onSelectTask(task: Task) {
  	this.selectedTask = task;
  }

  onDeleteClick(id: number) {
    this.taskService.deleteTask(id)
    .then(async () => {
      this.selectedTask = null;
      this.tasks = await this.taskService.getTasks();
      this.filter();
    })
  }

  private filter():void {
  	this.filteredTasks = this.selectedStage === ''
  	? this.tasks : this.tasks.filter(task => task.stage === this.selectedStage);
  }

}
