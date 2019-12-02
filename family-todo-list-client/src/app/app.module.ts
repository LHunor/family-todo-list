import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FlexLayoutModule } from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { MatToolbarModule, MatIconModule, MatButtonModule, MatFormFieldModule, MatButtonToggleModule, MatMenuModule } from '@angular/material';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { DashboardPageComponent } from './dashboard-page/dashboard-page.component';
import { NewTaskPageComponent } from './new-task-page/new-task-page.component';
import { EditTaskPageComponent } from './edit-task-page/edit-task-page.component';
import { UserProfilePageComponent } from './user-profile-page/user-profile-page.component';
import { TaskListComponent } from './task-list/task-list.component';
import { CalendarComponent } from './calendar/calendar.component';
import { NewCommentsListComponent } from './new-comments-list/new-comments-list.component';
import { StageFilterComponent } from './stage-filter/stage-filter.component';

@NgModule({
  declarations: [
    AppComponent,
    DashboardPageComponent,
    NewTaskPageComponent,
    EditTaskPageComponent,
    UserProfilePageComponent,
    TaskListComponent,
    CalendarComponent,
    NewCommentsListComponent,
    StageFilterComponent
  ],
  imports: [
    NgbModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserModule,
    BrowserAnimationsModule,
    FlexLayoutModule,
    HttpClientModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    MatButtonToggleModule,
    MatFormFieldModule,
    MatMenuModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
