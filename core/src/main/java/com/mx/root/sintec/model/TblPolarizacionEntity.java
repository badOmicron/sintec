/*
 *      File: TblPolarizacionEntity.java
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
@Table(name = "tbl_Polarizacion", schema = "dbo", catalog = "Herramientas")
public class TblPolarizacionEntity {
    private int id;
    private String idDepartamento;
    private String idSubdepartamento;
    private String idClase;
    private Integer idLlave;
    private String idSubclase;
    private int sku;
    private String sm;
    private Integer idProveedor;
    private String rangoPrecio;
    private int idTienda;
    private String idFormato;
    private String idZona;
    private String idRegion;
    private Double invVenta;
    private Double vtaProm;
    private Double invPiezas;
    private Double vtaPiezas;
    private Double semanasObj;
    private Integer caducidad;

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
    @Column(name = "id_departamento", nullable = true, length = 255)
    public String getIdDepartamento() {
        return idDepartamento;
    }

    /**
     * Setter for idDepartamento.
     * @param idDepartamento expected.
     **/
    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    /**
     * Getter for idSubdepartamento.
     * @return idSubdepartamento.
     **/
    @Basic
    @Column(name = "id_subdepartamento", nullable = true, length = 255)
    public String getIdSubdepartamento() {
        return idSubdepartamento;
    }

    /**
     * Setter for idSubdepartamento.
     * @param idSubdepartamento expected.
     **/
    public void setIdSubdepartamento(String idSubdepartamento) {
        this.idSubdepartamento = idSubdepartamento;
    }

    /**
     * Getter for idClase.
     * @return idClase.
     **/
    @Basic
    @Column(name = "id_clase", nullable = true, length = 255)
    public String getIdClase() {
        return idClase;
    }

    /**
     * Setter for idClase.
     * @param idClase expected.
     **/
    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }

    /**
     * Getter for idLlave.
     * @return idLlave.
     **/
    @Basic
    @Column(name = "id_llave", nullable = true)
    public Integer getIdLlave() {
        return idLlave;
    }

    /**
     * Setter for idLlave.
     * @param idLlave expected.
     **/
    public void setIdLlave(Integer idLlave) {
        this.idLlave = idLlave;
    }

    /**
     * Getter for idSubclase.
     * @return idSubclase.
     **/
    @Basic
    @Column(name = "id_subclase", nullable = true, length = 255)
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
     * Getter for rangoPrecio.
     * @return rangoPrecio.
     **/
    @Basic
    @Column(name = "Rango_Precio", nullable = true, length = 10)
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
     * Getter for idTienda.
     * @return idTienda.
     **/
    @Basic
    @Column(name = "id_tienda", nullable = false)
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
     * Getter for idFormato.
     * @return idFormato.
     **/
    @Basic
    @Column(name = "id_Formato", nullable = true, length = 255)
    public String getIdFormato() {
        return idFormato;
    }

    /**
     * Setter for idFormato.
     * @param idFormato expected.
     **/
    public void setIdFormato(String idFormato) {
        this.idFormato = idFormato;
    }

    /**
     * Getter for idZona.
     * @return idZona.
     **/
    @Basic
    @Column(name = "id_Zona", nullable = true, length = 255)
    public String getIdZona() {
        return idZona;
    }

    /**
     * Setter for idZona.
     * @param idZona expected.
     **/
    public void setIdZona(String idZona) {
        this.idZona = idZona;
    }

    /**
     * Getter for idRegion.
     * @return idRegion.
     **/
    @Basic
    @Column(name = "id_Region", nullable = true, length = 255)
    public String getIdRegion() {
        return idRegion;
    }

    /**
     * Setter for idRegion.
     * @param idRegion expected.
     **/
    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
    }

    /**
     * Getter for invVenta.
     * @return invVenta.
     **/
    @Basic
    @Column(name = "InvVenta", nullable = true, precision = 0)
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
     * Getter for vtaProm.
     * @return vtaProm.
     **/
    @Basic
    @Column(name = "VtaProm", nullable = true, precision = 0)
    public Double getVtaProm() {
        return vtaProm;
    }

    /**
     * Setter for vtaProm.
     * @param vtaProm expected.
     **/
    public void setVtaProm(Double vtaProm) {
        this.vtaProm = vtaProm;
    }

    /**
     * Getter for invPiezas.
     * @return invPiezas.
     **/
    @Basic
    @Column(name = "InvPiezas", nullable = true, precision = 0)
    public Double getInvPiezas() {
        return invPiezas;
    }

    /**
     * Setter for invPiezas.
     * @param invPiezas expected.
     **/
    public void setInvPiezas(Double invPiezas) {
        this.invPiezas = invPiezas;
    }

    /**
     * Getter for vtaPiezas.
     * @return vtaPiezas.
     **/
    @Basic
    @Column(name = "VtaPiezas", nullable = true, precision = 0)
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
     * Getter for semanasObj.
     * @return semanasObj.
     **/
    @Basic
    @Column(name = "SemanasObj", nullable = true, precision = 0)
    public Double getSemanasObj() {
        return semanasObj;
    }

    /**
     * Setter for semanasObj.
     * @param semanasObj expected.
     **/
    public void setSemanasObj(Double semanasObj) {
        this.semanasObj = semanasObj;
    }

    /**
     * Getter for caducidad.
     * @return caducidad.
     **/
    @Basic
    @Column(name = "Caducidad", nullable = true)
    public Integer getCaducidad() {
        return caducidad;
    }

    /**
     * Setter for caducidad.
     * @param caducidad expected.
     **/
    public void setCaducidad(Integer caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblPolarizacionEntity that = (TblPolarizacionEntity) o;

        if (id != that.id) return false;
        if (sku != that.sku) return false;
        if (idTienda != that.idTienda) return false;
        if (idDepartamento != null ? !idDepartamento.equals(that.idDepartamento) : that.idDepartamento != null)
            return false;
        if (idSubdepartamento != null ? !idSubdepartamento.equals(
                that.idSubdepartamento) : that.idSubdepartamento != null)
            return false;
        if (idClase != null ? !idClase.equals(that.idClase) : that.idClase != null) return false;
        if (idLlave != null ? !idLlave.equals(that.idLlave) : that.idLlave != null) return false;
        if (idSubclase != null ? !idSubclase.equals(that.idSubclase) : that.idSubclase != null) return false;
        if (sm != null ? !sm.equals(that.sm) : that.sm != null) return false;
        if (idProveedor != null ? !idProveedor.equals(that.idProveedor) : that.idProveedor != null) return false;
        if (rangoPrecio != null ? !rangoPrecio.equals(that.rangoPrecio) : that.rangoPrecio != null) return false;
        if (idFormato != null ? !idFormato.equals(that.idFormato) : that.idFormato != null) return false;
        if (idZona != null ? !idZona.equals(that.idZona) : that.idZona != null) return false;
        if (idRegion != null ? !idRegion.equals(that.idRegion) : that.idRegion != null) return false;
        if (invVenta != null ? !invVenta.equals(that.invVenta) : that.invVenta != null) return false;
        if (vtaProm != null ? !vtaProm.equals(that.vtaProm) : that.vtaProm != null) return false;
        if (invPiezas != null ? !invPiezas.equals(that.invPiezas) : that.invPiezas != null) return false;
        if (vtaPiezas != null ? !vtaPiezas.equals(that.vtaPiezas) : that.vtaPiezas != null) return false;
        if (semanasObj != null ? !semanasObj.equals(that.semanasObj) : that.semanasObj != null) return false;
        if (caducidad != null ? !caducidad.equals(that.caducidad) : that.caducidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (idSubdepartamento != null ? idSubdepartamento.hashCode() : 0);
        result = 31 * result + (idClase != null ? idClase.hashCode() : 0);
        result = 31 * result + (idLlave != null ? idLlave.hashCode() : 0);
        result = 31 * result + (idSubclase != null ? idSubclase.hashCode() : 0);
        result = 31 * result + sku;
        result = 31 * result + (sm != null ? sm.hashCode() : 0);
        result = 31 * result + (idProveedor != null ? idProveedor.hashCode() : 0);
        result = 31 * result + (rangoPrecio != null ? rangoPrecio.hashCode() : 0);
        result = 31 * result + idTienda;
        result = 31 * result + (idFormato != null ? idFormato.hashCode() : 0);
        result = 31 * result + (idZona != null ? idZona.hashCode() : 0);
        result = 31 * result + (idRegion != null ? idRegion.hashCode() : 0);
        result = 31 * result + (invVenta != null ? invVenta.hashCode() : 0);
        result = 31 * result + (vtaProm != null ? vtaProm.hashCode() : 0);
        result = 31 * result + (invPiezas != null ? invPiezas.hashCode() : 0);
        result = 31 * result + (vtaPiezas != null ? vtaPiezas.hashCode() : 0);
        result = 31 * result + (semanasObj != null ? semanasObj.hashCode() : 0);
        result = 31 * result + (caducidad != null ? caducidad.hashCode() : 0);
        return result;
    }
}
