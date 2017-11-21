/*
 *      File: TblPlaneacionCatalogoEntity.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 13, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model;

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
@Table(name = "tbl_PlaneacionCatalogo", schema = "dbo", catalog = "Herramientas")
public class TblPlaneacionCatalogoEntity {
    private int id;
    private Date fecha;
    private int idTienda;
    private String tienda;
    private String region;
    private String zona;
    private String formato;
    private Integer idDepartamento;
    private String departamento;
    private Integer idSubdepartamento;
    private String subdepartamento;
    private Integer idClase;
    private String clase;
    private Integer idSubclase;
    private String subclase;
    private int sku;
    private String descripcion;
    private String sm;
    private String nivelPrecio;
    private String descrNivelPrecio;
    private Integer idProveedor;
    private String proveedor;
    private Double vtaPiezas;
    private Double vtaCosto;
    private Double vtaPesos;
    private String atributo1;
    private String nivel1;
    private String atributo2;
    private String nivel2;
    private String atributo3;
    private String nivel3;
    private String atributo4;
    private String nivel4;
    private String atributo5;
    private String nivel5;
    private String atributo6;
    private String nivel6;
    private String atributo7;
    private String nivel7;
    private String atributo8;
    private String nivel8;
    private String atributo9;
    private String nivel9;
    private String atributo10;
    private String nivel10;
    private String atributo11;
    private String nivel11;
    private String atributo12;
    private String nivel12;

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
    @Column(name = "Fecha", nullable = false)
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
     * Getter for idTienda.
     * @return idTienda.
     **/
    @Basic
    @Column(name = "ID_Tienda", nullable = false)
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
     * Getter for nivelPrecio.
     * @return nivelPrecio.
     **/
    @Basic
    @Column(name = "Nivel_Precio", nullable = true, length = 10)
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
     * Getter for descrNivelPrecio.
     * @return descrNivelPrecio.
     **/
    @Basic
    @Column(name = "Descr_Nivel_Precio", nullable = true, length = 65)
    public String getDescrNivelPrecio() {
        return descrNivelPrecio;
    }

    /**
     * Setter for descrNivelPrecio.
     * @param descrNivelPrecio expected.
     **/
    public void setDescrNivelPrecio(String descrNivelPrecio) {
        this.descrNivelPrecio = descrNivelPrecio;
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
    @Column(name = "VtaCosto", nullable = true, precision = 0)
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
     * Getter for atributo1.
     * @return atributo1.
     **/
    @Basic
    @Column(name = "Atributo1", nullable = true, length = 100)
    public String getAtributo1() {
        return atributo1;
    }

    /**
     * Setter for atributo1.
     * @param atributo1 expected.
     **/
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    /**
     * Getter for nivel1.
     * @return nivel1.
     **/
    @Basic
    @Column(name = "Nivel1", nullable = true, length = 255)
    public String getNivel1() {
        return nivel1;
    }

    /**
     * Setter for nivel1.
     * @param nivel1 expected.
     **/
    public void setNivel1(String nivel1) {
        this.nivel1 = nivel1;
    }

    /**
     * Getter for atributo2.
     * @return atributo2.
     **/
    @Basic
    @Column(name = "Atributo2", nullable = true, length = 100)
    public String getAtributo2() {
        return atributo2;
    }

    /**
     * Setter for atributo2.
     * @param atributo2 expected.
     **/
    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    /**
     * Getter for nivel2.
     * @return nivel2.
     **/
    @Basic
    @Column(name = "Nivel2", nullable = true, length = 255)
    public String getNivel2() {
        return nivel2;
    }

    /**
     * Setter for nivel2.
     * @param nivel2 expected.
     **/
    public void setNivel2(String nivel2) {
        this.nivel2 = nivel2;
    }

    /**
     * Getter for atributo3.
     * @return atributo3.
     **/
    @Basic
    @Column(name = "Atributo3", nullable = true, length = 100)
    public String getAtributo3() {
        return atributo3;
    }

    /**
     * Setter for atributo3.
     * @param atributo3 expected.
     **/
    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }

    /**
     * Getter for nivel3.
     * @return nivel3.
     **/
    @Basic
    @Column(name = "Nivel3", nullable = true, length = 255)
    public String getNivel3() {
        return nivel3;
    }

    /**
     * Setter for nivel3.
     * @param nivel3 expected.
     **/
    public void setNivel3(String nivel3) {
        this.nivel3 = nivel3;
    }

    /**
     * Getter for atributo4.
     * @return atributo4.
     **/
    @Basic
    @Column(name = "Atributo4", nullable = true, length = 100)
    public String getAtributo4() {
        return atributo4;
    }

    /**
     * Setter for atributo4.
     * @param atributo4 expected.
     **/
    public void setAtributo4(String atributo4) {
        this.atributo4 = atributo4;
    }

    /**
     * Getter for nivel4.
     * @return nivel4.
     **/
    @Basic
    @Column(name = "Nivel4", nullable = true, length = 255)
    public String getNivel4() {
        return nivel4;
    }

    /**
     * Setter for nivel4.
     * @param nivel4 expected.
     **/
    public void setNivel4(String nivel4) {
        this.nivel4 = nivel4;
    }

    /**
     * Getter for atributo5.
     * @return atributo5.
     **/
    @Basic
    @Column(name = "Atributo5", nullable = true, length = 100)
    public String getAtributo5() {
        return atributo5;
    }

    /**
     * Setter for atributo5.
     * @param atributo5 expected.
     **/
    public void setAtributo5(String atributo5) {
        this.atributo5 = atributo5;
    }

    /**
     * Getter for nivel5.
     * @return nivel5.
     **/
    @Basic
    @Column(name = "Nivel5", nullable = true, length = 255)
    public String getNivel5() {
        return nivel5;
    }

    /**
     * Setter for nivel5.
     * @param nivel5 expected.
     **/
    public void setNivel5(String nivel5) {
        this.nivel5 = nivel5;
    }

    /**
     * Getter for atributo6.
     * @return atributo6.
     **/
    @Basic
    @Column(name = "Atributo6", nullable = true, length = 100)
    public String getAtributo6() {
        return atributo6;
    }

    /**
     * Setter for atributo6.
     * @param atributo6 expected.
     **/
    public void setAtributo6(String atributo6) {
        this.atributo6 = atributo6;
    }

    /**
     * Getter for nivel6.
     * @return nivel6.
     **/
    @Basic
    @Column(name = "Nivel6", nullable = true, length = 255)
    public String getNivel6() {
        return nivel6;
    }

    /**
     * Setter for nivel6.
     * @param nivel6 expected.
     **/
    public void setNivel6(String nivel6) {
        this.nivel6 = nivel6;
    }

    /**
     * Getter for atributo7.
     * @return atributo7.
     **/
    @Basic
    @Column(name = "Atributo7", nullable = true, length = 100)
    public String getAtributo7() {
        return atributo7;
    }

    /**
     * Setter for atributo7.
     * @param atributo7 expected.
     **/
    public void setAtributo7(String atributo7) {
        this.atributo7 = atributo7;
    }

    /**
     * Getter for nivel7.
     * @return nivel7.
     **/
    @Basic
    @Column(name = "Nivel7", nullable = true, length = 255)
    public String getNivel7() {
        return nivel7;
    }

    /**
     * Setter for nivel7.
     * @param nivel7 expected.
     **/
    public void setNivel7(String nivel7) {
        this.nivel7 = nivel7;
    }

    /**
     * Getter for atributo8.
     * @return atributo8.
     **/
    @Basic
    @Column(name = "Atributo8", nullable = true, length = 100)
    public String getAtributo8() {
        return atributo8;
    }

    /**
     * Setter for atributo8.
     * @param atributo8 expected.
     **/
    public void setAtributo8(String atributo8) {
        this.atributo8 = atributo8;
    }

    /**
     * Getter for nivel8.
     * @return nivel8.
     **/
    @Basic
    @Column(name = "Nivel8", nullable = true, length = 255)
    public String getNivel8() {
        return nivel8;
    }

    /**
     * Setter for nivel8.
     * @param nivel8 expected.
     **/
    public void setNivel8(String nivel8) {
        this.nivel8 = nivel8;
    }

    /**
     * Getter for atributo9.
     * @return atributo9.
     **/
    @Basic
    @Column(name = "Atributo9", nullable = true, length = 100)
    public String getAtributo9() {
        return atributo9;
    }

    /**
     * Setter for atributo9.
     * @param atributo9 expected.
     **/
    public void setAtributo9(String atributo9) {
        this.atributo9 = atributo9;
    }

    /**
     * Getter for nivel9.
     * @return nivel9.
     **/
    @Basic
    @Column(name = "Nivel9", nullable = true, length = 255)
    public String getNivel9() {
        return nivel9;
    }

    /**
     * Setter for nivel9.
     * @param nivel9 expected.
     **/
    public void setNivel9(String nivel9) {
        this.nivel9 = nivel9;
    }

    /**
     * Getter for atributo10.
     * @return atributo10.
     **/
    @Basic
    @Column(name = "Atributo10", nullable = true, length = 100)
    public String getAtributo10() {
        return atributo10;
    }

    /**
     * Setter for atributo10.
     * @param atributo10 expected.
     **/
    public void setAtributo10(String atributo10) {
        this.atributo10 = atributo10;
    }

    /**
     * Getter for nivel10.
     * @return nivel10.
     **/
    @Basic
    @Column(name = "Nivel10", nullable = true, length = 255)
    public String getNivel10() {
        return nivel10;
    }

    /**
     * Setter for nivel10.
     * @param nivel10 expected.
     **/
    public void setNivel10(String nivel10) {
        this.nivel10 = nivel10;
    }

    /**
     * Getter for atributo11.
     * @return atributo11.
     **/
    @Basic
    @Column(name = "Atributo11", nullable = true, length = 100)
    public String getAtributo11() {
        return atributo11;
    }

    /**
     * Setter for atributo11.
     * @param atributo11 expected.
     **/
    public void setAtributo11(String atributo11) {
        this.atributo11 = atributo11;
    }

    /**
     * Getter for nivel11.
     * @return nivel11.
     **/
    @Basic
    @Column(name = "Nivel11", nullable = true, length = 255)
    public String getNivel11() {
        return nivel11;
    }

    /**
     * Setter for nivel11.
     * @param nivel11 expected.
     **/
    public void setNivel11(String nivel11) {
        this.nivel11 = nivel11;
    }

    /**
     * Getter for atributo12.
     * @return atributo12.
     **/
    @Basic
    @Column(name = "Atributo12", nullable = true, length = 100)
    public String getAtributo12() {
        return atributo12;
    }

    /**
     * Setter for atributo12.
     * @param atributo12 expected.
     **/
    public void setAtributo12(String atributo12) {
        this.atributo12 = atributo12;
    }

    /**
     * Getter for nivel12.
     * @return nivel12.
     **/
    @Basic
    @Column(name = "Nivel12", nullable = true, length = 255)
    public String getNivel12() {
        return nivel12;
    }

    /**
     * Setter for nivel12.
     * @param nivel12 expected.
     **/
    public void setNivel12(String nivel12) {
        this.nivel12 = nivel12;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblPlaneacionCatalogoEntity that = (TblPlaneacionCatalogoEntity) o;

        if (id != that.id) return false;
        if (idTienda != that.idTienda) return false;
        if (sku != that.sku) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (tienda != null ? !tienda.equals(that.tienda) : that.tienda != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (zona != null ? !zona.equals(that.zona) : that.zona != null) return false;
        if (formato != null ? !formato.equals(that.formato) : that.formato != null) return false;
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
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (sm != null ? !sm.equals(that.sm) : that.sm != null) return false;
        if (nivelPrecio != null ? !nivelPrecio.equals(that.nivelPrecio) : that.nivelPrecio != null) return false;
        if (descrNivelPrecio != null ? !descrNivelPrecio.equals(that.descrNivelPrecio) : that.descrNivelPrecio != null)
            return false;
        if (idProveedor != null ? !idProveedor.equals(that.idProveedor) : that.idProveedor != null) return false;
        if (proveedor != null ? !proveedor.equals(that.proveedor) : that.proveedor != null) return false;
        if (vtaPiezas != null ? !vtaPiezas.equals(that.vtaPiezas) : that.vtaPiezas != null) return false;
        if (vtaCosto != null ? !vtaCosto.equals(that.vtaCosto) : that.vtaCosto != null) return false;
        if (vtaPesos != null ? !vtaPesos.equals(that.vtaPesos) : that.vtaPesos != null) return false;
        if (atributo1 != null ? !atributo1.equals(that.atributo1) : that.atributo1 != null) return false;
        if (nivel1 != null ? !nivel1.equals(that.nivel1) : that.nivel1 != null) return false;
        if (atributo2 != null ? !atributo2.equals(that.atributo2) : that.atributo2 != null) return false;
        if (nivel2 != null ? !nivel2.equals(that.nivel2) : that.nivel2 != null) return false;
        if (atributo3 != null ? !atributo3.equals(that.atributo3) : that.atributo3 != null) return false;
        if (nivel3 != null ? !nivel3.equals(that.nivel3) : that.nivel3 != null) return false;
        if (atributo4 != null ? !atributo4.equals(that.atributo4) : that.atributo4 != null) return false;
        if (nivel4 != null ? !nivel4.equals(that.nivel4) : that.nivel4 != null) return false;
        if (atributo5 != null ? !atributo5.equals(that.atributo5) : that.atributo5 != null) return false;
        if (nivel5 != null ? !nivel5.equals(that.nivel5) : that.nivel5 != null) return false;
        if (atributo6 != null ? !atributo6.equals(that.atributo6) : that.atributo6 != null) return false;
        if (nivel6 != null ? !nivel6.equals(that.nivel6) : that.nivel6 != null) return false;
        if (atributo7 != null ? !atributo7.equals(that.atributo7) : that.atributo7 != null) return false;
        if (nivel7 != null ? !nivel7.equals(that.nivel7) : that.nivel7 != null) return false;
        if (atributo8 != null ? !atributo8.equals(that.atributo8) : that.atributo8 != null) return false;
        if (nivel8 != null ? !nivel8.equals(that.nivel8) : that.nivel8 != null) return false;
        if (atributo9 != null ? !atributo9.equals(that.atributo9) : that.atributo9 != null) return false;
        if (nivel9 != null ? !nivel9.equals(that.nivel9) : that.nivel9 != null) return false;
        if (atributo10 != null ? !atributo10.equals(that.atributo10) : that.atributo10 != null) return false;
        if (nivel10 != null ? !nivel10.equals(that.nivel10) : that.nivel10 != null) return false;
        if (atributo11 != null ? !atributo11.equals(that.atributo11) : that.atributo11 != null) return false;
        if (nivel11 != null ? !nivel11.equals(that.nivel11) : that.nivel11 != null) return false;
        if (atributo12 != null ? !atributo12.equals(that.atributo12) : that.atributo12 != null) return false;
        if (nivel12 != null ? !nivel12.equals(that.nivel12) : that.nivel12 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + idTienda;
        result = 31 * result + (tienda != null ? tienda.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (zona != null ? zona.hashCode() : 0);
        result = 31 * result + (formato != null ? formato.hashCode() : 0);
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (idSubdepartamento != null ? idSubdepartamento.hashCode() : 0);
        result = 31 * result + (subdepartamento != null ? subdepartamento.hashCode() : 0);
        result = 31 * result + (idClase != null ? idClase.hashCode() : 0);
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + (idSubclase != null ? idSubclase.hashCode() : 0);
        result = 31 * result + (subclase != null ? subclase.hashCode() : 0);
        result = 31 * result + sku;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (sm != null ? sm.hashCode() : 0);
        result = 31 * result + (nivelPrecio != null ? nivelPrecio.hashCode() : 0);
        result = 31 * result + (descrNivelPrecio != null ? descrNivelPrecio.hashCode() : 0);
        result = 31 * result + (idProveedor != null ? idProveedor.hashCode() : 0);
        result = 31 * result + (proveedor != null ? proveedor.hashCode() : 0);
        result = 31 * result + (vtaPiezas != null ? vtaPiezas.hashCode() : 0);
        result = 31 * result + (vtaCosto != null ? vtaCosto.hashCode() : 0);
        result = 31 * result + (vtaPesos != null ? vtaPesos.hashCode() : 0);
        result = 31 * result + (atributo1 != null ? atributo1.hashCode() : 0);
        result = 31 * result + (nivel1 != null ? nivel1.hashCode() : 0);
        result = 31 * result + (atributo2 != null ? atributo2.hashCode() : 0);
        result = 31 * result + (nivel2 != null ? nivel2.hashCode() : 0);
        result = 31 * result + (atributo3 != null ? atributo3.hashCode() : 0);
        result = 31 * result + (nivel3 != null ? nivel3.hashCode() : 0);
        result = 31 * result + (atributo4 != null ? atributo4.hashCode() : 0);
        result = 31 * result + (nivel4 != null ? nivel4.hashCode() : 0);
        result = 31 * result + (atributo5 != null ? atributo5.hashCode() : 0);
        result = 31 * result + (nivel5 != null ? nivel5.hashCode() : 0);
        result = 31 * result + (atributo6 != null ? atributo6.hashCode() : 0);
        result = 31 * result + (nivel6 != null ? nivel6.hashCode() : 0);
        result = 31 * result + (atributo7 != null ? atributo7.hashCode() : 0);
        result = 31 * result + (nivel7 != null ? nivel7.hashCode() : 0);
        result = 31 * result + (atributo8 != null ? atributo8.hashCode() : 0);
        result = 31 * result + (nivel8 != null ? nivel8.hashCode() : 0);
        result = 31 * result + (atributo9 != null ? atributo9.hashCode() : 0);
        result = 31 * result + (nivel9 != null ? nivel9.hashCode() : 0);
        result = 31 * result + (atributo10 != null ? atributo10.hashCode() : 0);
        result = 31 * result + (nivel10 != null ? nivel10.hashCode() : 0);
        result = 31 * result + (atributo11 != null ? atributo11.hashCode() : 0);
        result = 31 * result + (nivel11 != null ? nivel11.hashCode() : 0);
        result = 31 * result + (atributo12 != null ? atributo12.hashCode() : 0);
        result = 31 * result + (nivel12 != null ? nivel12.hashCode() : 0);
        return result;
    }
}
