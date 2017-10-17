/*
 *      File: IDesplazamientoInventarioService.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 11, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.mx.root.sintec.model.Departamento;
import com.mx.root.sintec.model.SellthroughEntity;
import com.mx.root.sintec.model.SubDepartamento;
import com.mx.root.sintec.service.exception.DesplazamientoInventarioException;

/**
 *  Interface que define el comportamiento del servicio para la lógica de negcogio del reporte Desplazamiento de Inventario.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IDesplazamientoInventarioService {

    /**
     * Obtiene todos los registros de la tabla {@link SellthroughEntity}
     * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
     * @return ista de sub departamentos de la tabla {@link SellthroughEntity} resultantes de la consulta.
     * @throws DesplazamientoInventarioException  Si existe un error en el proceso.
     */
    List<SellthroughEntity> getAllRecords() throws DesplazamientoInventarioException;

    /**
     * Mètodo para explotar  el procedimiento almacenado consulta_SellThrough.
     * @param semana1 Semana de fecha inicio.
     * @param anio1 a&#241;o de fecha inicio.
     * @param semana2 Semana de fecha fin.
     * @param anio2 a&#241;o de fecha inicio.
     * @param subClase Subclase:
     * @param sku SKU.
     */
    void consultaSellThrough(
            Integer semana1,
            Integer anio1,
            Integer semana2,
            Integer anio2,
            String subClase,
            Integer sku
    ) throws DesplazamientoInventarioException;


    /**
     * Busqueda de ejemplo sobre la tabla  Sellthrough filtrando por id de departamento y id de sub departamento.
     * @param idDepartamento identificador de dpto.
     * @param idSubDepartamento identificador de sub-dpto.
     * @return Lista de registros  resultantes de la consulta.
     */
    List<SellthroughEntity> findByIdClaseAndAndDepartamentoAndSubdepartamento(int idDepartamento,
                                                                              int idSubDepartamento);

    /**
     * Obtiene todos los {@link Departamento}s que existen en la tabla  {@link SellthroughEntity}.
     * @return Lista de departamentos de la tabla {@link SellthroughEntity} resultantes de la consulta.
     */
    List<Departamento> findAllDeptos();

    /**
     * Obtiene todos los {@link SubDepartamento}s que existen en la tabla  {@link SellthroughEntity}.
     * @return Lista de sub departamentos de la tabla {@link SellthroughEntity} resultantes de la consulta.
     */
    List<SubDepartamento> findAllSubDeptos();
}
