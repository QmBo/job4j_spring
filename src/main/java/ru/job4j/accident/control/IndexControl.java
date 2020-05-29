package ru.job4j.accident.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * IndexControl
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
@Controller
public class IndexControl {
    /**
     * Index string.
     *
     * @param model the model
     * @return the string
     */
    @SuppressWarnings("unused")
    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}