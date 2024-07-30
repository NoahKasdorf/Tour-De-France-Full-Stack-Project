package com.project.cycling.mappers.impl;

import com.project.cycling.domain.TeamEntity;
import com.project.cycling.domain.dto.TeamDto;
import com.project.cycling.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TeamMapperImpl implements Mapper<TeamEntity, TeamDto> {

    private ModelMapper modelMapper;


    public TeamMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public TeamDto mapTo(TeamEntity teamEntity) {
       return modelMapper.map(teamEntity, TeamDto.class);


    }

    @Override
    public TeamEntity mapFrom(TeamDto teamDto) {
        return modelMapper.map(teamDto, TeamEntity.class);
    }
}
