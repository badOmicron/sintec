/*
 *      File: CatalogosController.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 17, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.root.sintec.model.Clase;
import com.mx.root.sintec.model.Departamento;
import com.mx.root.sintec.model.SubDepartamento;
import com.mx.root.sintec.service.ICatalogosService;

import static org.slf4j.LoggerFactory.getLogger;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController
@RequestMapping("/catalogos")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600)
public class CatalogosController {
    /**
     * Logger for class.
     */
    private static final Logger LOGGER = getLogger(DesplazamientoInventarioController.class);

    private ICatalogosService catalogosService;

    @Autowired
    public CatalogosController(ICatalogosService catalogosService) {
        this.catalogosService = catalogosService;
    }

    /**
     * Enpoint para obtener todos los departamentos.
     * @return Una respuesa HTTP.
     * @see ResponseEntity
     */
    @GetMapping("/clases")
    ResponseEntity getClases() {
        LOGGER.info("getDptos: ");
        try {
            final List<Clase> clases = catalogosService.findAllClases();
            return ResponseEntity.ok(clases);
        } catch (final Exception e) {
            LOGGER.error(" message", e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    /**
     * Enpoint para obtener todos los departamentos.
     * @return Una respuesa HTTP.
     * @see ResponseEntity
     */
    @GetMapping("/departamentos")
    ResponseEntity getDptos() {
        LOGGER.info("getDptos: ");
        try {
            final List<Departamento> departamentos = catalogosService.findAllDepartamentos();
            return ResponseEntity.ok(departamentos);
        } catch (final Exception e) {
            LOGGER.error(" message", e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    /**
     * Enpoint para obtener todos los sub departamentos.
     * @return Una respuesa HTTP.
     * @see ResponseEntity
     */
    @GetMapping("/subdepartamentos")
    ResponseEntity getSubDptos() {
        LOGGER.info("getDptos: ");
        try {
            final List<SubDepartamento> subDepartamentos = catalogosService.findAllSubDepartamentos();
            return ResponseEntity.ok(subDepartamentos);
        } catch (final Exception e) {
            LOGGER.error(" message", e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }


}
