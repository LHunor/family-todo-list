import { Injectable } from '@angular/core';
import { Task } from "./task";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  tasks: Task[] = [
    {
      id: 1,
      title: "Mosogatas",
      description: "Mosogasson el vki pls",
      stage: "New",
    },
    {
      id: 2,
      title: "Szakdoga",
      description: "Nem erek ra, valaki irjon meg helyettem",
      stage: "InProgress",
    },
    {
      id: 3,
      title: "Mamalatogatas",
      description: "Kotelezo mindenkinek",
      stage: "New",
    },
    {
      id: 4,
      title: "Porszivozas",
      description: "Por. Sziv. O. Zas.",
      stage: "Done",
    },
  ];

  constructor() { }

  getTasks() {
  	return this.tasks;
  }

  getTaskById(id) {
  	return this.tasks.find(t => t.id == id);
  }
}