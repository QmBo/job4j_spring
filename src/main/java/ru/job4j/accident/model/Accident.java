package ru.job4j.accident.model;

/**
 * Accident
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 29.05.2020
 */
public class Accident {
    private int id;
    private String name;
    private String text;
    private String address;

    /**
     * Gets id.
     *
     * @return the id
     * @noinspection unused
     */
    public int getId() {
        return this.id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    public Accident setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     * @return the name
     */
    public Accident setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return this.text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     * @return the text
     */
    public Accident setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     * @return the address
     */
    public Accident setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Accident accident = (Accident) o;
        return id == accident.id
                && com.google.common.base.Objects.equal(name, accident.name)
                && com.google.common.base.Objects.equal(text, accident.text)
                && com.google.common.base.Objects.equal(address, accident.address);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(id, name, text, address);
    }
}