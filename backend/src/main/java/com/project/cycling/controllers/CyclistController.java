package com.project.cycling.controllers;


import com.project.cycling.domain.CyclistEntity;
import com.project.cycling.domain.dto.CyclistDto;
import com.project.cycling.mappers.Mapper;
import com.project.cycling.services.CyclistService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CyclistController {


    private CyclistService cyclistService;

    private Mapper<CyclistEntity, CyclistDto> cyclistMapper;


    public CyclistController(CyclistService cyclistService, Mapper<CyclistEntity, CyclistDto> cyclistMapper) {
        this.cyclistService = cyclistService;
        this.cyclistMapper = cyclistMapper;
    }

    @GetMapping(path = "/cyclists")
    @CrossOrigin(origins= "http://localhost:5173/")
    public List<CyclistDto> listTeams(){

        List<CyclistEntity> cyclistEntities =  cyclistService.findAll();
        return cyclistEntities.stream()
                .map(cyclistMapper::mapTo)
                .collect(Collectors.toList());
    }
}
