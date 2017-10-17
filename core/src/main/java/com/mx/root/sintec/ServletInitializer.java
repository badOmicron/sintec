package com.mx.root.sintec;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * TODO Descripción de las responsabilidades de la clase, patrones utilizados, algoritmos utilizados.
 *
 * @author Edgar Cirilo &lt;edgar.gonzalez@amk-technologies.com&gt;
 * @version 1.0.0
 * @since 1.0.0
 */
public class ServletInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SintecApplication.class);
        ctx.setServletContext(container);

        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));

        servlet.setLoadOnStartup(1);
        servlet.addMapping("/catalogos/**", "/desplazamiento/**");
    }
}
