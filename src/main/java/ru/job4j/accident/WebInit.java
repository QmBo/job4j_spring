package ru.job4j.accident;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import ru.job4j.accident.config.AppConfig;
import ru.job4j.accident.config.JdbcConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * WebInit
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
public class WebInit implements WebApplicationInitializer {

    /** @noinspection NullableProblems*/
    public void onStartup(ServletContext servletCxt) {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConfig.class, JdbcConfig.class);
        ac.refresh();
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}