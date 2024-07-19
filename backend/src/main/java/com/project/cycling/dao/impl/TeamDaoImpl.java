package com.project.cycling.dao.impl;


import com.project.cycling.domain.Team;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.cycling.dao.TeamDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
@Component
public class TeamDaoImpl implements TeamDao {

    private JdbcTemplate jdbcTemplate;

    public TeamDaoImpl(final JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void create(Team team) {
        jdbcTemplate.update("INSERT INTO teams (id, name, country, bike_brand) VALUES (?, ?, ?, ?)",
                team.getId(), team.getName(), team.getCountry(), team.getBikeBrand()
                );
    }

    @Override
    public Optional<Team> findOne(long l) {
        List<Team> results = jdbcTemplate.query("SELECT id, name, country, bike_brand FROM teams WHERE id = ? LIMIT 1", new TeamDaoImpl.TeamRowMapper(), l);

        return results.stream().findFirst();
    }

    public static class  TeamRowMapper implements RowMapper<Team> {

        @Override
        public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
            return Team.builder()
                    .id(rs.getLong("id"))
                    .name(rs.getString("name"))
                    .country(rs.getString("country"))
                    .bikeBrand(rs.getString("bike_brand"))
                    .build();
        }
    }
}
