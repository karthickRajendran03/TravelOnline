import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../services/authentication.service';

@Component({
  selector: 'app-authorised-top-nav',
  templateUrl: './authorised-top-nav.component.html',
  styleUrls: ['./authorised-top-nav.component.css']
})
export class AuthorisedTopNavComponent implements OnInit {
  userId: any;
  constructor(private _authService: AuthenticationService) {
      this.userId = this._authService.getUserId();
  }

  ngOnInit() {
  }

}
