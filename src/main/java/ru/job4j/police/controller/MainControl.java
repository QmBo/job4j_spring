package ru.job4j.police.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.job4j.police.service.AccidentService;

/**
 * IndexControl
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
@Controller
public class MainControl {
    private final AccidentService service;

    public MainControl(AccidentService appContext) {
        this.service = appContext;
    }

    /**
     * Index string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/main")
    public String index(Model model) {
        model.addAttribute("accidents", this.service.allAccidents());
        return "mainPage";
    }
}