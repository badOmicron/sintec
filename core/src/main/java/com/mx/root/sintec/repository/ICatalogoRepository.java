/*
 *      File: IRelJerarquiaProductosRepository.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 17, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mx.root.sintec.model.*;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ICatalogoRepository extends JpaRepository<RelJerarquiaProductosEntity, Integer> {

    @Query(value = "select distinct new com.mx.root.sintec.model.Clase(r.idSubdepartamento,r.subdepartamento) from RelJerarquiaProductosEntity r")
    List<Clase> findDistinctByClase();


    @Query(value = "select distinct new com.mx.root.sintec.model.SubClase(r.idSubdepartamento,r.subdepartamento) from RelJerarquiaProductosEntity r")
    List<SubClase> findDistinctBySubClase();

    /**
     * Obtiene todos los {@link Departamento}s que existen en la tabla  {@link RelJerarquiaProductosEntity}.
     * Se puede observar que en el  {@link Query} se construye un objeto de tipo {@link Departamento}, esto es algo que nos permite hacer JPA con Spring y Hibernate.
     * @return Lista de departamentos de la tabla {@link RelJerarquiaProductosEntity} resultantes de la consulta.
     */
    @Query(value = "select distinct new com.mx.root.sintec.model.Departamento(s.idDepartamento,s.departamento) from RelJerarquiaProductosEntity s")
    List<Departamento> findAllDepartamentos();

    /**
     * Obtiene todos los {@link SubDepartamento}s que existen en la tabla  {@link RelJerarquiaProductosEntity}.
     * Se puede observar que en el  {@link Query} se construye un objeto de tipo {@link SubDepartamento}, esto es algo que nos permite hacer JPA con Spring y Hibernate.
     * @return Lista de sub departamentos de la tabla {@link RelJerarquiaProductosEntity} resultantes de la consulta.
     */
    @Query(value = "select distinct new com.mx.root.sintec.model.SubDepartamento(s.idSubdepartamento,s.subdepartamento) from RelJerarquiaProductosEntity s")
    List<SubDepartamento> findAllSubDepartamentos();

}
