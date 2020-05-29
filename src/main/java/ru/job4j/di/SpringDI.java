package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * SpringDI
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
public class SpringDI {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Victor Egorov");
        ui.add("Ivan Ivanov");
        ui.print();
    }
}