package org.varun.lc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.varun.lc.formatters.AmountFormatter;
import org.varun.lc.formatters.CardDetailsFormatter;
import org.varun.lc.formatters.PhoneNumberFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "org.varun.lc.controllers")
public class LoveCalculatorApplicationConfig implements WebMvcConfigurer {

    @Bean
    InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages");
        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
        validator.setValidationMessageSource(messageSource());
        return validator;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PhoneNumberFormatter());
        registry.addFormatter(new CardDetailsFormatter());
        registry.addFormatter(new AmountFormatter());
    }

    @Override
    public Validator getValidator() {
        return validator();
    }
}
