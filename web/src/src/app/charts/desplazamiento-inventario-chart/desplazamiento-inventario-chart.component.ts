import {Component, OnInit} from '@angular/core';
import {Chart} from "angular-highcharts";

@Component({
  selector: 'app-desplazamiento-inventario-chart',
  templateUrl: './desplazamiento-inventario-chart.component.html',
  styleUrls: ['./desplazamiento-inventario-chart.component.css']
})
export class DesplazamientoInventarioChartComponent implements OnInit {

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
      data: [1, 2, 3]
    }]
  });

  constructor() {
  }

  ngOnInit() {

  }

  // add point to chart serie
  add() {
    this.chart.addPoint(Math.floor(Math.random() * 10));
  }

}
