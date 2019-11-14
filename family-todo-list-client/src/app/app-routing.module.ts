import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardPageComponent } from './dashboard-page/dashboard-page.component';
import { NewTaskPageComponent } from './new-task-page/new-task-page.component';
import { EditTaskPageComponent } from './edit-task-page/edit-task-page.component';
import { UserProfilePageComponent } from './user-profile-page/user-profile-page.component';

const routes: Routes = [
	{ path: '', redirectTo: '/dashboard', pathMatch: 'full' },
	{ path: 'dashboard', component: DashboardPageComponent },
	{ path: 'new', component: NewTaskPageComponent },
	{ path: 'edit/:id', component: EditTaskPageComponent },
	{ path: 'profile', component: UserProfilePageComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
