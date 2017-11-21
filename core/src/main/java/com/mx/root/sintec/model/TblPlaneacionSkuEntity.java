/*
 *      File: TblPlaneacionSkuEntity.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model;

import java.sql.Date;

import javax.persistence.*;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "tbl_PlaneacionSKU", schema = "dbo", catalog = "Herramientas")
public class TblPlaneacionSkuEntity {
    private int id;
    private Date fecha;
    private Integer idDepartamento;
    private String departamento;
    private Integer idSubdepartamento;
    private String subdepartamento;
    private Integer idClase;
    private String clase;
    private Integer idSubclase;
    private String subclase;
    private Integer idProveedor;
    private String proveedor;
    private String rangoPrecio;
    private Integer sku;
    private String nombre;
    private Double precioVigenteConIva;
    private Double precioponderado;
    private Double mnc;
    private String sm;
    private Double mafSinBon;
    private Double desplVta;
    private Double desplPz;
    private Double vtaPesos;
    private Double vtaCosto;
    private Double vtaPiezas;
    private Double invfinuni;
    private Double invFinVta;
    private Double piezasXEmpaque;

    /**
     * Getter for id.
     * @return id.
     **/
    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    /**
     * Setter for id.
     * @param id expected.
     **/
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for fecha.
     * @return fecha.
     **/
    @Basic
    @Column(name = "Fecha", nullable = true)
    public Date getFecha() {
        return fecha;
    }

    /**
     * Setter for fecha.
     * @param fecha expected.
     **/
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Getter for idDepartamento.
     * @return idDepartamento.
     **/
    @Basic
    @Column(name = "id_departamento", nullable = true)
    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    /**
     * Setter for idDepartamento.
     * @param idDepartamento expected.
     **/
    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    /**
     * Getter for departamento.
     * @return departamento.
     **/
    @Basic
    @Column(name = "departamento", nullable = true, length = 255)
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Setter for departamento.
     * @param departamento expected.
     **/
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Getter for idSubdepartamento.
     * @return idSubdepartamento.
     **/
    @Basic
    @Column(name = "id_subdepartamento", nullable = true)
    public Integer getIdSubdepartamento() {
        return idSubdepartamento;
    }

    /**
     * Setter for idSubdepartamento.
     * @param idSubdepartamento expected.
     **/
    public void setIdSubdepartamento(Integer idSubdepartamento) {
        this.idSubdepartamento = idSubdepartamento;
    }

    /**
     * Getter for subdepartamento.
     * @return subdepartamento.
     **/
    @Basic
    @Column(name = "subdepartamento", nullable = true, length = 255)
    public String getSubdepartamento() {
        return subdepartamento;
    }

    /**
     * Setter for subdepartamento.
     * @param subdepartamento expected.
     **/
    public void setSubdepartamento(String subdepartamento) {
        this.subdepartamento = subdepartamento;
    }

    /**
     * Getter for idClase.
     * @return idClase.
     **/
    @Basic
    @Column(name = "id_clase", nullable = true)
    public Integer getIdClase() {
        return idClase;
    }

    /**
     * Setter for idClase.
     * @param idClase expected.
     **/
    public void setIdClase(Integer idClase) {
        this.idClase = idClase;
    }

    /**
     * Getter for clase.
     * @return clase.
     **/
    @Basic
    @Column(name = "clase", nullable = true, length = 255)
    public String getClase() {
        return clase;
    }

    /**
     * Setter for clase.
     * @param clase expected.
     **/
    public void setClase(String clase) {
        this.clase = clase;
    }

    /**
     * Getter for idSubclase.
     * @return idSubclase.
     **/
    @Basic
    @Column(name = "id_subclase", nullable = true)
    public Integer getIdSubclase() {
        return idSubclase;
    }

    /**
     * Setter for idSubclase.
     * @param idSubclase expected.
     **/
    public void setIdSubclase(Integer idSubclase) {
        this.idSubclase = idSubclase;
    }

    /**
     * Getter for subclase.
     * @return subclase.
     **/
    @Basic
    @Column(name = "subclase", nullable = true, length = 255)
    public String getSubclase() {
        return subclase;
    }

    /**
     * Setter for subclase.
     * @param subclase expected.
     **/
    public void setSubclase(String subclase) {
        this.subclase = subclase;
    }

    /**
     * Getter for idProveedor.
     * @return idProveedor.
     **/
    @Basic
    @Column(name = "id_proveedor", nullable = true)
    public Integer getIdProveedor() {
        return idProveedor;
    }

    /**
     * Setter for idProveedor.
     * @param idProveedor expected.
     **/
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * Getter for proveedor.
     * @return proveedor.
     **/
    @Basic
    @Column(name = "Proveedor", nullable = true, length = 255)
    public String getProveedor() {
        return proveedor;
    }

    /**
     * Setter for proveedor.
     * @param proveedor expected.
     **/
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * Getter for rangoPrecio.
     * @return rangoPrecio.
     **/
    @Basic
    @Column(name = "RangoPrecio", nullable = true, length = 10)
    public String getRangoPrecio() {
        return rangoPrecio;
    }

    /**
     * Setter for rangoPrecio.
     * @param rangoPrecio expected.
     **/
    public void setRangoPrecio(String rangoPrecio) {
        this.rangoPrecio = rangoPrecio;
    }

    /**
     * Getter for sku.
     * @return sku.
     **/
    @Basic
    @Column(name = "SKU", nullable = true)
    public Integer getSku() {
        return sku;
    }

    /**
     * Setter for sku.
     * @param sku expected.
     **/
    public void setSku(Integer sku) {
        this.sku = sku;
    }

    /**
     * Getter for nombre.
     * @return nombre.
     **/
    @Basic
    @Column(name = "Nombre", nullable = true, length = 255)
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter for nombre.
     * @param nombre expected.
     **/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter for precioVigenteConIva.
     * @return precioVigenteConIva.
     **/
    @Basic
    @Column(name = "PrecioVigente_ConIVA", nullable = true, precision = 0)
    public Double getPrecioVigenteConIva() {
        return precioVigenteConIva;
    }

    /**
     * Setter for precioVigenteConIva.
     * @param precioVigenteConIva expected.
     **/
    public void setPrecioVigenteConIva(Double precioVigenteConIva) {
        this.precioVigenteConIva = precioVigenteConIva;
    }

    /**
     * Getter for precioponderado.
     * @return precioponderado.
     **/
    @Basic
    @Column(name = "Precioponderado", nullable = true, precision = 0)
    public Double getPrecioponderado() {
        return precioponderado;
    }

    /**
     * Setter for precioponderado.
     * @param precioponderado expected.
     **/
    public void setPrecioponderado(Double precioponderado) {
        this.precioponderado = precioponderado;
    }

    /**
     * Getter for mnc.
     * @return mnc.
     **/
    @Basic
    @Column(name = "MNC", nullable = true, precision = 0)
    public Double getMnc() {
        return mnc;
    }

    /**
     * Setter for mnc.
     * @param mnc expected.
     **/
    public void setMnc(Double mnc) {
        this.mnc = mnc;
    }

    /**
     * Getter for sm.
     * @return sm.
     **/
    @Basic
    @Column(name = "SM", nullable = true, length = 255)
    public String getSm() {
        return sm;
    }

    /**
     * Setter for sm.
     * @param sm expected.
     **/
    public void setSm(String sm) {
        this.sm = sm;
    }

    /**
     * Getter for mafSinBon.
     * @return mafSinBon.
     **/
    @Basic
    @Column(name = "MAF_SinBon", nullable = true, precision = 0)
    public Double getMafSinBon() {
        return mafSinBon;
    }

    /**
     * Setter for mafSinBon.
     * @param mafSinBon expected.
     **/
    public void setMafSinBon(Double mafSinBon) {
        this.mafSinBon = mafSinBon;
    }

    /**
     * Getter for desplVta.
     * @return desplVta.
     **/
    @Basic
    @Column(name = "Despl_Vta", nullable = true, precision = 0)
    public Double getDesplVta() {
        return desplVta;
    }

    /**
     * Setter for desplVta.
     * @param desplVta expected.
     **/
    public void setDesplVta(Double desplVta) {
        this.desplVta = desplVta;
    }

    /**
     * Getter for desplPz.
     * @return desplPz.
     **/
    @Basic
    @Column(name = "Despl_Pz", nullable = true, precision = 0)
    public Double getDesplPz() {
        return desplPz;
    }

    /**
     * Setter for desplPz.
     * @param desplPz expected.
     **/
    public void setDesplPz(Double desplPz) {
        this.desplPz = desplPz;
    }

    /**
     * Getter for vtaPesos.
     * @return vtaPesos.
     **/
    @Basic
    @Column(name = "vtaPesos", nullable = true, precision = 0)
    public Double getVtaPesos() {
        return vtaPesos;
    }

    /**
     * Setter for vtaPesos.
     * @param vtaPesos expected.
     **/
    public void setVtaPesos(Double vtaPesos) {
        this.vtaPesos = vtaPesos;
    }

    /**
     * Getter for vtaCosto.
     * @return vtaCosto.
     **/
    @Basic
    @Column(name = "vtaCosto", nullable = true, precision = 0)
    public Double getVtaCosto() {
        return vtaCosto;
    }

    /**
     * Setter for vtaCosto.
     * @param vtaCosto expected.
     **/
    public void setVtaCosto(Double vtaCosto) {
        this.vtaCosto = vtaCosto;
    }

    /**
     * Getter for vtaPiezas.
     * @return vtaPiezas.
     **/
    @Basic
    @Column(name = "vtaPiezas", nullable = true, precision = 0)
    public Double getVtaPiezas() {
        return vtaPiezas;
    }

    /**
     * Setter for vtaPiezas.
     * @param vtaPiezas expected.
     **/
    public void setVtaPiezas(Double vtaPiezas) {
        this.vtaPiezas = vtaPiezas;
    }

    /**
     * Getter for invfinuni.
     * @return invfinuni.
     **/
    @Basic
    @Column(name = "invfinuni", nullable = true, precision = 0)
    public Double getInvfinuni() {
        return invfinuni;
    }

    /**
     * Setter for invfinuni.
     * @param invfinuni expected.
     **/
    public void setInvfinuni(Double invfinuni) {
        this.invfinuni = invfinuni;
    }

    /**
     * Getter for invFinVta.
     * @return invFinVta.
     **/
    @Basic
    @Column(name = "InvFinVta", nullable = true, precision = 0)
    public Double getInvFinVta() {
        return invFinVta;
    }

    /**
     * Setter for invFinVta.
     * @param invFinVta expected.
     **/
    public void setInvFinVta(Double invFinVta) {
        this.invFinVta = invFinVta;
    }

    /**
     * Getter for piezasXEmpaque.
     * @return piezasXEmpaque.
     **/
    @Basic
    @Column(name = "piezas_x_empaque", nullable = true, precision = 0)
    public Double getPiezasXEmpaque() {
        return piezasXEmpaque;
    }

    /**
     * Setter for piezasXEmpaque.
     * @param piezasXEmpaque expected.
     **/
    public void setPiezasXEmpaque(Double piezasXEmpaque) {
        this.piezasXEmpaque = piezasXEmpaque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblPlaneacionSkuEntity that = (TblPlaneacionSkuEntity) o;

        if (id != that.id) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (idDepartamento != null ? !idDepartamento.equals(that.idDepartamento) : that.idDepartamento != null)
            return false;
        if (departamento != null ? !departamento.equals(that.departamento) : that.departamento != null) return false;
        if (idSubdepartamento != null ? !idSubdepartamento.equals(
                that.idSubdepartamento) : that.idSubdepartamento != null)
            return false;
        if (subdepartamento != null ? !subdepartamento.equals(that.subdepartamento) : that.subdepartamento != null)
            return false;
        if (idClase != null ? !idClase.equals(that.idClase) : that.idClase != null) return false;
        if (clase != null ? !clase.equals(that.clase) : that.clase != null) return false;
        if (idSubclase != null ? !idSubclase.equals(that.idSubclase) : that.idSubclase != null) return false;
        if (subclase != null ? !subclase.equals(that.subclase) : that.subclase != null) return false;
        if (idProveedor != null ? !idProveedor.equals(that.idProveedor) : that.idProveedor != null) return false;
        if (proveedor != null ? !proveedor.equals(that.proveedor) : that.proveedor != null) return false;
        if (rangoPrecio != null ? !rangoPrecio.equals(that.rangoPrecio) : that.rangoPrecio != null) return false;
        if (sku != null ? !sku.equals(that.sku) : that.sku != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (precioVigenteConIva != null ? !precioVigenteConIva.equals(
                that.precioVigenteConIva) : that.precioVigenteConIva != null) return false;
        if (precioponderado != null ? !precioponderado.equals(that.precioponderado) : that.precioponderado != null)
            return false;
        if (mnc != null ? !mnc.equals(that.mnc) : that.mnc != null) return false;
        if (sm != null ? !sm.equals(that.sm) : that.sm != null) return false;
        if (mafSinBon != null ? !mafSinBon.equals(that.mafSinBon) : that.mafSinBon != null) return false;
        if (desplVta != null ? !desplVta.equals(that.desplVta) : that.desplVta != null) return false;
        if (desplPz != null ? !desplPz.equals(that.desplPz) : that.desplPz != null) return false;
        if (vtaPesos != null ? !vtaPesos.equals(that.vtaPesos) : that.vtaPesos != null) return false;
        if (vtaCosto != null ? !vtaCosto.equals(that.vtaCosto) : that.vtaCosto != null) return false;
        if (vtaPiezas != null ? !vtaPiezas.equals(that.vtaPiezas) : that.vtaPiezas != null) return false;
        if (invfinuni != null ? !invfinuni.equals(that.invfinuni) : that.invfinuni != null) return false;
        if (invFinVta != null ? !invFinVta.equals(that.invFinVta) : that.invFinVta != null) return false;
        if (piezasXEmpaque != null ? !piezasXEmpaque.equals(that.piezasXEmpaque) : that.piezasXEmpaque != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (idSubdepartamento != null ? idSubdepartamento.hashCode() : 0);
        result = 31 * result + (subdepartamento != null ? subdepartamento.hashCode() : 0);
        result = 31 * result + (idClase != null ? idClase.hashCode() : 0);
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + (idSubclase != null ? idSubclase.hashCode() : 0);
        result = 31 * result + (subclase != null ? subclase.hashCode() : 0);
        result = 31 * result + (idProveedor != null ? idProveedor.hashCode() : 0);
        result = 31 * result + (proveedor != null ? proveedor.hashCode() : 0);
        result = 31 * result + (rangoPrecio != null ? rangoPrecio.hashCode() : 0);
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (precioVigenteConIva != null ? precioVigenteConIva.hashCode() : 0);
        result = 31 * result + (precioponderado != null ? precioponderado.hashCode() : 0);
        result = 31 * result + (mnc != null ? mnc.hashCode() : 0);
        result = 31 * result + (sm != null ? sm.hashCode() : 0);
        result = 31 * result + (mafSinBon != null ? mafSinBon.hashCode() : 0);
        result = 31 * result + (desplVta != null ? desplVta.hashCode() : 0);
        result = 31 * result + (desplPz != null ? desplPz.hashCode() : 0);
        result = 31 * result + (vtaPesos != null ? vtaPesos.hashCode() : 0);
        result = 31 * result + (vtaCosto != null ? vtaCosto.hashCode() : 0);
        result = 31 * result + (vtaPiezas != null ? vtaPiezas.hashCode() : 0);
        result = 31 * result + (invfinuni != null ? invfinuni.hashCode() : 0);
        result = 31 * result + (invFinVta != null ? invFinVta.hashCode() : 0);
        result = 31 * result + (piezasXEmpaque != null ? piezasXEmpaque.hashCode() : 0);
        return result;
    }
}
