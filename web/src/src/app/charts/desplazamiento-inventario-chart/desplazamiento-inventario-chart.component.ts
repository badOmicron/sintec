import {Component, OnInit} from '@angular/core';
import {Chart} from "angular-highcharts";
import {SintecTransportDataChartService} from "../../providers/sintec-transport-chart.service";
import {Sellthrough} from "../../model/desplazamiento-inventario/Sellthrough";

@Component({
  selector: 'app-desplazamiento-inventario-chart',
  templateUrl: './desplazamiento-inventario-chart.component.html',
  styleUrls: ['./desplazamiento-inventario-chart.component.css']
})
export class DesplazamientoInventarioChartComponent implements OnInit {
  data: Sellthrough[] = [new Sellthrough];


  chart = new Chart({
    chart: {
      type: 'line'
    },
    title: {
      text: 'Linechart'
    },
    credits: {
      enabled: false
    },
    series: [{
      name: 'Line 1',
      data: [this.data]
    }]
  });

  constructor(private sintecTransportDataServie: SintecTransportDataChartService) {
  }

  ngOnInit() {
    this.sintecTransportDataServie.currentData.subscribe(data => this.addData(data));
  }

  // add point to chart serie
  add() {
    this.chart.addPoint(Math.floor(Math.random() * 10));
  }

  addData(data: any) {
    console.log('recibiendo información');
    console.log(data);
    this.chart.addPoint(data);
  }

}
