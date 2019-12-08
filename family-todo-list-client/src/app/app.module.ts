import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {FlexLayoutModule} from '@angular/flex-layout';
import { HttpClientModule } from '@angular/common/http';

import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { MatToolbarModule, MatIconModule, MatButtonModule, MatFormFieldModule, MatButtonToggleModule, MatMenuModule, MatButtonToggleGroup } from '@angular/material';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { DescriptionComponent } from './description/description.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { GroupListComponent } from './group-list/group-list.component';
import { TaskListComponent } from './task-list/task-list.component';

import { RoutingModule } from './routing/routing.module';
import { StageFilterComponent } from './stage-filter/stage-filter.component';
import { TaskFormComponent } from './task-form/task-form.component';



@NgModule({
  declarations: [
    AppComponent,
    DescriptionComponent,
    LoginComponent,
    GroupListComponent,
    TaskListComponent,
    RegisterComponent,
    StageFilterComponent,
    TaskFormComponent
  ],
  imports: [
    NgbModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserModule,
    BrowserAnimationsModule,
    FlexLayoutModule,
    HttpClientModule,
    AppRoutingModule,
    RoutingModule,
    MatToolbarModule, MatIconModule, MatButtonModule, 
    MatButtonToggleModule, MatFormFieldModule, MatMenuModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
