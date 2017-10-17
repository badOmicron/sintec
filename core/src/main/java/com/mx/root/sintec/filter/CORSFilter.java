/*
 *      File: CORSFilter.java
 *    Author: Orlando Ramos <orlando.ramos@root.com.mx>
 *      Date: Oct 14, 2017
 * Copyright: Root Technologies, S.A. de C.V. 2017
 */

package com.mx.root.sintec.filter;

/**
 *  TODO Descripciòn de la clase.
 *  Patron de diseño  implementado.
 * @author Orlando Ramos &lt;orlando.ramos@root.com.mx&gt;
 * @version 1.0.0
 * @since 1.0.0
 */

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Enabling CORS support  - Access-Control-Allow-Origin
 * @author zeroows@gmail.com
 *
 * <code>
<!-- Add this to your web.xml to enable "CORS" -->
<filter>
<filter-name>cors</filter-name>
<filter-class>com.elm.mb.rest.filters.CORSFilter</filter-class>
</filter>

<filter-mapping>
<filter-name>cors</filter-name>
<url-pattern>/*</url-pattern>
</filter-mapping>
 * </code>
 */
public class CORSFilter extends OncePerRequestFilter {
    /**
     * Logger for class.
     */
    private static final Logger LOGGER = getLogger(CORSFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {
        LOGGER.info("doFilterInternal: CORS Filter...");
        response.addHeader("Access-Control-Allow-Origin", "*");

        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
            // CORS "pre-flight" request
            response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
//			response.addHeader("Access-Control-Allow-Headers", "Authorization");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type");
            response.addHeader("Access-Control-Max-Age", "1");
        }

        filterChain.doFilter(request, response);
    }

}
