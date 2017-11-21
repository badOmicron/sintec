/*
 *      File: InvSkuSemanaTiendaEntity.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model2;

import javax.persistence.*;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "inv_sku_semana_tienda", schema = "dbo", catalog = "Herramientas")
public class InvSkuSemanaTiendaEntity {
    private int id;
    private int sku;
    private int tienda;
    private int año;
    private int semana;
    private int mes;
    private Integer idLlave;
    private Double invVenta;
    private Double invCosto;
    private Double invPiezas;

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
     * Getter for tienda.
     * @return tienda.
     **/
    @Basic
    @Column(name = "Tienda", nullable = false)
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
     * Getter for mes.
     * @return mes.
     **/
    @Basic
    @Column(name = "Mes", nullable = false)
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
     * Getter for invCosto.
     * @return invCosto.
     **/
    @Basic
    @Column(name = "InvCosto", nullable = true, precision = 0)
    public Double getInvCosto() {
        return invCosto;
    }

    /**
     * Setter for invCosto.
     * @param invCosto expected.
     **/
    public void setInvCosto(Double invCosto) {
        this.invCosto = invCosto;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvSkuSemanaTiendaEntity that = (InvSkuSemanaTiendaEntity) o;

        if (id != that.id) return false;
        if (sku != that.sku) return false;
        if (tienda != that.tienda) return false;
        if (año != that.año) return false;
        if (semana != that.semana) return false;
        if (mes != that.mes) return false;
        if (idLlave != null ? !idLlave.equals(that.idLlave) : that.idLlave != null) return false;
        if (invVenta != null ? !invVenta.equals(that.invVenta) : that.invVenta != null) return false;
        if (invCosto != null ? !invCosto.equals(that.invCosto) : that.invCosto != null) return false;
        if (invPiezas != null ? !invPiezas.equals(that.invPiezas) : that.invPiezas != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + sku;
        result = 31 * result + tienda;
        result = 31 * result + año;
        result = 31 * result + semana;
        result = 31 * result + mes;
        result = 31 * result + (idLlave != null ? idLlave.hashCode() : 0);
        result = 31 * result + (invVenta != null ? invVenta.hashCode() : 0);
        result = 31 * result + (invCosto != null ? invCosto.hashCode() : 0);
        result = 31 * result + (invPiezas != null ? invPiezas.hashCode() : 0);
        return result;
    }
}
