package com.project.cycling.controllers;

import com.project.cycling.domain.Team;
import com.project.cycling.domain.dto.TeamDto;
import com.project.cycling.mappers.Mapper;
import com.project.cycling.services.TeamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private TeamService teamService;

    private Mapper<Team, TeamDto> teamMapper;

    public TeamController(TeamService teamService){
        this.teamService = teamService;
    }

    @PostMapping(path = "/teams")
    public TeamDto createTeam(@RequestBody TeamDto team) {
        Team teamEntity = teamMapper.mapFrom(team);
        Team savedTeamEntity = teamService.createTeam(teamEntity);;
        return teamMapper.mapTo(savedTeamEntity);


    }


}
