package com.project.cycling.services.impl;

import com.project.cycling.domain.TeamEntity;
import com.project.cycling.repositories.TeamRepository;
import com.project.cycling.services.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TeamServiceImpl implements TeamService {

    private TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    @Override
    public TeamEntity createTeam(TeamEntity teamEntity) {
        return teamRepository.save(teamEntity);
    }

    @Override
    public List<TeamEntity> findAll() {
        return StreamSupport.stream(teamRepository.
                findAll().
                spliterator(),
                false)
                .collect(Collectors.toList());
    }
}
