package ru.job4j.accident.service;

import org.springframework.stereotype.Service;
import ru.job4j.accident.model.Accident;
import ru.job4j.accident.repository.AccidentJdbcTemplate;

import java.util.List;

/**
 * AccidentService
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 17.06.2020
 */
@Service
public class AccidentService {
    private final AccidentJdbcTemplate store;

    public AccidentService(AccidentJdbcTemplate store) {
        this.store = store;
    }

    /**
     * All accidents list.
     *
     * @return the list
     */
    public List<Accident> allAccidents() {
        return this.store.getAll();
    }

    /**
     * Add accident accident.
     *
     * @param accident the accident
     * @return the accident
     * @noinspection unused
     */
    public Accident addAccident(final Accident accident) {
        return this.store.save(accident);
    }
}
