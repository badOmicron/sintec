/*
 *      File: DesplazamientoInventarioServiceImpl.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 11, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mx.root.sintec.model.SellthroughEntity;
import com.mx.root.sintec.repository.IDesplazamientoInventarioRepository;
import com.mx.root.sintec.service.IDesplazamientoInventarioService;
import com.mx.root.sintec.service.exception.DesplazamientoInventarioException;

import static org.slf4j.LoggerFactory.getLogger;

/**
 *  Implementacón de la interface {@link IDesplazamientoInventarioService}
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class DesplazamientoInventarioServiceImpl implements IDesplazamientoInventarioService {

    /**
     * Logger for class.
     */
    private static final Logger LOGGER = getLogger(DesplazamientoInventarioServiceImpl.class);

    /**
     *  Repositorio para la entidad {@link SellthroughEntity}
     */
    private IDesplazamientoInventarioRepository desplazamientoInventarioRepository;

    /**
     * Constructor.
     * Creates instace of {@link DesplazamientoInventarioServiceImpl}
     * @param desplazamientoInventarioRepository .
     */
    @Autowired
    public DesplazamientoInventarioServiceImpl(IDesplazamientoInventarioRepository desplazamientoInventarioRepository) {
        this.desplazamientoInventarioRepository = desplazamientoInventarioRepository;
    }

    /**
     * Obtiene todos los registros de la tabla {@link SellthroughEntity}
     * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
     * @return ista de sub departamentos de la tabla {@link SellthroughEntity} resultantes de la consulta.
     * @throws DesplazamientoInventarioException  Si existe un error en el proceso.
     */
    @Override
    public List<SellthroughEntity> getAllRecords() throws DesplazamientoInventarioException {
        LOGGER.info("getAllRecords: ");
        return desplazamientoInventarioRepository.findAll();
    }

    /**
     * Mètodo para explotar  el procedimiento almacenado consulta_SellThrough.
     * @param semana1 Semana de fecha inicio.
     * @param anio1 a&#241;o de fecha inicio.
     * @param semana2 Semana de fecha fin.
     * @param anio2 a&#241;o de fecha inicio.
     * @param subClase Subclase:
     * @param sku SKU.
     */
    @Override
    public void consultaSellThrough(Integer semana1, Integer anio1, Integer semana2, Integer anio2, String idDepto,
                                    String idSubDepto, String idClase, String idSubClase) {
        LOGGER.info("consultaSellThrough: ");
        desplazamientoInventarioRepository.consultaSellThrough(semana1, anio1, semana2, anio2, idDepto, idSubDepto,
                                                               idClase, idSubClase, 0);
    }

    /**
     * Busqueda de ejemplo sobre la tabla  Sellthrough filtrando por id de departamento y id de sub departamento.
     * @param idDepartamento identificador de dpto.
     * @param idSubDepartamento identificador de sub-dpto.
     * @return Lista de registros  resultantes de la consulta.
     */
    @Override
    public List<SellthroughEntity> findByIdClaseAndAndDepartamentoAndSubdepartamento(int idDepartamento,
                                                                                     int idSubDepartamento) {
        LOGGER.info("findByIdClaseAndAndDepartamentoAndSubdepartamento: ");
        return desplazamientoInventarioRepository.findByIdDepartamentoAndIdSubdepartamentoLimit(idDepartamento,
                                                                                                idSubDepartamento);
    }

    /**
     * @param idDpto
     * @param idSubDptom
     * @param idClase
     * @param idSubClase
     * @param pageable
     * @return
     */
    @Override
    public List<SellthroughEntity> findByIdDepartamentoAndIdSubdepartamentoAndIdClaseAndIdSubclase(int idDpto,
                                                                                                   int idSubDptom,
                                                                                                   int idClase,
                                                                                                   String idSubClase,
                                                                                                   Pageable pageable) {
        LOGGER.info("findByIdDepartamentoAndIdSubdepartamentoAndIdClaseAndIdSubclase: ");
        return desplazamientoInventarioRepository.findByIdDepartamentoAndIdSubdepartamentoAndIdClaseAndIdSubclase(
                idDpto, idSubDptom, idClase, idSubClase, pageable);
    }

}
