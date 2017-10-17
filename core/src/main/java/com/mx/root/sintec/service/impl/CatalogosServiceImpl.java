/*
 *      File: CatalogosServiceImpl.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 17, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.mx.root.sintec.model.Clase;
import com.mx.root.sintec.model.Departamento;
import com.mx.root.sintec.model.SubClase;
import com.mx.root.sintec.model.SubDepartamento;
import com.mx.root.sintec.repository.ICatalogoRepository;
import com.mx.root.sintec.service.ICatalogosService;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class CatalogosServiceImpl implements ICatalogosService {
    private ICatalogoRepository iRelJerarquiaProductosRepository;

    @Autowired
    public CatalogosServiceImpl(ICatalogoRepository iRelJerarquiaProductosRepository) {
        this.iRelJerarquiaProductosRepository = iRelJerarquiaProductosRepository;
    }

    @Override
    public List<Clase> findAllClases() {
        return iRelJerarquiaProductosRepository.findDistinctByClase();
    }

    @Override
    public List<SubClase> findAllSubClases() {
        return iRelJerarquiaProductosRepository.findDistinctBySubClase();
    }

    @Override
    public List<SubClase> findAllSubClasesByClase() {
        return iRelJerarquiaProductosRepository.findDistinctBySubClase();
    }

    @Override
    public List<Departamento> findAllDepartamentos() {
        return iRelJerarquiaProductosRepository.findAllDepartamentos();
    }

    @Override
    public List<SubDepartamento> findAllSubDepartamentos() {
        return iRelJerarquiaProductosRepository.findAllSubDepartamentos();
    }

    @Override
    public List<SubDepartamento> findAllSubDepartamentosByDepto(String departamento) {
        return iRelJerarquiaProductosRepository.findAllSubDepartamentosByDepartamento(departamento);
    }


}
