/*
 *      File: ICatalogosService.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 17, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.service;

import java.util.List;

import com.mx.root.sintec.model.Clase;
import com.mx.root.sintec.model.Departamento;
import com.mx.root.sintec.model.SubClase;
import com.mx.root.sintec.model.SubDepartamento;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ICatalogosService {

    List<Clase> findAllClases();

    List<SubClase> findAllSubClases();

    List<Departamento> findAllDepartamentos();

    List<SubDepartamento> findAllSubDepartamentos();
}
