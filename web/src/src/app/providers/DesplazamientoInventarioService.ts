/*
 *      File: DesplazamientoInventarioService.ts
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */
import {Headers, Http, Response} from '@angular/http';
import {Injectable} from "@angular/core";
import {Observable} from 'rxjs/Rx';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Sellthrough} from "../model/desplazamiento-inventario/Sellthrough";
import {SellthroughFilter} from "../model/desplazamiento-inventario/SellthroughFilter";


/**
 * @file
 *
 * Project: sintec
 *    File: DesplazamientoInventarioService.js
 *
 * Servicio que nos ayuda a consumir los endpoints para obtener la información necesario para generar el reporte
 * Desplazamiento de Inventario.
 * - Management
 *
 * @class
 * @classdesc Servicios de negocio.
 * @summary   Consume enpoints de tipo RESTful.
 * @author  Orlando Ramos &lt;orlando.ramos@amk-technologies.com&gt;, https://github.com/bhitOmicron/ , [omicron]
 * @updated 13/10/17
 * @version 0.1
 * @since   1.0.0
 *
 */
@Injectable()  // Esto le indica al motor angular que este objeto se puede inyectar,
export class DesplazamientoInventarioService {

  /**
   * Constructor del servicio.
   * @param {Http} http Se inyecta el objeto {Http}, este es un cliente que nos ayudas a consumir endpoints.
   */
  constructor(private http: Http) {
    console.log('DesplazamientoInventarioService {constructor}');
  }

  // variable para el nombre del host
  private _host = "http://localhost:8080";
  // URI para generar el reporte
  private _getReport = this._host + "/desplazamiento/report";


  /**
   * Consume el enpoint para generar el reporte.
   * @param {SellthroughFilter} filter Filtros necesarios para consumir el endpoint.
   * @returns {Observable<Sellthrough[]>} Una lista observable con los registros.
   */
  getReport(filter: SellthroughFilter): Observable<Sellthrough[]> {
    return this.http
      .post(
        this._getReport + '?page=0&size=30', // esta es la URL http://localhost:8080/desplazamiento/report
        filter, // se envìa el objeto con los parámetros dentro del body {}
        {headers: this.setHeaders()} // se asignan los cabeceros correspondientes.
      )
      .map((res: Response) => res.json()) // se mapea la respuesta en caso de SUCCESS
      .catch(this.formatErrors);// se maneja el error.
  }


  /**
   * Se construyen los HEADERS para la petición HTTP:
   * @returns {Headers}
   */
  private setHeaders(): Headers {
    const headersConfig = {
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET, POST, PATCH, PUT, DELETE, OPTIONS',
      'Access-Control-Allow-Headers': 'Origin, Content-Type, X-Auth-Token',
      'Accept': 'application/json'
    };
    return new Headers(headersConfig);
  }

  /**
   * Se controla el error.
   * @param error
   * @returns {ErrorObservable}
   */
  private formatErrors(error: any) {
    //  Lo único que se hace es arrojar el error como un objeto Obervable para que la sguiente capa lo controle.
    return Observable.throw(error.json());
  }
}
