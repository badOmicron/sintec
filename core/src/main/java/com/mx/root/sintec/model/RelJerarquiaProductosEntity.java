/*
 *      File: RelJerarquiaProductosEntity.java
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
@Table(name = "REL_Jerarquia_Productos", schema = "dbo", catalog = "Herramientas")
public class RelJerarquiaProductosEntity {
    private int id;
    private int idDepartamento;
    private String departamento;
    private int idSubdepartamento;
    private String subdepartamento;
    private int idClase;
    private String clase;
    private int idLlave;
    private int idSubclase;
    private String subclase;
    private String familia;
    private String familiaDescripcion;
    private String subfamilia;
    private String subfamiliaDescripcion;

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
    @Column(name = "id_departamento", nullable = false)
    public int getIdDepartamento() {
        return idDepartamento;
    }

    /**
     * Setter for idDepartamento.
     * @param idDepartamento expected.
     **/
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    /**
     * Getter for departamento.
     * @return departamento.
     **/
    @Basic
    @Column(name = "departamento", nullable = false, length = 255)
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
    @Column(name = "id_subdepartamento", nullable = false)
    public int getIdSubdepartamento() {
        return idSubdepartamento;
    }

    /**
     * Setter for idSubdepartamento.
     * @param idSubdepartamento expected.
     **/
    public void setIdSubdepartamento(int idSubdepartamento) {
        this.idSubdepartamento = idSubdepartamento;
    }

    /**
     * Getter for subdepartamento.
     * @return subdepartamento.
     **/
    @Basic
    @Column(name = "subdepartamento", nullable = false, length = 255)
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
    @Column(name = "id_clase", nullable = false)
    public int getIdClase() {
        return idClase;
    }

    /**
     * Setter for idClase.
     * @param idClase expected.
     **/
    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    /**
     * Getter for clase.
     * @return clase.
     **/
    @Basic
    @Column(name = "clase", nullable = false, length = 255)
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
     * Getter for idSubclase.
     * @return idSubclase.
     **/
    @Basic
    @Column(name = "id_subclase", nullable = false, length = 255)
    public int getIdSubclase() {
        return idSubclase;
    }

    /**
     * Setter for idSubclase.
     * @param idSubclase expected.
     **/
    public void setIdSubclase(int idSubclase) {
        this.idSubclase = idSubclase;
    }

    /**
     * Getter for subclase.
     * @return subclase.
     **/
    @Basic
    @Column(name = "subclase", nullable = false, length = 255)
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
     * Getter for familia.
     * @return familia.
     **/
    @Basic
    @Column(name = "familia", nullable = true, length = 255)
    public String getFamilia() {
        return familia;
    }

    /**
     * Setter for familia.
     * @param familia expected.
     **/
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * Getter for familiaDescripcion.
     * @return familiaDescripcion.
     **/
    @Basic
    @Column(name = "familia_descripcion", nullable = true, length = 255)
    public String getFamiliaDescripcion() {
        return familiaDescripcion;
    }

    /**
     * Setter for familiaDescripcion.
     * @param familiaDescripcion expected.
     **/
    public void setFamiliaDescripcion(String familiaDescripcion) {
        this.familiaDescripcion = familiaDescripcion;
    }

    /**
     * Getter for subfamilia.
     * @return subfamilia.
     **/
    @Basic
    @Column(name = "subfamilia", nullable = true, length = 255)
    public String getSubfamilia() {
        return subfamilia;
    }

    /**
     * Setter for subfamilia.
     * @param subfamilia expected.
     **/
    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }

    /**
     * Getter for subfamiliaDescripcion.
     * @return subfamiliaDescripcion.
     **/
    @Basic
    @Column(name = "subfamilia_descripcion", nullable = true, length = 255)
    public String getSubfamiliaDescripcion() {
        return subfamiliaDescripcion;
    }

    /**
     * Setter for subfamiliaDescripcion.
     * @param subfamiliaDescripcion expected.
     **/
    public void setSubfamiliaDescripcion(String subfamiliaDescripcion) {
        this.subfamiliaDescripcion = subfamiliaDescripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelJerarquiaProductosEntity that = (RelJerarquiaProductosEntity) o;

        if (id != that.id) return false;
        if (idDepartamento != that.idDepartamento) return false;
        if (idSubdepartamento != that.idSubdepartamento) return false;
        if (idClase != that.idClase) return false;
        if (idLlave != that.idLlave) return false;
        if (idSubclase != that.idSubclase ) return false;
        if (departamento != null ? !departamento.equals(that.departamento) : that.departamento != null) return false;
        if (subdepartamento != null ? !subdepartamento.equals(that.subdepartamento) : that.subdepartamento != null)
            return false;
        if (clase != null ? !clase.equals(that.clase) : that.clase != null) return false;
        if (subclase != null ? !subclase.equals(that.subclase) : that.subclase != null) return false;
        if (familia != null ? !familia.equals(that.familia) : that.familia != null) return false;
        if (familiaDescripcion != null ? !familiaDescripcion.equals(
                that.familiaDescripcion) : that.familiaDescripcion != null) return false;
        if (subfamilia != null ? !subfamilia.equals(that.subfamilia) : that.subfamilia != null) return false;
        if (subfamiliaDescripcion != null ? !subfamiliaDescripcion.equals(
                that.subfamiliaDescripcion) : that.subfamiliaDescripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idDepartamento;
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + idSubdepartamento;
        result = 31 * result + (subdepartamento != null ? subdepartamento.hashCode() : 0);
        result = 31 * result + idClase;
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + idLlave;
        result = 31 * result + idSubclase;
        result = 31 * result + (subclase != null ? subclase.hashCode() : 0);
        result = 31 * result + (familia != null ? familia.hashCode() : 0);
        result = 31 * result + (familiaDescripcion != null ? familiaDescripcion.hashCode() : 0);
        result = 31 * result + (subfamilia != null ? subfamilia.hashCode() : 0);
        result = 31 * result + (subfamiliaDescripcion != null ? subfamiliaDescripcion.hashCode() : 0);
        return result;
    }
}
