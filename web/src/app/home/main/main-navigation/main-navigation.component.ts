import { Component, OnInit } from '@angular/core';
import {LoginComponent} from '../../../auth/login/login.component';
import {MatDialog} from '@angular/material';

@Component({
  selector: 'app-main-navigation',
  templateUrl: './main-navigation.component.html'
})
export class MainNavigationComponent implements OnInit {

  constructor(
    private dialog: MatDialog
  ) { }

  ngOnInit() {
  }

  onClickLogin() {
    const width = '270';
    const height = '310';
    const opt = {
      width,
      height
    };
    const dr = this.dialog.open(LoginComponent, {
      width: width + 'px',
      height: height + 'px',
      data: opt,
      disableClose: true
    });
    dr.afterClosed().subscribe(res => {
      if (res) {
      }
    });
  }
}
