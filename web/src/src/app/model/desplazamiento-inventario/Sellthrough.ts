/*
 *      File: Sellthrough.ts
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

/**
 * @file
 *
 * Project: sintec
 *    File: Sellthrough.js
 *
 * The long description of the file's purpose goes here and describes in detail the complete functionality of the file.
 * This description can span several lines and ends with a period.
 * - Management
 *
 * @requires javascriptlibrary.js
 * @class
 * @classdesc This is a description of the MyClass class.
 * @summary   A short description of the file.
 *
 *
 * @license The Unlicense, http://unlicense.org/
 * @author  Orlando Ramos &lt;orlando.ramos@amk-technologies.com&gt;, https://github.com/bhitOmicron/ , [omicron]
 * @updated 13/10/17
 * @link    url goes here
 * @version 0.1
 * @since   1.0.0
 *
 */
export class Sellthrough {
  private _id: number;
  private _idDepartamento: number;
  private _idSubdepartamento: number;
  private _idClase: number;
  private _idSubclase: string;
  private _departamento: string;
  private _subdepartamento: string;
  private _clase: string;
  private _subclase: string;
  private _sku: number;
  private _descripcion: string;
  private _estatus: string;
  private _proveedor: string;
  private _idTienda: number;
  private _tienda: string;
  private _region: string;
  private _formato: string;
  private _zona: string;
  private _vPiezas: number;
  private _vPesos: number;
  private _iPiezas: number;
  private _iPesos: number;
  private _rPiezas: number;
  private _rPesos: number;
  private _ifPiezas: number;
  private _ifPesos: number;
  private _objetivo: number;


  get id(): number {
    return this._id;
  }

  set id(value: number) {
    this._id = value;
  }

  get idDepartamento(): number {
    return this._idDepartamento;
  }

  set idDepartamento(value: number) {
    this._idDepartamento = value;
  }

  get idSubdepartamento(): number {
    return this._idSubdepartamento;
  }

  set idSubdepartamento(value: number) {
    this._idSubdepartamento = value;
  }

  get idClase(): number {
    return this._idClase;
  }

  set idClase(value: number) {
    this._idClase = value;
  }

  get idSubclase(): string {
    return this._idSubclase;
  }

  set idSubclase(value: string) {
    this._idSubclase = value;
  }

  get departamento(): string {
    return this._departamento;
  }

  set departamento(value: string) {
    this._departamento = value;
  }

  get subdepartamento(): string {
    return this._subdepartamento;
  }

  set subdepartamento(value: string) {
    this._subdepartamento = value;
  }

  get clase(): string {
    return this._clase;
  }

  set clase(value: string) {
    this._clase = value;
  }

  get subclase(): string {
    return this._subclase;
  }

  set subclase(value: string) {
    this._subclase = value;
  }

  get sku(): number {
    return this._sku;
  }

  set sku(value: number) {
    this._sku = value;
  }

  get descripcion(): string {
    return this._descripcion;
  }

  set descripcion(value: string) {
    this._descripcion = value;
  }

  get estatus(): string {
    return this._estatus;
  }

  set estatus(value: string) {
    this._estatus = value;
  }

  get proveedor(): string {
    return this._proveedor;
  }

  set proveedor(value: string) {
    this._proveedor = value;
  }

  get idTienda(): number {
    return this._idTienda;
  }

  set idTienda(value: number) {
    this._idTienda = value;
  }

  get tienda(): string {
    return this._tienda;
  }

  set tienda(value: string) {
    this._tienda = value;
  }

  get region(): string {
    return this._region;
  }

  set region(value: string) {
    this._region = value;
  }

  get formato(): string {
    return this._formato;
  }

  set formato(value: string) {
    this._formato = value;
  }

  get zona(): string {
    return this._zona;
  }

  set zona(value: string) {
    this._zona = value;
  }

  get vPiezas(): number {
    return this._vPiezas;
  }

  set vPiezas(value: number) {
    this._vPiezas = value;
  }

  get vPesos(): number {
    return this._vPesos;
  }

  set vPesos(value: number) {
    this._vPesos = value;
  }

  get iPiezas(): number {
    return this._iPiezas;
  }

  set iPiezas(value: number) {
    this._iPiezas = value;
  }

  get iPesos(): number {
    return this._iPesos;
  }

  set iPesos(value: number) {
    this._iPesos = value;
  }

  get rPiezas(): number {
    return this._rPiezas;
  }

  set rPiezas(value: number) {
    this._rPiezas = value;
  }

  get rPesos(): number {
    return this._rPesos;
  }

  set rPesos(value: number) {
    this._rPesos = value;
  }

  get ifPiezas(): number {
    return this._ifPiezas;
  }

  set ifPiezas(value: number) {
    this._ifPiezas = value;
  }

  get ifPesos(): number {
    return this._ifPesos;
  }

  set ifPesos(value: number) {
    this._ifPesos = value;
  }

  get objetivo(): number {
    return this._objetivo;
  }

  set objetivo(value: number) {
    this._objetivo = value;
  }
}
