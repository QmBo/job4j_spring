package ru.job4j.accident.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * AppConfig
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@ComponentScan("ru.job4j")
public class AppConfig {

    /**
     * View resolver view resolver.
     *
     * @return the view resolver
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("./WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }
}