import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DashboardPageComponent } from './dashboard-page/dashboard-page.component';
import { NewTaskPageComponent } from './new-task-page/new-task-page.component';
import { EditTaskPageComponent } from './edit-task-page/edit-task-page.component';
import { UserProfilePageComponent } from './user-profile-page/user-profile-page.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule, MatIconModule, MatButtonModule } from '@angular/material';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { TaskListComponent } from './task-list/task-list.component';
import { CalendarComponent } from './calendar/calendar.component';
import { NewCommentsListComponent } from './new-comments-list/new-comments-list.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardPageComponent,
    NewTaskPageComponent,
    EditTaskPageComponent,
    UserProfilePageComponent,
    TaskListComponent,
    CalendarComponent,
    NewCommentsListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
