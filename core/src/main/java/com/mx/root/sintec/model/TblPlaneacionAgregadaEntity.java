/*
 *      File: TblPlaneacionAgregadaEntity.java
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
@Table(name = "tbl_PlaneacionAgregada", schema = "dbo", catalog = "Herramientas")
public class TblPlaneacionAgregadaEntity {
    private int id;
    private Integer año;
    private Integer mes;
    private Date fecha;
    private Integer idProveedor;
    private String proveedor;
    private Integer idDepartamento;
    private String departamento;
    private Integer idSubdepartamento;
    private String subdepartamento;
    private Integer idClase;
    private String clase;
    private Integer idSubclase;
    private String subclase;
    private Integer idNivelPrecio;
    private String descrNivel;
    private String rangoPrecio;
    private Double invIniVta;
    private Double invCostoAa;
    private Double invPzAa;
    private Double invVtaAa;
    private Double devProy;
    private Double mermasProy;
    private Double rebProy;
    private Double degProy;
    private Double salidasProy;
    private Double devAa;
    private Double mermasAa;
    private Double rebAa;
    private Double degAa;
    private Double salidasAa;
    private Double pronostico;
    private Double ventaA1;
    private Double ventaA2;
    private Double invFinProy;
    private Double invFinAaVta;
    private Double invFinAaPz;
    private Double invFinAaCosto;
    private Double compraAa;
    private Double vtaPpto;
    private double partNr;
    private Double transitos;

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
     * Getter for descrNivel.
     * @return descrNivel.
     **/
    @Basic
    @Column(name = "Descr_Nivel", nullable = true, length = 100)
    public String getDescrNivel() {
        return descrNivel;
    }

    /**
     * Setter for descrNivel.
     * @param descrNivel expected.
     **/
    public void setDescrNivel(String descrNivel) {
        this.descrNivel = descrNivel;
    }

    /**
     * Getter for rangoPrecio.
     * @return rangoPrecio.
     **/
    @Basic
    @Column(name = "Rango_Precio", nullable = true, length = 61)
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
     * Getter for invIniVta.
     * @return invIniVta.
     **/
    @Basic
    @Column(name = "Inv_Ini_Vta", nullable = true, precision = 0)
    public Double getInvIniVta() {
        return invIniVta;
    }

    /**
     * Setter for invIniVta.
     * @param invIniVta expected.
     **/
    public void setInvIniVta(Double invIniVta) {
        this.invIniVta = invIniVta;
    }

    /**
     * Getter for invCostoAa.
     * @return invCostoAa.
     **/
    @Basic
    @Column(name = "Inv_CostoAA", nullable = true, precision = 0)
    public Double getInvCostoAa() {
        return invCostoAa;
    }

    /**
     * Setter for invCostoAa.
     * @param invCostoAa expected.
     **/
    public void setInvCostoAa(Double invCostoAa) {
        this.invCostoAa = invCostoAa;
    }

    /**
     * Getter for invPzAa.
     * @return invPzAa.
     **/
    @Basic
    @Column(name = "Inv_PzAA", nullable = true, precision = 0)
    public Double getInvPzAa() {
        return invPzAa;
    }

    /**
     * Setter for invPzAa.
     * @param invPzAa expected.
     **/
    public void setInvPzAa(Double invPzAa) {
        this.invPzAa = invPzAa;
    }

    /**
     * Getter for invVtaAa.
     * @return invVtaAa.
     **/
    @Basic
    @Column(name = "Inv_VtaAA", nullable = true, precision = 0)
    public Double getInvVtaAa() {
        return invVtaAa;
    }

    /**
     * Setter for invVtaAa.
     * @param invVtaAa expected.
     **/
    public void setInvVtaAa(Double invVtaAa) {
        this.invVtaAa = invVtaAa;
    }

    /**
     * Getter for devProy.
     * @return devProy.
     **/
    @Basic
    @Column(name = "DevProy", nullable = true, precision = 0)
    public Double getDevProy() {
        return devProy;
    }

    /**
     * Setter for devProy.
     * @param devProy expected.
     **/
    public void setDevProy(Double devProy) {
        this.devProy = devProy;
    }

    /**
     * Getter for mermasProy.
     * @return mermasProy.
     **/
    @Basic
    @Column(name = "MermasProy", nullable = true, precision = 0)
    public Double getMermasProy() {
        return mermasProy;
    }

    /**
     * Setter for mermasProy.
     * @param mermasProy expected.
     **/
    public void setMermasProy(Double mermasProy) {
        this.mermasProy = mermasProy;
    }

    /**
     * Getter for rebProy.
     * @return rebProy.
     **/
    @Basic
    @Column(name = "RebProy", nullable = true, precision = 0)
    public Double getRebProy() {
        return rebProy;
    }

    /**
     * Setter for rebProy.
     * @param rebProy expected.
     **/
    public void setRebProy(Double rebProy) {
        this.rebProy = rebProy;
    }

    /**
     * Getter for degProy.
     * @return degProy.
     **/
    @Basic
    @Column(name = "DegProy", nullable = true, precision = 0)
    public Double getDegProy() {
        return degProy;
    }

    /**
     * Setter for degProy.
     * @param degProy expected.
     **/
    public void setDegProy(Double degProy) {
        this.degProy = degProy;
    }

    /**
     * Getter for salidasProy.
     * @return salidasProy.
     **/
    @Basic
    @Column(name = "SalidasProy", nullable = true, precision = 0)
    public Double getSalidasProy() {
        return salidasProy;
    }

    /**
     * Setter for salidasProy.
     * @param salidasProy expected.
     **/
    public void setSalidasProy(Double salidasProy) {
        this.salidasProy = salidasProy;
    }

    /**
     * Getter for devAa.
     * @return devAa.
     **/
    @Basic
    @Column(name = "DevAA", nullable = true, precision = 0)
    public Double getDevAa() {
        return devAa;
    }

    /**
     * Setter for devAa.
     * @param devAa expected.
     **/
    public void setDevAa(Double devAa) {
        this.devAa = devAa;
    }

    /**
     * Getter for mermasAa.
     * @return mermasAa.
     **/
    @Basic
    @Column(name = "MermasAA", nullable = true, precision = 0)
    public Double getMermasAa() {
        return mermasAa;
    }

    /**
     * Setter for mermasAa.
     * @param mermasAa expected.
     **/
    public void setMermasAa(Double mermasAa) {
        this.mermasAa = mermasAa;
    }

    /**
     * Getter for rebAa.
     * @return rebAa.
     **/
    @Basic
    @Column(name = "RebAA", nullable = true, precision = 0)
    public Double getRebAa() {
        return rebAa;
    }

    /**
     * Setter for rebAa.
     * @param rebAa expected.
     **/
    public void setRebAa(Double rebAa) {
        this.rebAa = rebAa;
    }

    /**
     * Getter for degAa.
     * @return degAa.
     **/
    @Basic
    @Column(name = "DegAA", nullable = true, precision = 0)
    public Double getDegAa() {
        return degAa;
    }

    /**
     * Setter for degAa.
     * @param degAa expected.
     **/
    public void setDegAa(Double degAa) {
        this.degAa = degAa;
    }

    /**
     * Getter for salidasAa.
     * @return salidasAa.
     **/
    @Basic
    @Column(name = "SalidasAA", nullable = true, precision = 0)
    public Double getSalidasAa() {
        return salidasAa;
    }

    /**
     * Setter for salidasAa.
     * @param salidasAa expected.
     **/
    public void setSalidasAa(Double salidasAa) {
        this.salidasAa = salidasAa;
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
     * Getter for ventaA1.
     * @return ventaA1.
     **/
    @Basic
    @Column(name = "VentaA1", nullable = true, precision = 0)
    public Double getVentaA1() {
        return ventaA1;
    }

    /**
     * Setter for ventaA1.
     * @param ventaA1 expected.
     **/
    public void setVentaA1(Double ventaA1) {
        this.ventaA1 = ventaA1;
    }

    /**
     * Getter for ventaA2.
     * @return ventaA2.
     **/
    @Basic
    @Column(name = "VentaA2", nullable = true, precision = 0)
    public Double getVentaA2() {
        return ventaA2;
    }

    /**
     * Setter for ventaA2.
     * @param ventaA2 expected.
     **/
    public void setVentaA2(Double ventaA2) {
        this.ventaA2 = ventaA2;
    }

    /**
     * Getter for invFinProy.
     * @return invFinProy.
     **/
    @Basic
    @Column(name = "InvFinProy", nullable = true, precision = 0)
    public Double getInvFinProy() {
        return invFinProy;
    }

    /**
     * Setter for invFinProy.
     * @param invFinProy expected.
     **/
    public void setInvFinProy(Double invFinProy) {
        this.invFinProy = invFinProy;
    }

    /**
     * Getter for invFinAaVta.
     * @return invFinAaVta.
     **/
    @Basic
    @Column(name = "InvFinAAVta", nullable = true, precision = 0)
    public Double getInvFinAaVta() {
        return invFinAaVta;
    }

    /**
     * Setter for invFinAaVta.
     * @param invFinAaVta expected.
     **/
    public void setInvFinAaVta(Double invFinAaVta) {
        this.invFinAaVta = invFinAaVta;
    }

    /**
     * Getter for invFinAaPz.
     * @return invFinAaPz.
     **/
    @Basic
    @Column(name = "InvFinAAPz", nullable = true, precision = 0)
    public Double getInvFinAaPz() {
        return invFinAaPz;
    }

    /**
     * Setter for invFinAaPz.
     * @param invFinAaPz expected.
     **/
    public void setInvFinAaPz(Double invFinAaPz) {
        this.invFinAaPz = invFinAaPz;
    }

    /**
     * Getter for invFinAaCosto.
     * @return invFinAaCosto.
     **/
    @Basic
    @Column(name = "InvFinAACosto", nullable = true, precision = 0)
    public Double getInvFinAaCosto() {
        return invFinAaCosto;
    }

    /**
     * Setter for invFinAaCosto.
     * @param invFinAaCosto expected.
     **/
    public void setInvFinAaCosto(Double invFinAaCosto) {
        this.invFinAaCosto = invFinAaCosto;
    }

    /**
     * Getter for compraAa.
     * @return compraAa.
     **/
    @Basic
    @Column(name = "CompraAA", nullable = true, precision = 0)
    public Double getCompraAa() {
        return compraAa;
    }

    /**
     * Setter for compraAa.
     * @param compraAa expected.
     **/
    public void setCompraAa(Double compraAa) {
        this.compraAa = compraAa;
    }

    /**
     * Getter for vtaPpto.
     * @return vtaPpto.
     **/
    @Basic
    @Column(name = "VtaPpto", nullable = true, precision = 0)
    public Double getVtaPpto() {
        return vtaPpto;
    }

    /**
     * Setter for vtaPpto.
     * @param vtaPpto expected.
     **/
    public void setVtaPpto(Double vtaPpto) {
        this.vtaPpto = vtaPpto;
    }

    /**
     * Getter for partNr.
     * @return partNr.
     **/
    @Basic
    @Column(name = "PartNR", nullable = false, precision = 0)
    public double getPartNr() {
        return partNr;
    }

    /**
     * Setter for partNr.
     * @param partNr expected.
     **/
    public void setPartNr(double partNr) {
        this.partNr = partNr;
    }

    /**
     * Getter for transitos.
     * @return transitos.
     **/
    @Basic
    @Column(name = "transitos", nullable = true, precision = 0)
    public Double getTransitos() {
        return transitos;
    }

    /**
     * Setter for transitos.
     * @param transitos expected.
     **/
    public void setTransitos(Double transitos) {
        this.transitos = transitos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblPlaneacionAgregadaEntity that = (TblPlaneacionAgregadaEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.partNr, partNr) != 0) return false;
        if (año != null ? !año.equals(that.año) : that.año != null) return false;
        if (mes != null ? !mes.equals(that.mes) : that.mes != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (idProveedor != null ? !idProveedor.equals(that.idProveedor) : that.idProveedor != null) return false;
        if (proveedor != null ? !proveedor.equals(that.proveedor) : that.proveedor != null) return false;
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
        if (idNivelPrecio != null ? !idNivelPrecio.equals(that.idNivelPrecio) : that.idNivelPrecio != null)
            return false;
        if (descrNivel != null ? !descrNivel.equals(that.descrNivel) : that.descrNivel != null) return false;
        if (rangoPrecio != null ? !rangoPrecio.equals(that.rangoPrecio) : that.rangoPrecio != null) return false;
        if (invIniVta != null ? !invIniVta.equals(that.invIniVta) : that.invIniVta != null) return false;
        if (invCostoAa != null ? !invCostoAa.equals(that.invCostoAa) : that.invCostoAa != null) return false;
        if (invPzAa != null ? !invPzAa.equals(that.invPzAa) : that.invPzAa != null) return false;
        if (invVtaAa != null ? !invVtaAa.equals(that.invVtaAa) : that.invVtaAa != null) return false;
        if (devProy != null ? !devProy.equals(that.devProy) : that.devProy != null) return false;
        if (mermasProy != null ? !mermasProy.equals(that.mermasProy) : that.mermasProy != null) return false;
        if (rebProy != null ? !rebProy.equals(that.rebProy) : that.rebProy != null) return false;
        if (degProy != null ? !degProy.equals(that.degProy) : that.degProy != null) return false;
        if (salidasProy != null ? !salidasProy.equals(that.salidasProy) : that.salidasProy != null) return false;
        if (devAa != null ? !devAa.equals(that.devAa) : that.devAa != null) return false;
        if (mermasAa != null ? !mermasAa.equals(that.mermasAa) : that.mermasAa != null) return false;
        if (rebAa != null ? !rebAa.equals(that.rebAa) : that.rebAa != null) return false;
        if (degAa != null ? !degAa.equals(that.degAa) : that.degAa != null) return false;
        if (salidasAa != null ? !salidasAa.equals(that.salidasAa) : that.salidasAa != null) return false;
        if (pronostico != null ? !pronostico.equals(that.pronostico) : that.pronostico != null) return false;
        if (ventaA1 != null ? !ventaA1.equals(that.ventaA1) : that.ventaA1 != null) return false;
        if (ventaA2 != null ? !ventaA2.equals(that.ventaA2) : that.ventaA2 != null) return false;
        if (invFinProy != null ? !invFinProy.equals(that.invFinProy) : that.invFinProy != null) return false;
        if (invFinAaVta != null ? !invFinAaVta.equals(that.invFinAaVta) : that.invFinAaVta != null) return false;
        if (invFinAaPz != null ? !invFinAaPz.equals(that.invFinAaPz) : that.invFinAaPz != null) return false;
        if (invFinAaCosto != null ? !invFinAaCosto.equals(that.invFinAaCosto) : that.invFinAaCosto != null)
            return false;
        if (compraAa != null ? !compraAa.equals(that.compraAa) : that.compraAa != null) return false;
        if (vtaPpto != null ? !vtaPpto.equals(that.vtaPpto) : that.vtaPpto != null) return false;
        if (transitos != null ? !transitos.equals(that.transitos) : that.transitos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (año != null ? año.hashCode() : 0);
        result = 31 * result + (mes != null ? mes.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (idProveedor != null ? idProveedor.hashCode() : 0);
        result = 31 * result + (proveedor != null ? proveedor.hashCode() : 0);
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        result = 31 * result + (idSubdepartamento != null ? idSubdepartamento.hashCode() : 0);
        result = 31 * result + (subdepartamento != null ? subdepartamento.hashCode() : 0);
        result = 31 * result + (idClase != null ? idClase.hashCode() : 0);
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        result = 31 * result + (idSubclase != null ? idSubclase.hashCode() : 0);
        result = 31 * result + (subclase != null ? subclase.hashCode() : 0);
        result = 31 * result + (idNivelPrecio != null ? idNivelPrecio.hashCode() : 0);
        result = 31 * result + (descrNivel != null ? descrNivel.hashCode() : 0);
        result = 31 * result + (rangoPrecio != null ? rangoPrecio.hashCode() : 0);
        result = 31 * result + (invIniVta != null ? invIniVta.hashCode() : 0);
        result = 31 * result + (invCostoAa != null ? invCostoAa.hashCode() : 0);
        result = 31 * result + (invPzAa != null ? invPzAa.hashCode() : 0);
        result = 31 * result + (invVtaAa != null ? invVtaAa.hashCode() : 0);
        result = 31 * result + (devProy != null ? devProy.hashCode() : 0);
        result = 31 * result + (mermasProy != null ? mermasProy.hashCode() : 0);
        result = 31 * result + (rebProy != null ? rebProy.hashCode() : 0);
        result = 31 * result + (degProy != null ? degProy.hashCode() : 0);
        result = 31 * result + (salidasProy != null ? salidasProy.hashCode() : 0);
        result = 31 * result + (devAa != null ? devAa.hashCode() : 0);
        result = 31 * result + (mermasAa != null ? mermasAa.hashCode() : 0);
        result = 31 * result + (rebAa != null ? rebAa.hashCode() : 0);
        result = 31 * result + (degAa != null ? degAa.hashCode() : 0);
        result = 31 * result + (salidasAa != null ? salidasAa.hashCode() : 0);
        result = 31 * result + (pronostico != null ? pronostico.hashCode() : 0);
        result = 31 * result + (ventaA1 != null ? ventaA1.hashCode() : 0);
        result = 31 * result + (ventaA2 != null ? ventaA2.hashCode() : 0);
        result = 31 * result + (invFinProy != null ? invFinProy.hashCode() : 0);
        result = 31 * result + (invFinAaVta != null ? invFinAaVta.hashCode() : 0);
        result = 31 * result + (invFinAaPz != null ? invFinAaPz.hashCode() : 0);
        result = 31 * result + (invFinAaCosto != null ? invFinAaCosto.hashCode() : 0);
        result = 31 * result + (compraAa != null ? compraAa.hashCode() : 0);
        result = 31 * result + (vtaPpto != null ? vtaPpto.hashCode() : 0);
        temp = Double.doubleToLongBits(partNr);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (transitos != null ? transitos.hashCode() : 0);
        return result;
    }
}
