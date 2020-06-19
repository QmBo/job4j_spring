package ru.job4j.accident.repository;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
import ru.job4j.accident.model.Accident;

import java.util.List;

/** @noinspection ALL*/
//@Repository
public class AccidentJdbcTemplate {
    private final JdbcTemplate jdbc;

    public AccidentJdbcTemplate(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public Accident save(Accident accident) {
        //noinspection SqlResolve
        jdbc.update("insert into accident (name, text, address) values (?, ?, ?)",
                accident.getName(), accident.getText(), accident.getAddress());
        return accident;
    }

    public List<Accident> getAll() {
        return jdbc.query("select * from accident",
                (rs, row) -> new Accident()
                        .setId(rs.getInt("id"))
                        .setName(rs.getString("name"))
                        .setAddress(rs.getString("address"))
                        .setText(rs.getString("text"))
        );
    }
}