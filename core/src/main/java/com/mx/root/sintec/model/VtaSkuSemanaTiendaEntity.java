/*
 *      File: VtaSkuSemanaTiendaEntity.java
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
@Table(name = "vta_sku_semana_tienda", schema = "dbo", catalog = "Herramientas")
public class VtaSkuSemanaTiendaEntity {
    private int id;
    private int sku;
    private int semana;
    private int año;
    private int tienda;
    private int mes;
    private Double vtaPiezas;
    private Double vtaCosto;
    private Double vtaPesos;
    private Integer idLlave;

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
     * Getter for semana.
     * @return semana.
     **/
    @Basic
    @Column(name = "semana", nullable = false)
    public int getSemana() {
        return semana;
    }

    /**
     * Setter for semana.
     * @param semana expected.
     **/
    public void setSemana(int semana) {
        this.semana = semana;
    }

    /**
     * Getter for año.
     * @return año.
     **/
    @Basic
    @Column(name = "año", nullable = false)
    public int getAño() {
        return año;
    }

    /**
     * Setter for año.
     * @param año expected.
     **/
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Getter for tienda.
     * @return tienda.
     **/
    @Basic
    @Column(name = "tienda", nullable = false)
    public int getTienda() {
        return tienda;
    }

    /**
     * Setter for tienda.
     * @param tienda expected.
     **/
    public void setTienda(int tienda) {
        this.tienda = tienda;
    }

    /**
     * Getter for mes.
     * @return mes.
     **/
    @Basic
    @Column(name = "mes", nullable = false)
    public int getMes() {
        return mes;
    }

    /**
     * Setter for mes.
     * @param mes expected.
     **/
    public void setMes(int mes) {
        this.mes = mes;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VtaSkuSemanaTiendaEntity that = (VtaSkuSemanaTiendaEntity) o;

        if (id != that.id) return false;
        if (sku != that.sku) return false;
        if (semana != that.semana) return false;
        if (año != that.año) return false;
        if (tienda != that.tienda) return false;
        if (mes != that.mes) return false;
        if (vtaPiezas != null ? !vtaPiezas.equals(that.vtaPiezas) : that.vtaPiezas != null) return false;
        if (vtaCosto != null ? !vtaCosto.equals(that.vtaCosto) : that.vtaCosto != null) return false;
        if (vtaPesos != null ? !vtaPesos.equals(that.vtaPesos) : that.vtaPesos != null) return false;
        if (idLlave != null ? !idLlave.equals(that.idLlave) : that.idLlave != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + sku;
        result = 31 * result + semana;
        result = 31 * result + año;
        result = 31 * result + tienda;
        result = 31 * result + mes;
        result = 31 * result + (vtaPiezas != null ? vtaPiezas.hashCode() : 0);
        result = 31 * result + (vtaCosto != null ? vtaCosto.hashCode() : 0);
        result = 31 * result + (vtaPesos != null ? vtaPesos.hashCode() : 0);
        result = 31 * result + (idLlave != null ? idLlave.hashCode() : 0);
        return result;
    }
}
