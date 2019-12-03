import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from '../login/login.component';
import { RegisterComponent } from '../register/register.component';
import { GroupListComponent } from '../group-list/group-list.component';
import { TaskListComponent } from '../task-list/task-list.component';
import { DescriptionComponent } from '../description/description.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/description',
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'groups',
    component: GroupListComponent
  },
  {
    path: 'tasks',
    component: TaskListComponent
  },
  {
    path: 'description',
    component: DescriptionComponent
  }
];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule 
  ]
})
export class RoutingModule { }
