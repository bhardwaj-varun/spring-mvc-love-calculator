package org.varun.lc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(LoveCalculatorApplicationConfig.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic myDispatcherServlet =  servletContext.addServlet("myDispatcherServlet",dispatcherServlet);
        myDispatcherServlet.setLoadOnStartup(1);
        myDispatcherServlet.addMapping("/home/*");
    }
}
