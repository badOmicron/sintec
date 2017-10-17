/*
 *      File: RelProductosEntity.java
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
@Table(name = "REL_productos", schema = "dbo", catalog = "Herramientas")
public class RelProductosEntity {
    private int id;
    private int sku;
    private int idLlave;
    private String status;
    private String descripcion;
    private int idProveedor;
    private Timestamp fechaCreacion;
    private Integer idTemporada;
    private Integer idGradoDeModa;
    private Double margenPromedio;
    private Double precioVenta;
    private Double precioCompra;
    private Integer unidadesEmpaque;
    private String ump;
    private Integer unidadesPallet;
    private Integer unidadesCama;
    private String marcaPropia;
    private String importaciones;
    private String gourmet;
    private String comprador;
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
     * Getter for idLlave.
     * @return idLlave.
     **/
    @Basic
    @Column(name = "id_llave", nullable = false)
    public int getIdLlave() {
        return idLlave;
    }

    /**
     * Setter for idLlave.
     * @param idLlave expected.
     **/
    public void setIdLlave(int idLlave) {
        this.idLlave = idLlave;
    }

    /**
     * Getter for status.
     * @return status.
     **/
    @Basic
    @Column(name = "Status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for status.
     * @param status expected.
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for descripcion.
     * @return descripcion.
     **/
    @Basic
    @Column(name = "descripcion", nullable = true, length = 255)
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
     * Getter for idProveedor.
     * @return idProveedor.
     **/
    @Basic
    @Column(name = "id_proveedor", nullable = false)
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * Setter for idProveedor.
     * @param idProveedor expected.
     **/
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * Getter for fechaCreacion.
     * @return fechaCreacion.
     **/
    @Basic
    @Column(name = "fecha_creacion", nullable = true)
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Setter for fechaCreacion.
     * @param fechaCreacion expected.
     **/
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Getter for idTemporada.
     * @return idTemporada.
     **/
    @Basic
    @Column(name = "id_temporada", nullable = true)
    public Integer getIdTemporada() {
        return idTemporada;
    }

    /**
     * Setter for idTemporada.
     * @param idTemporada expected.
     **/
    public void setIdTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
    }

    /**
     * Getter for idGradoDeModa.
     * @return idGradoDeModa.
     **/
    @Basic
    @Column(name = "id_grado_de_moda", nullable = true)
    public Integer getIdGradoDeModa() {
        return idGradoDeModa;
    }

    /**
     * Setter for idGradoDeModa.
     * @param idGradoDeModa expected.
     **/
    public void setIdGradoDeModa(Integer idGradoDeModa) {
        this.idGradoDeModa = idGradoDeModa;
    }

    /**
     * Getter for margenPromedio.
     * @return margenPromedio.
     **/
    @Basic
    @Column(name = "margen_promedio", nullable = true, precision = 0)
    public Double getMargenPromedio() {
        return margenPromedio;
    }

    /**
     * Setter for margenPromedio.
     * @param margenPromedio expected.
     **/
    public void setMargenPromedio(Double margenPromedio) {
        this.margenPromedio = margenPromedio;
    }

    /**
     * Getter for precioVenta.
     * @return precioVenta.
     **/
    @Basic
    @Column(name = "precio_venta", nullable = true, precision = 0)
    public Double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Setter for precioVenta.
     * @param precioVenta expected.
     **/
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Getter for precioCompra.
     * @return precioCompra.
     **/
    @Basic
    @Column(name = "precio_compra", nullable = true, precision = 0)
    public Double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * Setter for precioCompra.
     * @param precioCompra expected.
     **/
    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * Getter for unidadesEmpaque.
     * @return unidadesEmpaque.
     **/
    @Basic
    @Column(name = "unidades_empaque", nullable = true)
    public Integer getUnidadesEmpaque() {
        return unidadesEmpaque;
    }

    /**
     * Setter for unidadesEmpaque.
     * @param unidadesEmpaque expected.
     **/
    public void setUnidadesEmpaque(Integer unidadesEmpaque) {
        this.unidadesEmpaque = unidadesEmpaque;
    }

    /**
     * Getter for ump.
     * @return ump.
     **/
    @Basic
    @Column(name = "UMP", nullable = true, length = 10)
    public String getUmp() {
        return ump;
    }

    /**
     * Setter for ump.
     * @param ump expected.
     **/
    public void setUmp(String ump) {
        this.ump = ump;
    }

    /**
     * Getter for unidadesPallet.
     * @return unidadesPallet.
     **/
    @Basic
    @Column(name = "unidades_pallet", nullable = true)
    public Integer getUnidadesPallet() {
        return unidadesPallet;
    }

    /**
     * Setter for unidadesPallet.
     * @param unidadesPallet expected.
     **/
    public void setUnidadesPallet(Integer unidadesPallet) {
        this.unidadesPallet = unidadesPallet;
    }

    /**
     * Getter for unidadesCama.
     * @return unidadesCama.
     **/
    @Basic
    @Column(name = "unidades_cama", nullable = true)
    public Integer getUnidadesCama() {
        return unidadesCama;
    }

    /**
     * Setter for unidadesCama.
     * @param unidadesCama expected.
     **/
    public void setUnidadesCama(Integer unidadesCama) {
        this.unidadesCama = unidadesCama;
    }

    /**
     * Getter for marcaPropia.
     * @return marcaPropia.
     **/
    @Basic
    @Column(name = "Marca_propia", nullable = true, length = 1)
    public String getMarcaPropia() {
        return marcaPropia;
    }

    /**
     * Setter for marcaPropia.
     * @param marcaPropia expected.
     **/
    public void setMarcaPropia(String marcaPropia) {
        this.marcaPropia = marcaPropia;
    }

    /**
     * Getter for importaciones.
     * @return importaciones.
     **/
    @Basic
    @Column(name = "Importaciones", nullable = true, length = 1)
    public String getImportaciones() {
        return importaciones;
    }

    /**
     * Setter for importaciones.
     * @param importaciones expected.
     **/
    public void setImportaciones(String importaciones) {
        this.importaciones = importaciones;
    }

    /**
     * Getter for gourmet.
     * @return gourmet.
     **/
    @Basic
    @Column(name = "Gourmet", nullable = true, length = 1)
    public String getGourmet() {
        return gourmet;
    }

    /**
     * Setter for gourmet.
     * @param gourmet expected.
     **/
    public void setGourmet(String gourmet) {
        this.gourmet = gourmet;
    }

    /**
     * Getter for comprador.
     * @return comprador.
     **/
    @Basic
    @Column(name = "Comprador", nullable = true, length = 5)
    public String getComprador() {
        return comprador;
    }

    /**
     * Setter for comprador.
     * @param comprador expected.
     **/
    public void setComprador(String comprador) {
        this.comprador = comprador;
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

        RelProductosEntity that = (RelProductosEntity) o;

        if (id != that.id) return false;
        if (sku != that.sku) return false;
        if (idLlave != that.idLlave) return false;
        if (idProveedor != that.idProveedor) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (idTemporada != null ? !idTemporada.equals(that.idTemporada) : that.idTemporada != null) return false;
        if (idGradoDeModa != null ? !idGradoDeModa.equals(that.idGradoDeModa) : that.idGradoDeModa != null)
            return false;
        if (margenPromedio != null ? !margenPromedio.equals(that.margenPromedio) : that.margenPromedio != null)
            return false;
        if (precioVenta != null ? !precioVenta.equals(that.precioVenta) : that.precioVenta != null) return false;
        if (precioCompra != null ? !precioCompra.equals(that.precioCompra) : that.precioCompra != null) return false;
        if (unidadesEmpaque != null ? !unidadesEmpaque.equals(that.unidadesEmpaque) : that.unidadesEmpaque != null)
            return false;
        if (ump != null ? !ump.equals(that.ump) : that.ump != null) return false;
        if (unidadesPallet != null ? !unidadesPallet.equals(that.unidadesPallet) : that.unidadesPallet != null)
            return false;
        if (unidadesCama != null ? !unidadesCama.equals(that.unidadesCama) : that.unidadesCama != null) return false;
        if (marcaPropia != null ? !marcaPropia.equals(that.marcaPropia) : that.marcaPropia != null) return false;
        if (importaciones != null ? !importaciones.equals(that.importaciones) : that.importaciones != null)
            return false;
        if (gourmet != null ? !gourmet.equals(that.gourmet) : that.gourmet != null) return false;
        if (comprador != null ? !comprador.equals(that.comprador) : that.comprador != null) return false;
        if (caducidad != null ? !caducidad.equals(that.caducidad) : that.caducidad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + sku;
        result = 31 * result + idLlave;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + idProveedor;
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (idTemporada != null ? idTemporada.hashCode() : 0);
        result = 31 * result + (idGradoDeModa != null ? idGradoDeModa.hashCode() : 0);
        result = 31 * result + (margenPromedio != null ? margenPromedio.hashCode() : 0);
        result = 31 * result + (precioVenta != null ? precioVenta.hashCode() : 0);
        result = 31 * result + (precioCompra != null ? precioCompra.hashCode() : 0);
        result = 31 * result + (unidadesEmpaque != null ? unidadesEmpaque.hashCode() : 0);
        result = 31 * result + (ump != null ? ump.hashCode() : 0);
        result = 31 * result + (unidadesPallet != null ? unidadesPallet.hashCode() : 0);
        result = 31 * result + (unidadesCama != null ? unidadesCama.hashCode() : 0);
        result = 31 * result + (marcaPropia != null ? marcaPropia.hashCode() : 0);
        result = 31 * result + (importaciones != null ? importaciones.hashCode() : 0);
        result = 31 * result + (gourmet != null ? gourmet.hashCode() : 0);
        result = 31 * result + (comprador != null ? comprador.hashCode() : 0);
        result = 31 * result + (caducidad != null ? caducidad.hashCode() : 0);
        return result;
    }
}
