package ru.job4j.police.service;

import org.springframework.stereotype.Service;
import ru.job4j.police.model.Accident;
import ru.job4j.police.repository.AccidentMem;

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
    private final AccidentMem store;

    public AccidentService(AccidentMem store) {
        this.store = store;
    }

    /**
     * All accidents list.
     *
     * @return the list
     */
    public List<Accident> allAccidents() {
        return this.store.getAllAccidents();
    }

    /**
     * Add accident accident.
     *
     * @param accident the accident
     * @return the accident
     * @noinspection unused
     */
    public Accident addAccident(final Accident accident) {
        return this.store.addAccident(accident);
    }
}
