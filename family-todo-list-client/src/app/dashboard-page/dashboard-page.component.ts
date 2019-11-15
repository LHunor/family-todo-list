import { Component, OnInit } from '@angular/core';
import { TaskListComponent } from '../task-list/task-list.component';
import { CalendarComponent } from '../calendar/calendar.component';
import { NewCommentsList } from '../new-comments-list/new-comments-list.component';

@Component({
  selector: 'app-dashboard-page',
  templateUrl: './dashboard-page.component.html',
  styleUrls: ['./dashboard-page.component.css']
})
export class DashboardPageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
