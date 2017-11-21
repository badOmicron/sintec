import {Component, OnDestroy, OnInit} from '@angular/core';
import {AmChart, AmChartsService} from "@amcharts/amcharts3-angular";


@Component({
  selector: 'app-heat-chart',
  templateUrl: './heat-chart.component.html',
  styleUrls: ['./heat-chart.component.css']
})
export class HeatChartComponent implements OnInit, OnDestroy {
  public options: any;
  private chart2: AmChart;
  private timer: number;
  private chartMap: AmChart;

  // Prepare random data
  constructor(private AmCharts: AmChartsService) {
  }

  ngOnInit() {
    // Create chartdiv1
    this.options = this.makeOptions(this.makeRandomDataProvider());
    // Create chartdiv2
    this.chart2 = this.AmCharts.makeChart("chartdiv2", this.makeOptions(this.makeRandomDataProvider()));
    this.timer = setInterval(() => {
      // Update chartdiv1
      this.options = this.makeOptions(this.makeRandomDataProvider());

      // Update chartdiv2
      this.AmCharts.updateChart(this.chart2, () => {
        this.chart2.dataProvider = this.makeRandomDataProvider();
      });
    }, 3000);

    this.chartMap = this.AmCharts.makeChart("chartdiv", {
      "type": "map",
      "theme": "light",
      "colorSteps": 10,

      "dataProvider": {
        "map": "usaLow",
        "areas": [{
          "id": "US-AL",
          "value": 4447100
        }, {
          "id": "US-AK",
          "value": 626932
        }, {
          "id": "US-AZ",
          "value": 5130632
        }, {
          "id": "US-AR",
          "value": 2673400
        }, {
          "id": "US-CA",
          "value": 33871648
        }, {
          "id": "US-CO",
          "value": 4301261
        }, {
          "id": "US-CT",
          "value": 3405565
        }, {
          "id": "US-DE",
          "value": 783600
        }, {
          "id": "US-FL",
          "value": 15982378
        }, {
          "id": "US-GA",
          "value": 8186453
        }, {
          "id": "US-HI",
          "value": 1211537
        }, {
          "id": "US-ID",
          "value": 1293953
        }, {
          "id": "US-IL",
          "value": 12419293
        }, {
          "id": "US-IN",
          "value": 6080485
        }, {
          "id": "US-IA",
          "value": 2926324
        }, {
          "id": "US-KS",
          "value": 2688418
        }, {
          "id": "US-KY",
          "value": 4041769
        }, {
          "id": "US-LA",
          "value": 4468976
        }, {
          "id": "US-ME",
          "value": 1274923
        }, {
          "id": "US-MD",
          "value": 5296486
        }, {
          "id": "US-MA",
          "value": 6349097
        }, {
          "id": "US-MI",
          "value": 9938444
        }, {
          "id": "US-MN",
          "value": 4919479
        }, {
          "id": "US-MS",
          "value": 2844658
        }, {
          "id": "US-MO",
          "value": 5595211
        }, {
          "id": "US-MT",
          "value": 902195
        }, {
          "id": "US-NE",
          "value": 1711263
        }, {
          "id": "US-NV",
          "value": 1998257
        }, {
          "id": "US-NH",
          "value": 1235786
        }, {
          "id": "US-NJ",
          "value": 8414350
        }, {
          "id": "US-NM",
          "value": 1819046
        }, {
          "id": "US-NY",
          "value": 18976457
        }, {
          "id": "US-NC",
          "value": 8049313
        }, {
          "id": "US-ND",
          "value": 642200
        }, {
          "id": "US-OH",
          "value": 11353140
        }, {
          "id": "US-OK",
          "value": 3450654
        }, {
          "id": "US-OR",
          "value": 3421399
        }, {
          "id": "US-PA",
          "value": 12281054
        }, {
          "id": "US-RI",
          "value": 1048319
        }, {
          "id": "US-SC",
          "value": 4012012
        }, {
          "id": "US-SD",
          "value": 754844
        }, {
          "id": "US-TN",
          "value": 5689283
        }, {
          "id": "US-TX",
          "value": 20851820
        }, {
          "id": "US-UT",
          "value": 2233169
        }, {
          "id": "US-VT",
          "value": 608827
        }, {
          "id": "US-VA",
          "value": 7078515
        }, {
          "id": "US-WA",
          "value": 5894121
        }, {
          "id": "US-WV",
          "value": 1808344
        }, {
          "id": "US-WI",
          "value": 5363675
        }, {
          "id": "US-WY",
          "value": 493782
        }]
      },

      "areasSettings": {
        "autoZoom": true
      },

      "valueLegend": {
        "right": 10,
        "minValue": "little",
        "maxValue": "a lot!"
      },

      "export": {
        "enabled": true
      }

    });
  }

  ngOnDestroy() {
    clearInterval(this.timer);
    // Cleanup chartdiv2
    if (this.chart2) {
      this.AmCharts.destroyChart(this.chart2);
    }

  }

  makeRandomDataProvider() {
    const dataProvider = [];

    // Generate random data
    for (let year = 1950; year <= 2005; ++year) {
      dataProvider.push({
        year: "" + year,
        value: Math.floor(Math.random() * 100) - 50
      });
    }
    return dataProvider;
  }

  makeOptions(dataProvider) {
    return {
      "type": "serial",
      "theme": "light",
      "marginTop": 0,
      "marginRight": 80,
      "dataProvider": dataProvider,
      "valueAxes": [{
        "axisAlpha": 0,
        "position": "left"
      }],
      "graphs": [{
        "id": "g1",
        "balloonText": "[[category]]<br><b><span style='font-size:14px;'>[[value]]</span></b>",
        "bullet": "round",
        "bulletSize": 8,
        "lineColor": "#d1655d",
        "lineThickness": 2,
        "negativeLineColor": "#637bb6",
        "type": "smoothedLine",
        "valueField": "value"
      }],
      "chartScrollbar": {
        "graph": "g1",
        "gridAlpha": 0,
        "color": "#888888",
        "scrollbarHeight": 55,
        "backgroundAlpha": 0,
        "selectedBackgroundAlpha": 0.1,
        "selectedBackgroundColor": "#888888",
        "graphFillAlpha": 0,
        "autoGridCount": true,
        "selectedGraphFillAlpha": 0,
        "graphLineAlpha": 0.2,
        "graphLineColor": "#c2c2c2",
        "selectedGraphLineColor": "#888888",
        "selectedGraphLineAlpha": 1
      },
      "chartCursor": {
        "categoryBalloonDateFormat": "YYYY",
        "cursorAlpha": 0,
        "valueLineEnabled": true,
        "valueLineBalloonEnabled": true,
        "valueLineAlpha": 0.5,
        "fullWidth": true
      },
      "dataDateFormat": "YYYY",
      "categoryField": "year",
      "categoryAxis": {
        "minPeriod": "YYYY",
        "parseDates": true,
        "minorGridAlpha": 0.1,
        "minorGridEnabled": true
      },
      "export": {
        "enabled": true
      }
    };
  }


}
