package com.project.cycling.mappers.impl;

import com.project.cycling.domain.CyclistEntity;
import com.project.cycling.domain.dto.CyclistDto;
import com.project.cycling.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CyclistMapperImpl implements Mapper<CyclistEntity, CyclistDto> {

    private ModelMapper modelMapper;


    public CyclistMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public CyclistDto mapTo(CyclistEntity cyclistEntity) {
        return modelMapper.map(cyclistEntity, CyclistDto.class);


    }

    @Override
    public CyclistEntity mapFrom(CyclistDto cyclistDto) {
        return modelMapper.map(cyclistDto, CyclistEntity.class);
    }

}
