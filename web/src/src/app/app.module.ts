/*
 *      File: app.module.ts
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 15, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {NavbarComponent} from './components/navbar/navbar.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {BrowserAnimationsModule, NoopAnimationsModule} from '@angular/platform-browser/animations';
import {AppRoutingModule} from './routing/routing.module';

import {LineChartDemoComponent} from './commons/line-chart-demo/line-chart-demo.component';
import {DesplazamientoInventarioService} from './providers/DesplazamientoInventarioService';
import {HttpModule} from '@angular/http';
import {FormControlDirective, FormGroupDirective, FormsModule, ReactiveFormsModule} from '@angular/forms';
import {ReporteDesplazamientoInventarioComponent} from './reporte-desplazamiento-inventario/reporte-desplazamiento-inventario.component';
import {ChartModule, HIGHCHARTS_MODULES} from 'angular-highcharts';
import {DesplazamientoInventarioChartComponent} from './charts/desplazamiento-inventario-chart/desplazamiento-inventario-chart.component';
import {ScatterPlotChartComponent} from './charts/scatter-plot-chart/scatter-plot-chart.component';
import exporting from 'highcharts/modules/exporting.src.js';
import {NgbDatepickerModule, NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {HeatChartComponent} from './charts/heat-chart/heat-chart.component';
import {AmChartsModule} from "@amcharts/amcharts3-angular";
import {CatalogoService} from "./providers/catalogo.service";


/**
 * Mòdulo principal de la aplicación.
 */
@NgModule({
  // Se importan módulos escenciales para el bien funcionamiento de angular 4.
  imports: [
    BrowserModule, // modulo para renderizar
    BrowserAnimationsModule, // modulo para animaciones
    NoopAnimationsModule, // complemento para animaciones
    AppRoutingModule, // Root Routing de la aplicación.
    HttpModule,     // Cliente para consumir Servicios REST.
    ChartModule,  // Charts
    AmChartsModule,
    FormsModule, ReactiveFormsModule, //Modulos para formularios.
    NgbModule.forRoot(), // Boostrap
    NgbDatepickerModule.forRoot()
  ],
// Se declaraon todos los Componentes que van a ser usados en la aplicación.
  declarations: [
    AppComponent, // Componente principal.
    NavbarComponent, // Componente Barra de navegaciòn proncipal
    PageNotFoundComponent, // Componente para errores 404
    LineChartDemoComponent, // Componente demo para una gráfica.
    ReporteDesplazamientoInventarioComponent, // Componente principal para el reporte de Desplazamiento Inventario.
    DesplazamientoInventarioChartComponent,
    ScatterPlotChartComponent, HeatChartComponent
  ],
  /**
   *  Todos los servicios @Injtectables se declaran como providers. Se declaran en el módulo principal para que puedan ser
   *  usados por cualquier componente.
   */
  providers:
    [
      DesplazamientoInventarioService, // Servicio para consumir los endpoints relacionados a Desplazamiento Inventario.
      CatalogoService,
      FormControlDirective, FormGroupDirective, // Servicios requeridos para trabajar con Formularios, son core angular.
      {
        provide: HIGHCHARTS_MODULES,
        useValue: [exporting]
      },
    ],
  // Componentes que son inicializados al arrancar la aplicación. En este caso solo es necesario el AppComponent.
  // Esta Clase {AppComponent} se encuentra en el arvhico app.component.ts y usa el template HTML del archivo app.component.html.
  // Cuando arranca la apicación el contenido del AppComponent se vacia dentro el  index.html
  bootstrap:
    [AppComponent]
})

export class AppModule {

}
