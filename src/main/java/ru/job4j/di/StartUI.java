package ru.job4j.di;

/**
 * StartUI
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
public class StartUI {
    private final Store store;
    private final ConsoleInput input;

    /**
     * Instantiates a new Start ui.
     *
     * @param store the store
     * @param input the input
     */
    public StartUI(Store store, ConsoleInput input) {
        this.store = store;
        this.input = input;
    }

    /**
     * Add.
     *
     * @param value the value
     */
    public void add(final String value) {
        this.input.add(value);
        this.store.add(value);
    }

    /**
     * Print.
     */
    public void print() {
        this.store.getAll().forEach(System.out::println);
        this.input.getAll().forEach(System.out::println);
    }
}
