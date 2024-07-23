package com.project.cycling.mappers.impl;

import com.project.cycling.domain.Team;
import com.project.cycling.domain.dto.TeamDto;
import com.project.cycling.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TeamMapperImpl implements Mapper<Team, TeamDto> {

    private ModelMapper modelMapper;


    public TeamMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public TeamDto mapTo(Team team) {
       return modelMapper.map(team, TeamDto.class);


    }

    @Override
    public Team mapFrom(TeamDto teamDto) {
        return modelMapper.map(teamDto, Team.class);
    }
}
