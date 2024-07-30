package com.project.cycling.services;

import com.project.cycling.domain.TeamEntity;

import java.util.List;

public interface TeamService {

    TeamEntity createTeam(TeamEntity teamEntity);

    List<TeamEntity> findAll();
}
