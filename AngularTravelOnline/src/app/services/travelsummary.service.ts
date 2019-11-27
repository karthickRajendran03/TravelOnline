import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs/BehaviorSubject';
import { Observable } from 'rxjs/Observable';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Travelsummaryresponse } from '../model/travelsummaryresponse.model';
import { AuthenticationService } from '../services/authentication.service';
import { tap } from 'rxjs/operators';

const USER_API_URL = 'http://localhost:8091/api/getUserTravelSummary/';
const ADMIN_API_URL = 'http://localhost:8091/api/getAdminTravelSummary';

@Injectable({
  providedIn: 'root'
})
export class TravelsummaryService {
notes: Array<Travelsummaryresponse>;
note: Travelsummaryresponse = new Travelsummaryresponse();
noteSubject: BehaviorSubject<Array<Travelsummaryresponse>>;
token: any;
userRole: any;

  constructor(private http: HttpClient, private _authService: AuthenticationService) {
      this.notes = [];
      this.noteSubject = new BehaviorSubject(this.notes);
  }

  fetchTravelSummary() {
      this.token = this._authService.getBearerToken();
      this.userRole = this._authService.getUserRole();
      let uri;
      console.log('FFFFFFFFFFFFFFFFF' + this.userRole);
      if (this.userRole === 'USER') {
        uri = USER_API_URL + this._authService.getUserId();
      } else {
        uri  = ADMIN_API_URL;
      }
      return this.http.get<Array<Travelsummaryresponse>>(uri, {
        headers: new HttpHeaders().set('Authorization', `Bearer ${this.token}`)
      }).subscribe(notes => {
        this.notes = notes;
        console.log('BBBBBBBBBBBBBBBBBBBBBBBBBBBB' + notes[0].fromPlace);
        this.noteSubject.next(this.notes);
      });
    }

  getTravelData(): BehaviorSubject<Array<Travelsummaryresponse>> {
      return this.noteSubject;
    }
}
