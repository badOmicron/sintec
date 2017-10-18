/*
 *      File: DesplazamientoInventarioController.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 11, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
//@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"}, maxAge = 3600)
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
    ResponseEntity getReport(@RequestBody DesplazamientoInDTO desplazamientoInDTO, Pageable pageable) {
        LOGGER.info("getReport: ");
        try {
            int idDpto        = Integer.valueOf(desplazamientoInDTO.getIdDepartamento());
            int idSubDpto     = Integer.valueOf(desplazamientoInDTO.getIdSubdepartamento());
            int idClase       = Integer.valueOf(desplazamientoInDTO.getIdClase());
            String idSubClase = desplazamientoInDTO.getIdSubClase();
            final List<SellthroughEntity> sellthroughEntityRecords =
                    desplazamientoInventarioService.findByIdDepartamentoAndIdSubdepartamentoAndIdClaseAndIdSubclase(idDpto, idSubDpto, idClase, idSubClase, pageable);
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
    @PostMapping("/exec")
    ResponseEntity exploteProcedure(@RequestBody DesplazamientoInDTO desplazamientoInDTO) {
        LOGGER.info("exploteProcedure: ");
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dateFormat.parse(desplazamientoInDTO.getFechaInicio());
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int week_ini = cal.get(Calendar.WEEK_OF_YEAR);
            int year_ini = cal.get(Calendar.YEAR);
            date = dateFormat.parse(desplazamientoInDTO.getFechaFin());
            cal.setTime(date);
            int week_fin = cal.get(Calendar.WEEK_OF_YEAR);
            int year_fin = cal.get(Calendar.YEAR);
            desplazamientoInventarioService.consultaSellThrough(
                    week_ini, year_ini, week_fin, year_fin, desplazamientoInDTO.getIdDepartamento(), desplazamientoInDTO.getIdSubdepartamento(), desplazamientoInDTO.getIdClase(), desplazamientoInDTO.getIdSubClase());
            return ResponseEntity.ok(null);
        } catch (final DesplazamientoInventarioException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        } catch (ParseException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }


}
