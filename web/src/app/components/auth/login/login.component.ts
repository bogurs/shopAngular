import { Component, OnInit } from '@angular/core';
import {AuthService} from '../../../services/auth.service';
import {Auth} from '../../model/auth';
import {environment} from '../../../../environments/environment';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html'
})
export class LoginComponent implements OnInit {
  apiUrl = environment.apiUrl;
  customerId: string;
  customerPw: string;
  auth: Auth;

  constructor(
    private authService: AuthService
  ) { }

  ngOnInit() {
    this.auth = new Auth();
  }

  onClickLogin() {
    if (this.customerId) {
      if (this.customerPw) {
        this.auth.customerId = this.customerId;
        this.auth.customerPw = this.customerPw;
        const url = '/auth/login';
        this.authService.postUserLoginByAuth(this.apiUrl + url, this.auth)
          .subscribe((res) => {
            console.log('로그인 성공' + res);
          }, (error) => {
            console.log('로그인 실패\n' + error);
          });
      } else {
        console.log('PW를 입력하시오');
      }
    } else {
      console.log('ID를 입력하시오');
    }
  }
}
