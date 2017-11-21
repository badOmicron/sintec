/*
 *      File: Departamento.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 15, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.mx.root.sintec.model.dto.AbstractCatalogo;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
public class Departamento extends AbstractCatalogo {

    public Departamento(int id, String descripcion) {
        super(id, descripcion);
    }
}
