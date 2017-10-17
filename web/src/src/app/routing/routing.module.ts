/*
 *      File: routing.module.ts
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 15, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {PageNotFoundComponent} from "../components/page-not-found/page-not-found.component";
import {RouterModule, Routes} from "@angular/router";
import {LineChartDemoComponent} from "../commons/line-chart-demo/line-chart-demo.component";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import {ReporteDesplazamientoInventarioComponent} from "../reporte-desplazamiento-inventario/reporte-desplazamiento-inventario.component";

/**
 * Estas constantes nos indican cuàl componente sera cargado dentro del <router-outlet></router-outlet> al momento de redireccionar a cierta URI.
 */
const router: Routes = [
  /**
   * Interpretando el código :
   * La primer ruta nos dice => cuando el path principal en el navegador sea igual a  dominio:puerto/ redirecciona a dominio:puerto/reporte_one.
   * Cuando en el path sea dominio:puerto/reporte_one carga dentro del <router-outlet></router-outlet> el contenido del componente LineChartDemoComponent.
   * Cuando en el path sea dominio:puerto/reporte_five carga dentro del <router-outlet></router-outlet> el contenido del componente ReporteDesplazamientoInventarioComponent.
   * Cuando en el path  no sea reconocido carga dentro del <router-outlet></router-outlet> el contenido del componente PageNotFoundComponent.
   */
  {path: '', redirectTo: 'reporte_one', pathMatch: 'full'},
  {path: 'reporte_one', component: LineChartDemoComponent},
  {path: 'reporte_five', component: ReporteDesplazamientoInventarioComponent},
  {path: '**', component: PageNotFoundComponent, outlet: 'content'}
];

/**
 *  Este servicio habilita la navegaciòn al usuario dentro de una sola vista, esto nos ayuda a construir una verdadera aplicación
 *  de tipo SPA (Single Page Application).
 *  Se declara como un módulo, se alimenta con un arreglo contante llamado router, especificado en la parte superior.
 */
@NgModule({
  imports: [
    CommonModule,
    // Se inicializa el mòdulo RouterModule y se expone para que sea usable para el mòdulo AppModule.
    RouterModule.forRoot(
      router,
      {enableTracing: false} // <-- debugging purposes only
    )
  ],
  exports: [
    RouterModule // se expone
  ],
  declarations: []
})
export class AppRoutingModule {
}
