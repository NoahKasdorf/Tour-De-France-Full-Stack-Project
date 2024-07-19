package com.project.cycling.dao.impl;

import com.project.cycling.domain.Cyclist;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.cycling.dao.CyclistDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Component
public class CyclistDaoImpl implements CyclistDao {

    private JdbcTemplate jdbcTemplate;

    public CyclistDaoImpl(final JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void create(Cyclist cyclist) {
        jdbcTemplate.update( "INSERT INTO cyclists (id, first_name, last_name, team_id) VALUES (?, ?, ?, ?)",
        cyclist.getId(), cyclist.getFirstName(), cyclist.getLastName(), cyclist.getTeamId()
        );
    }

    @Override
    public Optional<Cyclist> findOne(long l) {
        List<Cyclist> results = jdbcTemplate.query("SELECT id, first_name, last_name, team_id FROM cyclists WHERE id = ? LIMIT 1", new CyclistRowMapper(), l);

        return results.stream().findFirst();
    }


    public static class CyclistRowMapper implements RowMapper<Cyclist> {

        @Override
        public Cyclist mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Cyclist.builder()
                    .id(rs.getLong("id"))
                    .firstName(rs.getString("first_name"))
                    .lastName(rs.getString("last_name"))
                    .teamId(rs.getLong("team_id"))
                    .build();
        }
    }
}
