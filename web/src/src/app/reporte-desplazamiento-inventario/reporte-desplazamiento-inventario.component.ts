/*
 *      File: reporte-desplazamiento-inventario.component.ts
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 15, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

import {Component, OnInit} from '@angular/core';
import {DesplazamientoInventarioService} from "../providers/DesplazamientoInventarioService";
import {Sellthrough} from "../model/desplazamiento-inventario/Sellthrough";
import {Departamento} from "../model/Departamento";
import {SubDepartamento} from "../model/SubDepartamento";
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {SellthroughFilter} from "../model/desplazamiento-inventario/SellthroughFilter";
import {CatalogoService} from "../providers/catalogo.service";
import {Clase} from "../model/Clase";
import {SubClase} from "../model/SubClase";
import {SintecTransportDataChartService} from "../providers/sintec-transport-chart.service";

/**
 * Componente base para el reporte Desplazamiento de Inventarios.
 */
@Component({
  selector: 'app-reporte-desplazamiento-inventario', // este selector es cargado de forma automática por el <router-outlet></router-outlet>
  templateUrl: './reporte-desplazamiento-inventario.component.html', // contenido del compoennte
  styleUrls: ['./reporte-desplazamiento-inventario.component.css'] // estilos del componente.
})
export class ReporteDesplazamientoInventarioComponent implements OnInit {
  _sellthrough: Sellthrough[]; // arreglo de registros de la tabla sellthrough
  _departamentos: Departamento[]; // arreglo de departamentos
  _clases: Clase[]; // arreglo de clase
  _subclases: SubClase[]; // arreglo de subclase
  _sub_departamentos: SubDepartamento[]; // arreglo de sub departamentos
  _sellthroughFilter: SellthroughFilter = new SellthroughFilter(); // objeto que contiene todos los campos filtro
  _validFilter: boolean = false; // variable para validar si el filtro esta completo.
  _canGenerateReport = false; // variable que indica si es posible disparar el método que generá el reporte
  filterForm: FormGroup; // Formulario donde vienen todos los filtros.

  /**
   * Constructor del componente.
   * @param {DesplazamientoInventarioService} desplazamientoService Servicio para explotar los endpoints del Reporte Desplazamiento de Inventario.
   * @param {FormBuilder} fb Objeto agular que nos ayuda  a crear el formulario de angular.
   */
  constructor(private desplazamientoService: DesplazamientoInventarioService, // se inyecta el servicio de desplazamiento
              private catalogoService: CatalogoService,
              private sintecTransportDataServie: SintecTransportDataChartService,
              private fb: FormBuilder) {
    console.log('ReporteDesplazamientoInventarioComponent Controller');
  }

  /**
   * Cada componente tiene un ciclo de vida que es controlado por Angular. Durante este ciclo de vida se ejecutan
   * ciertos métodos que nos ayudan a robustecer el comportamiento de nuestros componentes.
   * Para más detalle del ciclo de vida: https://angular.io/guide/lifecycle-hooks
   */
  ngOnInit() {
    console.log('ReporteDesplazamientoInventarioComponent ngOnInit');
    //  en este caso ejecutamos el método para construir el formulario.
    this.buildForm();
    //  y ejecutamos el método que nos carga nuestro primer set de filtros.
    this.getInitFilters();
    this.getReport();
  }

  /**
   * Construyendo el formulario.
   */
  buildForm(): void {
    console.log('-- construyendo formulario --');
// solo se construye el formulario y se crea un grupo de elementos que necesitan ser validados.
    this.filterForm = this.fb.group(
      {
        'departamentos': ['', [Validators.required]],
        'subdepartamentos': ['', [Validators.required]],
      });
  }

  /**
   * Se consumen los endpoints para obtener los catálogos.
   */
  getInitFilters() {
    console.log('ReporteDesplazamientoInventarioComponent Obteniendo Filtros');
    // Se obtienen los departamentos.
    this.catalogoService.getDptos()
      .subscribe(
        resultArray => this._departamentos = resultArray,
        error => console.log("Error al obtener los departamentos :: " + error)
      );
  }

  /**
   * Generar el reporte.
   */
  getReport(): void {
    console.log('ReporteDesplazamientoInventarioComponent Generando Reporte');
    this.desplazamientoService.getReport(this._sellthroughFilter)
      .subscribe(
        resultArray => this._sellthrough = resultArray,
        error => console.log("Error al generar el reporte :: " + error)
      );
    console.log('enviando data a la gráfica');
    this.sintecTransportDataServie.sendData(this._sellthrough);
  }

  /**
   * Este mtodo es ejectuado cuando se presiona el boton del formulario.
   * Ejecuta un llamado al metodo getReport()
   */
  onSubmit() {
    this.getReport();
  }

  /**
   * Cuando se selecciona un Departamento, el id del departamento es enviado.
   * @param idDpto
   */
  setFilterDpto(idDpto: any): void {
    console.log(idDpto);
    // Se le asigna el valor del id departamento al objeto que contiene todos los filtros.
    this._sellthroughFilter.idDepartamento = idDpto;
    this.catalogoService.getSubDptos(idDpto).subscribe(
      resultArray => this._sub_departamentos = resultArray,
      error => console.log("Error al obtener los departamentos :: " + error)
    );
    // se valida si los filtros estan completos.
    this.validateFilters();
  }

  setFilterSubDpto(idSubDpto: any): void {
    console.log(idSubDpto);
    // Se le asigna el valor del id subdepartamento al objeto que contiene todos los filtros.
    this._sellthroughFilter.idSubdepartamento = idSubDpto;
    this.catalogoService.getClasesByDptoAndSubDpto(this._sellthroughFilter.idDepartamento,
      this._sellthroughFilter.idSubdepartamento).subscribe(
      resultArray => this._clases = resultArray,
      error => console.log("Error al obtener las clases :: " + error)
    );
    // se valida si los filtros estan completos.
    this.validateFilters();
  }

  setClases(idClase: any) {
    console.log('Selecionando clase ' + idClase);
    this._sellthroughFilter.idClase = idClase;
    this.catalogoService.getSubClase(idClase).subscribe(
      resultArray => this._subclases = resultArray,
      error => console.log("Error al obtener las sub clases :: " + error)
    );
    this.validateFilters();
  }

  setSubClases(idSubClase: any) {
    this._sellthroughFilter.idSubClase = idSubClase;
    console.log('fin de los primero filtroas ' + idSubClase);
    this.validateFilters();
  }

  setFechainicio(fechaInicio: any) {
    console.log(fechaInicio);
    this._sellthroughFilter.fechaInicio = new Date(fechaInicio);
    this.validateFilters();
  }

  setFechaFin(fechaFin: any) {
    console.log(fechaFin);
    this._sellthroughFilter.fechaFin = new Date(fechaFin);
    this.validateFilters();
  }

  /**
   * Se valida si los filtros estan completos.
   */
  validateFilters() {
    console.log('validateFilters');
    if (this.isFiltersValid()) {
      // Si los filtros estan completos se habilita el boton para generar el reporte.
      this._canGenerateReport = true;
    }
  }

  /**
   * Validamos todos los campos del filtro. Si todos los campos del filtro estan completos se retorna un true.
   * @returns {boolean}
   */
  isFiltersValid(): boolean {
    this._validFilter = !!this._sellthroughFilter.idDepartamento;
    this._validFilter = !!this._sellthroughFilter.idSubdepartamento;
    this._validFilter = !!this._sellthroughFilter.idClase;
    this._validFilter = !!this._sellthroughFilter.idSubClase;
    return this._validFilter;
  }

}
