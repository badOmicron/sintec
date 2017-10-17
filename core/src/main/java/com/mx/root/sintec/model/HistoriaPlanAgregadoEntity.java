/*
 *      File: HistoriaPlanAgregadoEntity.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model2;

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
@Table(name = "Historia_PlanAgregado", schema = "dbo", catalog = "Herramientas")
public class HistoriaPlanAgregadoEntity {
    private int id;
    private Date fecha;
    private Integer idNivelPrecio;
    private Integer idProveedor;
    private String proveedor;
    private Integer idSubclase;
    private String subclase;
    private Integer idClase;
    private String clase;
    private Integer idSubdepartamento;
    private String subdepartamento;
    private Integer idDepartamento;
    private String departamento;
    private Double ventaActual;
    private Double venta1;
    private Double venta2;
    private Double pronostico;
    private Double presupuestoVentas;
    private Double presupuestoVentasAa;

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
     * Getter for idNivelPrecio.
     * @return idNivelPrecio.
     **/
    @Basic
    @Column(name = "id_nivel_precio", nullable = true)
    public Integer getIdNivelPrecio() {
        return idNivelPrecio;
    }

    /**
     * Setter for idNivelPrecio.
     * @param idNivelPrecio expected.
     **/
    public void setIdNivelPrecio(Integer idNivelPrecio) {
        this.idNivelPrecio = idNivelPrecio;
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
     * Getter for ventaActual.
     * @return ventaActual.
     **/
    @Basic
    @Column(name = "Venta_actual", nullable = true, precision = 0)
    public Double getVentaActual() {
        return ventaActual;
    }

    /**
     * Setter for ventaActual.
     * @param ventaActual expected.
     **/
    public void setVentaActual(Double ventaActual) {
        this.ventaActual = ventaActual;
    }

    /**
     * Getter for venta1.
     * @return venta1.
     **/
    @Basic
    @Column(name = "Venta_1", nullable = true, precision = 0)
    public Double getVenta1() {
        return venta1;
    }

    /**
     * Setter for venta1.
     * @param venta1 expected.
     **/
    public void setVenta1(Double venta1) {
        this.venta1 = venta1;
    }

    /**
     * Getter for venta2.
     * @return venta2.
     **/
    @Basic
    @Column(name = "Venta_2", nullable = true, precision = 0)
    public Double getVenta2() {
        return venta2;
    }

    /**
     * Setter for venta2.
     * @param venta2 expected.
     **/
    public void setVenta2(Double venta2) {
        this.venta2 = venta2;
    }

    /**
     * Getter for pronostico.
     * @return pronostico.
     **/
    @Basic
    @Column(name = "Pronostico", nullable = true, precision = 0)
    public Double getPronostico() {
        return pronostico;
    }

    /**
     * Setter for pronostico.
     * @param pronostico expected.
     **/
    public void setPronostico(Double pronostico) {
        this.pronostico = pronostico;
    }

    /**
     * Getter for presupuestoVentas.
     * @return presupuestoVentas.
     **/
    @Basic
    @Column(name = "Presupuesto_ventas", nullable = true, precision = 0)
    public Double getPresupuestoVentas() {
        return presupuestoVentas;
    }

    /**
     * Setter for presupuestoVentas.
     * @param presupuestoVentas expected.
     **/
    public void setPresupuestoVentas(Double presupuestoVentas) {
        this.presupuestoVentas = presupuestoVentas;
    }

    /**
     * Getter for presupuestoVentasAa.
     * @return presupuestoVentasAa.
     **/
    @Basic
    @Column(name = "Presupuesto_ventasAA", nullable = true, precision = 0)
    public Double getPresupuestoVentasAa() {
        return presupuestoVentasAa;
    }

    /**
     * Setter for presupuestoVentasAa.
     * @param presupuestoVentasAa expected.
     **/
    public void setPresupuestoVentasAa(Double presupuestoVentasAa) {
        this.presupuestoVentasAa = presupuestoVentasAa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoriaPlanAgregadoEntity that = (HistoriaPlanAgregadoEntity) o;

        if (id != that.id) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (idNivelPrecio != null ? !idNivelPrecio.equals(that.idNivelPrecio) : that.idNivelPrecio != null)
            return false;
        if (idProveedor != null ? !idProveedor.equals(that.idProveedor) : that.idProveedor != null) return false;
        if (proveedor != null ? !proveedor.equals(that.proveedor) : that.proveedor != null) return false;
        if (idSubclase != null ? !idSubclase.equals(that.idSubclase) : that.idSubclase != null) return false;
        if (subclase != null ? !subclase.equals(that.subclase) : that.subclase != null) return false;
        if (idClase != null ? !idClase.equals(that.idClase) : that.idClase != null) return false;
        if (clase != null ? !clase.equals(that.clase) : that.clase != null) return false;
        if (idSubdepartamento != null ? !idSubdepartamento.equals(
                that.idSubdepartamento) : that.idSubdepartamento != null)
            return false;
        if (subdepartamento != null ? !subdepartamento.equals(that.subdepartamento) : that.subdepartamento != null)
            return false;
        if (idDepartamento != null ? !idDepartamento.equals(that.idDepartamento) : that.idDepartamento != null)
            return false;
        if (departamento != null ? !departamento.equals(that.departamento) : that.departamento != null) return false;
        if (ventaActual != null ? !ventaActual.equals(that.ventaActual) : that.ventaActual != null) return false;
        if (venta1 != null ? !venta1.equals(that.venta1) : that.venta1 != null) return false;
        if (venta2 != null ? !venta2.equals(that.venta2) : that.venta2 != null) return false;
        if (pronostico != null ? !pronostico.equals(that.pronostico) : that.pronostico != null) return false;
        if (presupuestoVentas != null ? !presupuestoVentas.equals(
                that.presupuestoVentas) : that.presupuestoVentas != null)
            return false;
        if (presupuestoVentasAa != null ? !presupuestoVentasAa.equals(
                that.presupuestoVentasAa) : that.presupuestoVentasAa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (idNivelPrecio != null ? idNivelPrecio.hashCode() : 0);
        result = 31 * result + (idProveedor != null ? idProveedor.hashCode() : 0);
        result = 31 * result + (proveedor != null ? proveedor.hashCode() : 0);
        result = 31 * result + (idSubclase != null ? idSubclase.hashCode() : 0);
        result = 31 * result + (subclase != null ? subclase.hashCode() : 0);
        result = 31 * result + (idClase != null ? idClase.hashCode() : 0);
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + (idSubdepartamento != null ? idSubdepartamento.hashCode() : 0);
        result = 31 * result + (subdepartamento != null ? subdepartamento.hashCode() : 0);
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (ventaActual != null ? ventaActual.hashCode() : 0);
        result = 31 * result + (venta1 != null ? venta1.hashCode() : 0);
        result = 31 * result + (venta2 != null ? venta2.hashCode() : 0);
        result = 31 * result + (pronostico != null ? pronostico.hashCode() : 0);
        result = 31 * result + (presupuestoVentas != null ? presupuestoVentas.hashCode() : 0);
        result = 31 * result + (presupuestoVentasAa != null ? presupuestoVentasAa.hashCode() : 0);
        return result;
    }
}
