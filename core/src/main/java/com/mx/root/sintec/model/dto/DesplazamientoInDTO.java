/*
 *      File: DesplazamientoInDTO.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 14, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 *  Objeto que recibe {@link  com.mx.root.sintec.controller.DesplazamientoInventarioController#getReport(DesplazamientoInDTO)}.
 *  Este objeto contiene los campos usados como filtros para obtener la información.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DesplazamientoInDTO {

    /**
     * Id del departamento.
     */
    private Integer idDepartamento;
    /**
     * Id del sub departamento.
     */
    private Integer idSubdepartamento;

    private String clase;

    private String subClase;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;


}
