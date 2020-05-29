package ru.job4j.di;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * ConsoleInput
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
@Component
public class ConsoleInput {
    private final List<String> capacity = new LinkedList<>();

    /**
     * Add.
     *
     * @param value the value
     */
    public void add(final String value) {
        this.capacity.add(value.toUpperCase());
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<String> getAll() {
        return this.capacity;
    }
}
