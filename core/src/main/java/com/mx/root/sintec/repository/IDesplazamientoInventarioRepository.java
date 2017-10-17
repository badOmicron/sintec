/*
 *      File: IDesplazamientoInventarioRepository.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 11, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mx.root.sintec.model.Departamento;
import com.mx.root.sintec.model.SellthroughEntity;
import com.mx.root.sintec.model.SubDepartamento;

/**
 *  Clase encargada de obtener los datos. Es una abstracción de los mètodos básicos de persistencia.
 *  DAO.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IDesplazamientoInventarioRepository extends JpaRepository<SellthroughEntity, String> {

    /**
     * Mètodo para explotar  el procedimiento almacenado consulta_SellThrough.
     * @param semana1 Semana de fecha inicio.
     * @param anio1 a&#241;o de fecha inicio.
     * @param semana2 Semana de fecha fin.
     * @param anio2 a&#241;o de fecha inicio.
     * @param subclase Subclase:
     * @param sku SKU.
     */
    @Transactional(timeout = 10)
    @Procedure(name = "SellthroughEntity.consulta_SellThrough")
    void consultaSellThrough(
            @Param("Semana1") Integer semana1,
            @Param("Año1") Integer anio1,
            @Param("Semana2") Integer semana2,
            @Param("Año2") Integer anio2,
            @Param("subclase") String subclase,
            @Param("sku") Integer sku
    );

    /**
     * Este método puede tener implementación en la interface haciendo uso de la palabra reservada default, es una nueva caracteristica en desde java 8.
     * La idea es implementar una lógica por default en las interfaces, esta puede se sobreescrita.
     * En este caso la implementación hace un llamado a el métodod {@link #findByIdDepartamentoAndIdSubdepartamento}, esté método es ejecutado por
     * la libreria Spring-Data, el mètodo tiene un límite de N registros .
     * Nota: Solo es de ejemplo: La forma correcta de implementar el {@link PageRequest} se  verá en otra ocasión.
     * Busqueda de ejemplo sobre la tabla  Sellthrough filtrando por id de departamento y id de sub departamento.
     * @param idDepartamento identificador de dpto.
     * @param idSubDepartamento identificador de sub-dpto.
     * @return Lista de registros  resultantes de la consulta.
     */
    @Transactional(timeout = 10)
    @Query(value = "select s from SellthroughEntity s where s.idDepartamento= ?1 and s.idSubDepartamento= ?2")
    default List<SellthroughEntity> findByIdDepartamentoAndIdSubdepartamentoLimit(int idDepartamento,
                                                                                  int idSubDepartamento) {
        return findByIdDepartamentoAndIdSubdepartamento(idDepartamento, idSubDepartamento, new PageRequest(0, 10));
    }

    /**
     * Obtiene los registros de la tabla {@link SellthroughEntity} filtrando por id de dpto e id de sub dpto.
     * @param idDpto identificador del departamento.
     * @param idSubDpto identificador del sub departamento.
     * @param pageRequest Paginador.
     * @return Lista de registros de la tabla {@link SellthroughEntity} resultantes de la consulta.
     */
    List<SellthroughEntity> findByIdDepartamentoAndIdSubdepartamento(int idDpto, int idSubDpto, Pageable pageRequest);

    /**
     * Obtiene todos los {@link Departamento}s que existen en la tabla  {@link SellthroughEntity}.
     * Se puede observar que en el  {@link Query} se construye un objeto de tipo {@link Departamento}, esto es algo que nos permite hacer JPA con Spring y Hibernate.
     * @return Lista de departamentos de la tabla {@link SellthroughEntity} resultantes de la consulta.
     */
    @Query(value = "select distinct new com.mx.root.sintec.model.Departamento(s.idDepartamento,s.departamento) from SellthroughEntity s")
    List<Departamento> findAllDepartamentos();

    /**
     * Obtiene todos los {@link SubDepartamento}s que existen en la tabla  {@link SellthroughEntity}.
     * Se puede observar que en el  {@link Query} se construye un objeto de tipo {@link SubDepartamento}, esto es algo que nos permite hacer JPA con Spring y Hibernate.
     * @return Lista de sub departamentos de la tabla {@link SellthroughEntity} resultantes de la consulta.
     */
    @Query(value = "select distinct new com.mx.root.sintec.model.SubDepartamento(s.idSubdepartamento,s.subdepartamento) from SellthroughEntity s")
    List<SubDepartamento> findAllSubDepartamentos();


}
