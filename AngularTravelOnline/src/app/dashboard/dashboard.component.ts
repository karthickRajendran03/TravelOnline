import { Component, OnInit } from '@angular/core';
import { TravelsummaryService } from '../services/travelsummary.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

    constructor(private travelsummaryservice: TravelsummaryService) {
        this.travelsummaryservice.fetchTravelSummary();
       }
     errMessage: string;

  ngOnInit() {
      this.travelsummaryservice.fetchTravelSummary();
  }

}
