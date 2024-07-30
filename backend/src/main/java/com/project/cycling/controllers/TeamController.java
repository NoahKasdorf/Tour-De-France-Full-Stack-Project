package com.project.cycling.controllers;

import com.project.cycling.domain.TeamEntity;
import com.project.cycling.domain.dto.TeamDto;
import com.project.cycling.mappers.Mapper;
import com.project.cycling.services.TeamService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TeamController {

    private TeamService teamService;

    private Mapper<TeamEntity, TeamDto> teamMapper;

    public TeamController(TeamService teamService, Mapper<TeamEntity, TeamDto> teamMapper){
        this.teamService = teamService;
        this.teamMapper = teamMapper;
    }

//    @PostMapping(path = "/teams")
//    public ResponseEntity<TeamDto> createTeam(@RequestBody TeamDto team) {
//        TeamEntity teamEntity = teamMapper.mapFrom(team);
//        TeamEntity savedTeamEntityEntity = teamService.createTeam(teamEntity);;
//        return new ResponseEntity<>(teamMapper.mapTo(savedTeamEntityEntity), HttpStatus.CREATED);
//    }

    @GetMapping(path = "/teams")
    @CrossOrigin(origins= "http://localhost:5173/")
    public List<TeamDto> listTeams(){

       List<TeamEntity> teamEntities =  teamService.findAll();
       return teamEntities.stream()
               .map(teamMapper::mapTo)
               .collect(Collectors.toList());

    }


}
