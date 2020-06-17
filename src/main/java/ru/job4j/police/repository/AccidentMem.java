package ru.job4j.police.repository;

import org.springframework.stereotype.Repository;
import ru.job4j.police.model.Accident;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * AccidentMem
 *
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 17.06.2020
 */
@Repository
public class AccidentMem {
    private static final Map<Integer, Accident> CAPACITY = new HashMap<>(100);

    public AccidentMem() {
        CAPACITY.put(1, new Accident().setAddress("address 1").setName("Name 1").setText("text 1"));
        CAPACITY.put(2, new Accident().setAddress("address 2").setName("Name 2").setText("text 2"));
        CAPACITY.put(3, new Accident().setAddress("address 3").setName("Name 3").setText("text 3"));
    }

    /**
     * Add accident accident.
     *
     * @param accident the accident
     * @return the accident
     */
    public Accident addAccident(final Accident accident) {
        synchronized (CAPACITY) {
            final int id = CAPACITY.size();
            CAPACITY.put(id, accident.setId(id));
        }
        return accident;
    }

    /**
     * Gets all accidents.
     *
     * @return the all accidents
     */
    public List<Accident> getAllAccidents() {
        return new LinkedList<>(CAPACITY.values());
    }

    /**
     * Gets accident for id.
     *
     * @param accident the accident
     * @return the accident for id
     * @noinspection unused
     */
    public Accident getAccidentForId(final Accident accident) {
        return CAPACITY.get(accident.getId());
    }
}
