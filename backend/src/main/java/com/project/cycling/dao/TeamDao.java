package com.project.cycling.dao;

import com.project.cycling.domain.Team;

import java.util.Optional;

public interface TeamDao {

    void create(Team team);

    Optional<Team> findOne(long l);
}
