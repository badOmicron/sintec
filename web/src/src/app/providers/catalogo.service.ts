import {Injectable} from '@angular/core';
import {Headers, Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Rx';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import {Departamento} from "../model/Departamento";
import {SubDepartamento} from "../model/SubDepartamento";
import {SubClase} from "../model/SubClase";
import {Clase} from "../model/Clase";

@Injectable()
export class CatalogoService {

  private _host = "http://localhost:8080";
  private _catalogoBase = "/catalogos";
  // URI para obtener los departamentos
  private _getDptos = this._host + this._catalogoBase + "/departamentos";
  // URI para obtener los sub departamentos
  private _getSubDptos = this._host + this._catalogoBase + "/subdepartamentos";
  // URI para obtener los clases
  private _getClases = this._host + +this._catalogoBase + "/clases";
  // URI para obtener los subclases
  private _getSubClases = this._host + this._catalogoBase + "/subclases";

  constructor(private http: Http) {
  }

  /**
   * Obtiene los depatamentos.
   * @returns {Observable<Departamento[]>} Una lista observable con los departamentos.
   */
  getDptos(): Observable<Departamento[]> {
    console.log(this._getDptos);
    return this.http
      .get(this._getDptos,
        {headers: this.setHeaders()}
      )
      .map((res: Response) => res.json())
      .catch(this.formatErrors);
  }

  /**
   * Se obtienen los Sub Departamentos.
   * @returns {Observable<SubDepartamento[]>} Una lista observable con los sub departamentos.
   */
  getSubDptos(idDepartamento: any): Observable<SubDepartamento[]> {
    return this.http
      .get(this._getSubDptos + '/' + idDepartamento,
        {headers: this.setHeaders()}
      )
      .map((res: Response) => res.json())
      .catch(this.formatErrors);
  }


  getClases(): Observable<Clase[]> {
    return this.http
      .get(this._getClases,
        {headers: this.setHeaders()}
      )
      .map((res: Response) => res.json())
      .catch(this.formatErrors);
  }

  getClasesByDptoAndSubDpto(idDpto: any, idSubDpto: any): Observable<Clase[]> {
    return this.http
      .get(this._host + this._catalogoBase + '/' + idDpto + '/' + idSubDpto + '/clases',
        {headers: this.setHeaders()}
      )
      .map((res: Response) => res.json())
      .catch(this.formatErrors);
  }

  getSubClase(clase: number): Observable<SubClase[]> {
    console.log(this._getSubClases + '/' + clase);
    return this.http
      .get(this._getSubClases + '/' + clase,
        {headers: this.setHeaders()}
      )
      .map((res: Response) => res.json())
      .catch(this.formatErrors);
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
