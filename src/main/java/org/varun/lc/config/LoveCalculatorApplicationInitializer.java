package org.varun.lc.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletException;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        System.out.println("Custom on startup method called");
    }
}
