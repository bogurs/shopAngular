import {Routes} from '@angular/router';
import {MainComponent} from './home/main/main.component';
import {LoginComponent} from './auth/login/login.component';

export const routes: Routes = [
  { path: '', redirectTo: 'main', pathMatch : 'full'},
  { path: 'main', component: MainComponent },
  { path: 'login', component: LoginComponent}
];
