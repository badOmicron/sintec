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
  registrosSellthough: Sellthrough[] = [new Sellthrough];


  chart = new Chart({
    chart: {
      type: 'line'
    },
    title: {
      text: 'Desplazamiento de inventarios'
    },
    credits: {
      enabled: false
    },
    series: [{
      name: 'SKU',
      data: [0]
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
    console.log(this.registrosSellthough.length);
    this.chart.addPoint(this.registrosSellthough.length);
  }

}
