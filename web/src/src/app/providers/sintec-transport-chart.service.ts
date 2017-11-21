import {Injectable} from '@angular/core';
import {BehaviorSubject} from "rxjs/BehaviorSubject";

@Injectable()
export class SintecTransportDataChartService {

  private data = new BehaviorSubject<any>([]);
  currentData = this.data.asObservable();

  constructor() {

  }

  sendData(inData: any) {
    this.data.next(inData)
  }

}
