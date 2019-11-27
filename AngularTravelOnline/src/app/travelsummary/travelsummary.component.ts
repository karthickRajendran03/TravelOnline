import { Component, OnInit, ViewChild } from '@angular/core';
import { Travelsummaryresponse } from '../model/travelsummaryresponse.model';
import { TravelsummaryService } from '../services/travelsummary.service';
import { AuthenticationService } from '../services/authentication.service';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';


@Component({
  selector: 'app-travelsummary',
  templateUrl: './travelsummary.component.html',
  styleUrls: ['./travelsummary.component.css']
})
export class TravelsummaryComponent implements OnInit {


notes: Array<Travelsummaryresponse> = [];
errMessage: string;
totalRows: number;
dataSource = new MatTableDataSource<Travelsummaryresponse>(this.notes);
constructor(private travelsummaryService: TravelsummaryService) {
}

  ngOnInit() {
      this.travelsummaryService.getTravelData().subscribe(
              data => this.notes = data,
              err => this.errMessage = 'Http failure response for getNotes(): 404 Not Found'
            );
            console.log(this.notes);
          }

}
