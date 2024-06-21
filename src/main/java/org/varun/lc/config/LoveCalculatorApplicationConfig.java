package org.varun.lc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.varun.lc.controllers")
public class LoveCalculatorApplicationConfig {
}
