/*
 *      File: RelTiendasEntity.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model;

import java.sql.Timestamp;

import javax.persistence.*;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Entity
@Table(name = "REL_tiendas", schema = "dbo", catalog = "Herramientas")
public class RelTiendasEntity {
    private int id;
    private int idTienda;
    private String nombre;
    private String direccion;
    private String cp;
    private String poblacion;
    private String idRegion;
    private String region;
    private String idFormato;
    private String formato;
    private Timestamp fechaApertura;
    private String tipoTienda;
    private String idZona;
    private String zona;
    private String longitud;
    private String latitud;
    private String activa;
    private String area;

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
     * Getter for nombre.
     * @return nombre.
     **/
    @Basic
    @Column(name = "nombre", nullable = true, length = 255)
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
     * Getter for direccion.
     * @return direccion.
     **/
    @Basic
    @Column(name = "direccion", nullable = true, length = 255)
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter for direccion.
     * @param direccion expected.
     **/
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter for cp.
     * @return cp.
     **/
    @Basic
    @Column(name = "CP", nullable = true, length = 255)
    public String getCp() {
        return cp;
    }

    /**
     * Setter for cp.
     * @param cp expected.
     **/
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * Getter for poblacion.
     * @return poblacion.
     **/
    @Basic
    @Column(name = "poblacion", nullable = true, length = 255)
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Setter for poblacion.
     * @param poblacion expected.
     **/
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
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
     * Getter for fechaApertura.
     * @return fechaApertura.
     **/
    @Basic
    @Column(name = "fecha_apertura", nullable = true)
    public Timestamp getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Setter for fechaApertura.
     * @param fechaApertura expected.
     **/
    public void setFechaApertura(Timestamp fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * Getter for tipoTienda.
     * @return tipoTienda.
     **/
    @Basic
    @Column(name = "tipo_tienda", nullable = true, length = 255)
    public String getTipoTienda() {
        return tipoTienda;
    }

    /**
     * Setter for tipoTienda.
     * @param tipoTienda expected.
     **/
    public void setTipoTienda(String tipoTienda) {
        this.tipoTienda = tipoTienda;
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
     * Getter for longitud.
     * @return longitud.
     **/
    @Basic
    @Column(name = "Longitud", nullable = true, length = 255)
    public String getLongitud() {
        return longitud;
    }

    /**
     * Setter for longitud.
     * @param longitud expected.
     **/
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    /**
     * Getter for latitud.
     * @return latitud.
     **/
    @Basic
    @Column(name = "Latitud", nullable = true, length = 255)
    public String getLatitud() {
        return latitud;
    }

    /**
     * Setter for latitud.
     * @param latitud expected.
     **/
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    /**
     * Getter for activa.
     * @return activa.
     **/
    @Basic
    @Column(name = "Activa", nullable = true, length = 255)
    public String getActiva() {
        return activa;
    }

    /**
     * Setter for activa.
     * @param activa expected.
     **/
    public void setActiva(String activa) {
        this.activa = activa;
    }

    /**
     * Getter for area.
     * @return area.
     **/
    @Basic
    @Column(name = "Area", nullable = true, length = 255)
    public String getArea() {
        return area;
    }

    /**
     * Setter for area.
     * @param area expected.
     **/
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelTiendasEntity that = (RelTiendasEntity) o;

        if (id != that.id) return false;
        if (idTienda != that.idTienda) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (cp != null ? !cp.equals(that.cp) : that.cp != null) return false;
        if (poblacion != null ? !poblacion.equals(that.poblacion) : that.poblacion != null) return false;
        if (idRegion != null ? !idRegion.equals(that.idRegion) : that.idRegion != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (idFormato != null ? !idFormato.equals(that.idFormato) : that.idFormato != null) return false;
        if (formato != null ? !formato.equals(that.formato) : that.formato != null) return false;
        if (fechaApertura != null ? !fechaApertura.equals(that.fechaApertura) : that.fechaApertura != null)
            return false;
        if (tipoTienda != null ? !tipoTienda.equals(that.tipoTienda) : that.tipoTienda != null) return false;
        if (idZona != null ? !idZona.equals(that.idZona) : that.idZona != null) return false;
        if (zona != null ? !zona.equals(that.zona) : that.zona != null) return false;
        if (longitud != null ? !longitud.equals(that.longitud) : that.longitud != null) return false;
        if (latitud != null ? !latitud.equals(that.latitud) : that.latitud != null) return false;
        if (activa != null ? !activa.equals(that.activa) : that.activa != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idTienda;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (cp != null ? cp.hashCode() : 0);
        result = 31 * result + (poblacion != null ? poblacion.hashCode() : 0);
        result = 31 * result + (idRegion != null ? idRegion.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (idFormato != null ? idFormato.hashCode() : 0);
        result = 31 * result + (formato != null ? formato.hashCode() : 0);
        result = 31 * result + (fechaApertura != null ? fechaApertura.hashCode() : 0);
        result = 31 * result + (tipoTienda != null ? tipoTienda.hashCode() : 0);
        result = 31 * result + (idZona != null ? idZona.hashCode() : 0);
        result = 31 * result + (zona != null ? zona.hashCode() : 0);
        result = 31 * result + (longitud != null ? longitud.hashCode() : 0);
        result = 31 * result + (latitud != null ? latitud.hashCode() : 0);
        result = 31 * result + (activa != null ? activa.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        return result;
    }
}
