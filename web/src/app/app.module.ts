import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {routes} from './app-routing.module';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { MainComponent } from './components/home/main/main.component';
import { MainNavigationComponent } from './components/home/main/main-navigation/main-navigation.component';
import { MainFooterComponent } from './components/home/main/main-footer/main-footer.component';
import { MainContentComponent } from './components/home/main/main-content/main-content.component';
import {HttpClientModule} from '@angular/common/http';
import {AuthModule} from './components/auth/auth.module';

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    MainNavigationComponent,
    MainFooterComponent,
    MainContentComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    NgbModule,
    HttpClientModule,
    AuthModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
