/*
 *      File: TblFullPriceEntity.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model;

import javax.persistence.*;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "tbl_full_price", schema = "dbo", catalog = "Herramientas")
public class TblFullPriceEntity {
    private int id;
    private Integer idDepartamento;
    private String departamento;
    private Integer idSubdepartamento;
    private String subdepartamento;
    private Integer idClase;
    private String clase;
    private Integer idSubclase;
    private String subclase;
    private String sm;
    private Integer sku;
    private Integer mes;
    private Integer año;
    private Double vtaPesos;
    private Double vtaPiezas;
    private Double precioUnitario;
    private Double fullPrice;
    private Double porcentajeFull;
    private Integer idProveedor;
    private String proveedor;
    private String nivelPrecio;
    private Double invVenta;
    private String skuDesc;
    private String concatenado;
    private Double ventaporprecio;
    private String descMes;
    private Double precioPonderado;
    private Double vtaCosto;

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
     * Getter for mes.
     * @return mes.
     **/
    @Basic
    @Column(name = "mes", nullable = true)
    public Integer getMes() {
        return mes;
    }

    /**
     * Setter for mes.
     * @param mes expected.
     **/
    public void setMes(Integer mes) {
        this.mes = mes;
    }

    /**
     * Getter for año.
     * @return año.
     **/
    @Basic
    @Column(name = "año", nullable = true)
    public Integer getAño() {
        return año;
    }

    /**
     * Setter for año.
     * @param año expected.
     **/
    public void setAño(Integer año) {
        this.año = año;
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
     * Getter for precioUnitario.
     * @return precioUnitario.
     **/
    @Basic
    @Column(name = "precio_unitario", nullable = true, precision = 0)
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Setter for precioUnitario.
     * @param precioUnitario expected.
     **/
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Getter for fullPrice.
     * @return fullPrice.
     **/
    @Basic
    @Column(name = "full_price", nullable = true, precision = 0)
    public Double getFullPrice() {
        return fullPrice;
    }

    /**
     * Setter for fullPrice.
     * @param fullPrice expected.
     **/
    public void setFullPrice(Double fullPrice) {
        this.fullPrice = fullPrice;
    }

    /**
     * Getter for porcentajeFull.
     * @return porcentajeFull.
     **/
    @Basic
    @Column(name = "porcentaje_full", nullable = true, precision = 0)
    public Double getPorcentajeFull() {
        return porcentajeFull;
    }

    /**
     * Setter for porcentajeFull.
     * @param porcentajeFull expected.
     **/
    public void setPorcentajeFull(Double porcentajeFull) {
        this.porcentajeFull = porcentajeFull;
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
    @Column(name = "proveedor", nullable = true, length = 255)
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
     * Getter for nivelPrecio.
     * @return nivelPrecio.
     **/
    @Basic
    @Column(name = "nivel_precio", nullable = true, length = 255)
    public String getNivelPrecio() {
        return nivelPrecio;
    }

    /**
     * Setter for nivelPrecio.
     * @param nivelPrecio expected.
     **/
    public void setNivelPrecio(String nivelPrecio) {
        this.nivelPrecio = nivelPrecio;
    }

    /**
     * Getter for invVenta.
     * @return invVenta.
     **/
    @Basic
    @Column(name = "invVenta", nullable = true, precision = 0)
    public Double getInvVenta() {
        return invVenta;
    }

    /**
     * Setter for invVenta.
     * @param invVenta expected.
     **/
    public void setInvVenta(Double invVenta) {
        this.invVenta = invVenta;
    }

    /**
     * Getter for skuDesc.
     * @return skuDesc.
     **/
    @Basic
    @Column(name = "sku_desc", nullable = true, length = 255)
    public String getSkuDesc() {
        return skuDesc;
    }

    /**
     * Setter for skuDesc.
     * @param skuDesc expected.
     **/
    public void setSkuDesc(String skuDesc) {
        this.skuDesc = skuDesc;
    }

    /**
     * Getter for concatenado.
     * @return concatenado.
     **/
    @Basic
    @Column(name = "concatenado", nullable = true, length = 255)
    public String getConcatenado() {
        return concatenado;
    }

    /**
     * Setter for concatenado.
     * @param concatenado expected.
     **/
    public void setConcatenado(String concatenado) {
        this.concatenado = concatenado;
    }

    /**
     * Getter for ventaporprecio.
     * @return ventaporprecio.
     **/
    @Basic
    @Column(name = "ventaporprecio", nullable = true, precision = 0)
    public Double getVentaporprecio() {
        return ventaporprecio;
    }

    /**
     * Setter for ventaporprecio.
     * @param ventaporprecio expected.
     **/
    public void setVentaporprecio(Double ventaporprecio) {
        this.ventaporprecio = ventaporprecio;
    }

    /**
     * Getter for descMes.
     * @return descMes.
     **/
    @Basic
    @Column(name = "Desc_mes", nullable = true, length = 255)
    public String getDescMes() {
        return descMes;
    }

    /**
     * Setter for descMes.
     * @param descMes expected.
     **/
    public void setDescMes(String descMes) {
        this.descMes = descMes;
    }

    /**
     * Getter for precioPonderado.
     * @return precioPonderado.
     **/
    @Basic
    @Column(name = "precio_ponderado", nullable = true, precision = 0)
    public Double getPrecioPonderado() {
        return precioPonderado;
    }

    /**
     * Setter for precioPonderado.
     * @param precioPonderado expected.
     **/
    public void setPrecioPonderado(Double precioPonderado) {
        this.precioPonderado = precioPonderado;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblFullPriceEntity that = (TblFullPriceEntity) o;

        if (id != that.id) return false;
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
        if (sm != null ? !sm.equals(that.sm) : that.sm != null) return false;
        if (sku != null ? !sku.equals(that.sku) : that.sku != null) return false;
        if (mes != null ? !mes.equals(that.mes) : that.mes != null) return false;
        if (año != null ? !año.equals(that.año) : that.año != null) return false;
        if (vtaPesos != null ? !vtaPesos.equals(that.vtaPesos) : that.vtaPesos != null) return false;
        if (vtaPiezas != null ? !vtaPiezas.equals(that.vtaPiezas) : that.vtaPiezas != null) return false;
        if (precioUnitario != null ? !precioUnitario.equals(that.precioUnitario) : that.precioUnitario != null)
            return false;
        if (fullPrice != null ? !fullPrice.equals(that.fullPrice) : that.fullPrice != null) return false;
        if (porcentajeFull != null ? !porcentajeFull.equals(that.porcentajeFull) : that.porcentajeFull != null)
            return false;
        if (idProveedor != null ? !idProveedor.equals(that.idProveedor) : that.idProveedor != null) return false;
        if (proveedor != null ? !proveedor.equals(that.proveedor) : that.proveedor != null) return false;
        if (nivelPrecio != null ? !nivelPrecio.equals(that.nivelPrecio) : that.nivelPrecio != null) return false;
        if (invVenta != null ? !invVenta.equals(that.invVenta) : that.invVenta != null) return false;
        if (skuDesc != null ? !skuDesc.equals(that.skuDesc) : that.skuDesc != null) return false;
        if (concatenado != null ? !concatenado.equals(that.concatenado) : that.concatenado != null) return false;
        if (ventaporprecio != null ? !ventaporprecio.equals(that.ventaporprecio) : that.ventaporprecio != null)
            return false;
        if (descMes != null ? !descMes.equals(that.descMes) : that.descMes != null) return false;
        if (precioPonderado != null ? !precioPonderado.equals(that.precioPonderado) : that.precioPonderado != null)
            return false;
        if (vtaCosto != null ? !vtaCosto.equals(that.vtaCosto) : that.vtaCosto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (idSubdepartamento != null ? idSubdepartamento.hashCode() : 0);
        result = 31 * result + (subdepartamento != null ? subdepartamento.hashCode() : 0);
        result = 31 * result + (idClase != null ? idClase.hashCode() : 0);
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + (idSubclase != null ? idSubclase.hashCode() : 0);
        result = 31 * result + (subclase != null ? subclase.hashCode() : 0);
        result = 31 * result + (sm != null ? sm.hashCode() : 0);
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        result = 31 * result + (mes != null ? mes.hashCode() : 0);
        result = 31 * result + (año != null ? año.hashCode() : 0);
        result = 31 * result + (vtaPesos != null ? vtaPesos.hashCode() : 0);
        result = 31 * result + (vtaPiezas != null ? vtaPiezas.hashCode() : 0);
        result = 31 * result + (precioUnitario != null ? precioUnitario.hashCode() : 0);
        result = 31 * result + (fullPrice != null ? fullPrice.hashCode() : 0);
        result = 31 * result + (porcentajeFull != null ? porcentajeFull.hashCode() : 0);
        result = 31 * result + (idProveedor != null ? idProveedor.hashCode() : 0);
        result = 31 * result + (proveedor != null ? proveedor.hashCode() : 0);
        result = 31 * result + (nivelPrecio != null ? nivelPrecio.hashCode() : 0);
        result = 31 * result + (invVenta != null ? invVenta.hashCode() : 0);
        result = 31 * result + (skuDesc != null ? skuDesc.hashCode() : 0);
        result = 31 * result + (concatenado != null ? concatenado.hashCode() : 0);
        result = 31 * result + (ventaporprecio != null ? ventaporprecio.hashCode() : 0);
        result = 31 * result + (descMes != null ? descMes.hashCode() : 0);
        result = 31 * result + (precioPonderado != null ? precioPonderado.hashCode() : 0);
        result = 31 * result + (vtaCosto != null ? vtaCosto.hashCode() : 0);
        return result;
    }
}
