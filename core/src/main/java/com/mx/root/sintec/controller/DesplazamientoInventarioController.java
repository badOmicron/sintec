/*
 *      File: DesplazamientoInventarioController.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 11, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mx.root.sintec.model.Departamento;
import com.mx.root.sintec.model.SellthroughEntity;
import com.mx.root.sintec.model.SubDepartamento;
import com.mx.root.sintec.model.dto.DesplazamientoInDTO;
import com.mx.root.sintec.service.IDesplazamientoInventarioService;
import com.mx.root.sintec.service.exception.DesplazamientoInventarioException;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Clase que expone los Endpoint de servicio REST.
 * Controller.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */

@RestController
@RequestMapping("/desplazamiento")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600)
public class DesplazamientoInventarioController {
    /**
     * Logger for class.
     */
    private static final Logger LOGGER = getLogger(DesplazamientoInventarioController.class);

    /**
     *
     */
    private IDesplazamientoInventarioService desplazamientoInventarioService;


    /**
     * Crea una instancia del objeo {@link DesplazamientoInventarioController}.
     * @author Orlando Ramos &lt;orlando.ramos@amk-technologies.com&gt;
     * @param  desplazamientoInventarioService Objeto inyecatdo por el contenedor Spring
     * */
    @Autowired
    public DesplazamientoInventarioController(IDesplazamientoInventarioService desplazamientoInventarioService) {
        super();
        this.desplazamientoInventarioService = desplazamientoInventarioService;
    }

    /**
     * Endpoint que Obtiene el reporte Desplazamiento de inventarios.
     * @return Lista de registros  resultantes de la consulta .
     */
    @PostMapping("/report")
    ResponseEntity getReport(@RequestBody DesplazamientoInDTO desplazamientoInDTO) {
        LOGGER.info("getReport: ");
        try {
            new ObjectMapper().writeValueAsString(new DesplazamientoInDTO());
            System.out.println(desplazamientoInDTO.toString());
            final List<SellthroughEntity> sellthroughEntityRecords =
                    desplazamientoInventarioService.findByIdClaseAndAndDepartamentoAndSubdepartamento(1, 106);
            return ResponseEntity.ok(sellthroughEntityRecords);
        } catch (final Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    /**
     * Enpoint que explota el procedimiento almacenado  <b>'consulta_SellThrough' </b>.
     * @return Una respuesa HTTP.
     * @see ResponseEntity
     */
    @PostMapping
    ResponseEntity exploteProcedure() {
        LOGGER.info("exploteProcedure: ");
        try {
            desplazamientoInventarioService.consultaSellThrough(
                    2, 2017, 12, 2017, "subClase", 7776);
            return ResponseEntity.ok(null);
        } catch (final DesplazamientoInventarioException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
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
            final List<Departamento> departamentos = desplazamientoInventarioService.findAllDeptos();
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
            final List<SubDepartamento> subDepartamentos = desplazamientoInventarioService.findAllSubDeptos();
            return ResponseEntity.ok(subDepartamentos);
        } catch (final Exception e) {
            LOGGER.error(" message", e.getMessage());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
