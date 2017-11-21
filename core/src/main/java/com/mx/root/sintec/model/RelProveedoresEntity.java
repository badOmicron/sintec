/*
 *      File: RelProveedoresEntity.java
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
@Table(name = "REL_proveedores", schema = "dbo", catalog = "Herramientas")
public class RelProveedoresEntity {
    private int id;
    private int idProveedor;
    private String descripcion;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RelProveedoresEntity that = (RelProveedoresEntity) o;

        if (id != that.id) return false;
        if (idProveedor != that.idProveedor) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idProveedor;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
