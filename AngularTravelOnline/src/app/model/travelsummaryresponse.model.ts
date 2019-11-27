export class Travelsummaryresponse {
    id: number;
    userId: string;
    fromPlace: string;
    toPlace: string;
    city: string;
    paymentMode: string;
    travelFromDate: Date;
    travelToDate: Date;
    amount: number;


constructor() {
    this.userId = '';
    this.fromPlace = '';
    this.toPlace = '';
    this.city = '';
    this.paymentMode = '';
    this.amount = 0;
}
}
