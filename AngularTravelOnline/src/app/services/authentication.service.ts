import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';


@Injectable()
export class AuthenticationService {

  constructor(private http: HttpClient) { }

  isUserAuthenticated(token): Promise<boolean> {
      const headers = new HttpHeaders({
          'Authorization': `Bearer ${token}`,
          'Content-Type': 'application/json',
          'Access-Control-Allow-Origin': '*'
       });
      const options = {
              headers: headers
           };
    return this.http.post('http://localhost:9300/api/v1/auth/isAuthenticated', {}, options)
    .map((res) => res['isAuthenticated'])
    .toPromise();
   }

  authenticateUser(data) {
    console.log(data);
    return this.http.post('http://localhost:9300/api/v1/auth/login/', data);
  }

  setBearerToken(token) {
    localStorage.setItem('bearerToken', token);
  }

  getBearerToken() {
    return localStorage.getItem('bearerToken');
  }

  setUserId(userId) {
    localStorage.setItem('userId', userId);
  }

  getUserId() {
    return localStorage.getItem('userId');
  }

  setUserRole(userRole) {
     localStorage.setItem('userRole', userRole);
  }

  getUserRole() {
     return localStorage.getItem('userRole');
   }
}
