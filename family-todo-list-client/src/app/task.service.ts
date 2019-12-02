import { Injectable } from '@angular/core';
import { Task } from "./task";
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private taskUrl: string = 'http://localhost:8080/tasks';

/*  tasks: Task[] = [
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
  ];*/

  constructor(private http: HttpClient) { }

  getTasks(): Promise<Task[]> {
    return this.http.get<Task[]>(`${this.taskUrl}`).toPromise();
  }

  getTask(id: number): Promise<Task> {
    return this.http.get<Task>(`${this.taskUrl}/${id}`).toPromise();
  }

  createTask(task: Task): Promise<Task> {
    return this.http.post<Task>(`${this.taskUrl}`, task).toPromise();
  }

  updateTask(task: Task): Promise<Task> {
    return this.http.put<Task>(`${this.taskUrl}/${task.id}`, task).toPromise();
  }

  deleteTask(id: number): Promise<Task> {
    return this.http.delete<Task>(`${this.taskUrl}/${id}`).toPromise();
  }
}