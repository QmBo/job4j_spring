package ru.job4j.accident.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

import java.util.List;
/**
 * AccidentHibernate
 * @author Victor Egorov (qrioflat@gmail.com).
 * @version 0.1
 * @since 19.06.2020
 */
@Repository
public class AccidentHibernate {
    private final SessionFactory sf;

    /**
     * Constructor.
     * @param sf SessionFactory
     */
    public AccidentHibernate(SessionFactory sf) {
        this.sf = sf;
    }

    /**
     * Save accident in db.
     * @param accident new accident
     * @return accident whit id
     */
    public Accident save(Accident accident) {
        try (Session session = sf.openSession()) {
            session.save(accident);
            return accident;
        }
    }

    /**
     * Get all Accidents.
     * @return accidents list
     */
    public List<Accident> getAll() {
        try (Session session = sf.openSession()) {
            return session
                    .createQuery("from Accident", Accident.class)
                    .list();
        }
    }
}