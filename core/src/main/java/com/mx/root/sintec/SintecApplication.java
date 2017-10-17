/*
 *      File: SintecApplication.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 10, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.mx.root.sintec.config.WebConfig;

/**
 * TODO Descripción de las responsabilidades de la función, patrones utilizados, algoritmos utilizados.
 *
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
@SpringBootApplication
@EnableAutoConfiguration
@Import(WebConfig.class)
public class SintecApplication {
    public static void main(String[] args) {
        SpringApplication.run(SintecApplication.class, args);
    }
}
