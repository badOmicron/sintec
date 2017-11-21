/*
 *      File: SellthroughEntity.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model;

import javax.persistence.*;

/**
 *  ORM que representa la tabla sellthrough.
 *
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "sellthrough", schema = "dbo", catalog = "Herramientas")
public class SellthroughEntity {
    private int id;
    private Integer idDepartamento;
    private Integer idSubdepartamento;
    private Integer idClase;
    private String idSubclase;
    private String departamento;
    private String subdepartamento;
    private String clase;
    private String subclase;
    private int sku;
    private String descripcion;
    private String estatus;
    private String proveedor;
    private int idTienda;
    private String tienda;
    private String region;
    private String formato;
    private String zona;
    private Double vPiezas;
    private Double vPesos;
    private Double iPiezas;
    private Double iPesos;
    private Double rPiezas;
    private Double rPesos;
    private Double ifPiezas;
    private Double ifPesos;
    private Double objetivo;

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
     * Getter for idDepartamento.
     * @return idDepartamento.
     **/
    @Basic
    @Column(name = "id_Departamento", nullable = true)
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
     * Getter for idSubdepartamento.
     * @return idSubdepartamento.
     **/
    @Basic
    @Column(name = "id_Subdepartamento", nullable = true)
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
     * Getter for idClase.
     * @return idClase.
     **/
    @Basic
    @Column(name = "id_Clase", nullable = true)
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
     * Getter for idSubclase.
     * @return idSubclase.
     **/
    @Basic
    @Column(name = "id_Subclase", nullable = true, length = 255)
    public String getIdSubclase() {
        return idSubclase;
    }

    /**
     * Setter for idSubclase.
     * @param idSubclase expected.
     **/
    public void setIdSubclase(String idSubclase) {
        this.idSubclase = idSubclase;
    }

    /**
     * Getter for departamento.
     * @return departamento.
     **/
    @Basic
    @Column(name = "Departamento", nullable = true, length = 255)
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
     * Getter for subdepartamento.
     * @return subdepartamento.
     **/
    @Basic
    @Column(name = "Subdepartamento", nullable = true, length = 255)
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
     * Getter for clase.
     * @return clase.
     **/
    @Basic
    @Column(name = "Clase", nullable = true, length = 255)
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
     * Getter for subclase.
     * @return subclase.
     **/
    @Basic
    @Column(name = "Subclase", nullable = true, length = 255)
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
     * Getter for sku.
     * @return sku.
     **/
    @Basic
    @Column(name = "SKU", nullable = false)
    public int getSku() {
        return sku;
    }

    /**
     * Setter for sku.
     * @param sku expected.
     **/
    public void setSku(int sku) {
        this.sku = sku;
    }

    /**
     * Getter for descripcion.
     * @return descripcion.
     **/
    @Basic
    @Column(name = "Descripcion", nullable = true, length = 255)
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter for descripcion.
     * @param descripcion expected.
     **/
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Getter for estatus.
     * @return estatus.
     **/
    @Basic
    @Column(name = "Estatus", nullable = true, length = 255)
    public String getEstatus() {
        return estatus;
    }

    /**
     * Setter for estatus.
     * @param estatus expected.
     **/
    public void setEstatus(String estatus) {
        this.estatus = estatus;
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
     * Getter for idTienda.
     * @return idTienda.
     **/
    @Basic
    @Column(name = "Id_Tienda", nullable = false)
    public int getIdTienda() {
        return idTienda;
    }

    /**
     * Setter for idTienda.
     * @param idTienda expected.
     **/
    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    /**
     * Getter for tienda.
     * @return tienda.
     **/
    @Basic
    @Column(name = "Tienda", nullable = true, length = 255)
    public String getTienda() {
        return tienda;
    }

    /**
     * Setter for tienda.
     * @param tienda expected.
     **/
    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    /**
     * Getter for region.
     * @return region.
     **/
    @Basic
    @Column(name = "Region", nullable = true, length = 255)
    public String getRegion() {
        return region;
    }

    /**
     * Setter for region.
     * @param region expected.
     **/
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter for formato.
     * @return formato.
     **/
    @Basic
    @Column(name = "Formato", nullable = true, length = 255)
    public String getFormato() {
        return formato;
    }

    /**
     * Setter for formato.
     * @param formato expected.
     **/
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * Getter for zona.
     * @return zona.
     **/
    @Basic
    @Column(name = "Zona", nullable = true, length = 255)
    public String getZona() {
        return zona;
    }

    /**
     * Setter for zona.
     * @param zona expected.
     **/
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * Getter for vPiezas.
     * @return vPiezas.
     **/
    @Basic
    @Column(name = "VPiezas", nullable = true, precision = 0)
    public Double getvPiezas() {
        return vPiezas;
    }

    /**
     * Setter for vPiezas.
     * @param vPiezas expected.
     **/
    public void setvPiezas(Double vPiezas) {
        this.vPiezas = vPiezas;
    }

    /**
     * Getter for vPesos.
     * @return vPesos.
     **/
    @Basic
    @Column(name = "VPesos", nullable = true, precision = 0)
    public Double getvPesos() {
        return vPesos;
    }

    /**
     * Setter for vPesos.
     * @param vPesos expected.
     **/
    public void setvPesos(Double vPesos) {
        this.vPesos = vPesos;
    }

    /**
     * Getter for iPiezas.
     * @return iPiezas.
     **/
    @Basic
    @Column(name = "IPiezas", nullable = true, precision = 0)
    public Double getiPiezas() {
        return iPiezas;
    }

    /**
     * Setter for iPiezas.
     * @param iPiezas expected.
     **/
    public void setiPiezas(Double iPiezas) {
        this.iPiezas = iPiezas;
    }

    /**
     * Getter for iPesos.
     * @return iPesos.
     **/
    @Basic
    @Column(name = "IPesos", nullable = true, precision = 0)
    public Double getiPesos() {
        return iPesos;
    }

    /**
     * Setter for iPesos.
     * @param iPesos expected.
     **/
    public void setiPesos(Double iPesos) {
        this.iPesos = iPesos;
    }

    /**
     * Getter for rPiezas.
     * @return rPiezas.
     **/
    @Basic
    @Column(name = "RPiezas", nullable = true, precision = 0)
    public Double getrPiezas() {
        return rPiezas;
    }

    /**
     * Setter for rPiezas.
     * @param rPiezas expected.
     **/
    public void setrPiezas(Double rPiezas) {
        this.rPiezas = rPiezas;
    }

    /**
     * Getter for rPesos.
     * @return rPesos.
     **/
    @Basic
    @Column(name = "RPesos", nullable = true, precision = 0)
    public Double getrPesos() {
        return rPesos;
    }

    /**
     * Setter for rPesos.
     * @param rPesos expected.
     **/
    public void setrPesos(Double rPesos) {
        this.rPesos = rPesos;
    }

    /**
     * Getter for ifPiezas.
     * @return ifPiezas.
     **/
    @Basic
    @Column(name = "IFPiezas", nullable = true, precision = 0)
    public Double getIfPiezas() {
        return ifPiezas;
    }

    /**
     * Setter for ifPiezas.
     * @param ifPiezas expected.
     **/
    public void setIfPiezas(Double ifPiezas) {
        this.ifPiezas = ifPiezas;
    }

    /**
     * Getter for ifPesos.
     * @return ifPesos.
     **/
    @Basic
    @Column(name = "IFPesos", nullable = true, precision = 0)
    public Double getIfPesos() {
        return ifPesos;
    }

    /**
     * Setter for ifPesos.
     * @param ifPesos expected.
     **/
    public void setIfPesos(Double ifPesos) {
        this.ifPesos = ifPesos;
    }

    /**
     * Getter for objetivo.
     * @return objetivo.
     **/
    @Basic
    @Column(name = "Objetivo", nullable = true, precision = 0)
    public Double getObjetivo() {
        return objetivo;
    }

    /**
     * Setter for objetivo.
     * @param objetivo expected.
     **/
    public void setObjetivo(Double objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SellthroughEntity that = (SellthroughEntity) o;

        if (id != that.id) return false;
        if (sku != that.sku) return false;
        if (idTienda != that.idTienda) return false;
        if (idDepartamento != null ? !idDepartamento.equals(that.idDepartamento) : that.idDepartamento != null)
            return false;
        if (idSubdepartamento != null ? !idSubdepartamento.equals(
                that.idSubdepartamento) : that.idSubdepartamento != null)
            return false;
        if (idClase != null ? !idClase.equals(that.idClase) : that.idClase != null) return false;
        if (idSubclase != null ? !idSubclase.equals(that.idSubclase) : that.idSubclase != null) return false;
        if (departamento != null ? !departamento.equals(that.departamento) : that.departamento != null) return false;
        if (subdepartamento != null ? !subdepartamento.equals(that.subdepartamento) : that.subdepartamento != null)
            return false;
        if (clase != null ? !clase.equals(that.clase) : that.clase != null) return false;
        if (subclase != null ? !subclase.equals(that.subclase) : that.subclase != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (estatus != null ? !estatus.equals(that.estatus) : that.estatus != null) return false;
        if (proveedor != null ? !proveedor.equals(that.proveedor) : that.proveedor != null) return false;
        if (tienda != null ? !tienda.equals(that.tienda) : that.tienda != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (formato != null ? !formato.equals(that.formato) : that.formato != null) return false;
        if (zona != null ? !zona.equals(that.zona) : that.zona != null) return false;
        if (vPiezas != null ? !vPiezas.equals(that.vPiezas) : that.vPiezas != null) return false;
        if (vPesos != null ? !vPesos.equals(that.vPesos) : that.vPesos != null) return false;
        if (iPiezas != null ? !iPiezas.equals(that.iPiezas) : that.iPiezas != null) return false;
        if (iPesos != null ? !iPesos.equals(that.iPesos) : that.iPesos != null) return false;
        if (rPiezas != null ? !rPiezas.equals(that.rPiezas) : that.rPiezas != null) return false;
        if (rPesos != null ? !rPesos.equals(that.rPesos) : that.rPesos != null) return false;
        if (ifPiezas != null ? !ifPiezas.equals(that.ifPiezas) : that.ifPiezas != null) return false;
        if (ifPesos != null ? !ifPesos.equals(that.ifPesos) : that.ifPesos != null) return false;
        if (objetivo != null ? !objetivo.equals(that.objetivo) : that.objetivo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (idSubdepartamento != null ? idSubdepartamento.hashCode() : 0);
        result = 31 * result + (idClase != null ? idClase.hashCode() : 0);
        result = 31 * result + (idSubclase != null ? idSubclase.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (subdepartamento != null ? subdepartamento.hashCode() : 0);
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + (subclase != null ? subclase.hashCode() : 0);
        result = 31 * result + sku;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (estatus != null ? estatus.hashCode() : 0);
        result = 31 * result + (proveedor != null ? proveedor.hashCode() : 0);
        result = 31 * result + idTienda;
        result = 31 * result + (tienda != null ? tienda.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (formato != null ? formato.hashCode() : 0);
        result = 31 * result + (zona != null ? zona.hashCode() : 0);
        result = 31 * result + (vPiezas != null ? vPiezas.hashCode() : 0);
        result = 31 * result + (vPesos != null ? vPesos.hashCode() : 0);
        result = 31 * result + (iPiezas != null ? iPiezas.hashCode() : 0);
        result = 31 * result + (iPesos != null ? iPesos.hashCode() : 0);
        result = 31 * result + (rPiezas != null ? rPiezas.hashCode() : 0);
        result = 31 * result + (rPesos != null ? rPesos.hashCode() : 0);
        result = 31 * result + (ifPiezas != null ? ifPiezas.hashCode() : 0);
        result = 31 * result + (ifPesos != null ? ifPesos.hashCode() : 0);
        result = 31 * result + (objetivo != null ? objetivo.hashCode() : 0);
        return result;
    }
}
