import { Component, OnInit } from '@angular/core';
import { Task } from "../task";
import { TaskService } from "../task.service";
import { Stage } from '../stage';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {
  filteredTasks: Task[];
  selectedStage: Stage;
  selectedTask: Task;

  tasks: Task[] = [];

  constructor(private taskService: TaskService) { }

  async ngOnInit(): Promise<void> {
    this.selectedStage = null;
    this.tasks = await this.taskService.getTasks();
  	this.filter();
  }

  onFilterChange(stage: Stage) {
  	this.selectedStage = stage;
  	this.filter();
  }

  onSelectTask(task: Task) {
    if (this.selectedTask == task) this.selectedTask = null;
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

  onNewClick(): void {
    this.selectedTask = new Task();
  }

  async onFormSubmit(task: Task): Promise<void> {
    if (task.id > 0) {
      await this.taskService.updateTask(task)
      this.selectedTask.title = task.title;
      this.selectedTask.description = task.description;;
    } else {
      this.selectedTask.id = Math.floor(Math.random()*1000000);
      this.selectedTask.title = task.title;
      this.selectedTask.description = task.description;
      this.selectedTask.stage = new Stage("NEW");
      this.taskService.createTask(task).then(createdTask => { this.tasks.push(createdTask)});
    }
    this.selectedTask = null;
  }

  private filter():void {
  	this.filteredTasks = this.selectedStage == null
  	? this.tasks : this.tasks.filter(task => task.stage === this.selectedStage);
  }

}