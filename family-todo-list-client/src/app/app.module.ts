import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DescriptionComponent } from './description/description.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { GroupListComponent } from './group-list/group-list.component';
import { TaskListComponent } from './task-list/task-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatToolbarModule, MatIconModule, MatButtonModule } from '@angular/material';

import {FlexLayoutModule} from '@angular/flex-layout';

import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import { RoutingModule } from './routing/routing.module';



@NgModule({
  declarations: [
    AppComponent,
    DescriptionComponent,
    LoginComponent,
    GroupListComponent,
    TaskListComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule, MatIconModule, MatButtonModule,
    FlexLayoutModule,
    NgbModule,
    RoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
