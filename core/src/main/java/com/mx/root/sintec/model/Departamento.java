/*
 *      File: Departamento.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 15, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
public class Departamento {

    int id;
    String descripcion;

}
