package ru.job4j.di;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Store
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
@Component
public class Store {
    private final List<String> data = new ArrayList<>();

    /**
     * Add.
     *
     * @param value the value
     */
    public void add(final String value) {
        this.data.add(value);
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<String> getAll() {
        return this.data;
    }
}
