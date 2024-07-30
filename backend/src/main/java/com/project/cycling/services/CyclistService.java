package com.project.cycling.services;

import com.project.cycling.domain.CyclistEntity;


import java.util.List;

public interface CyclistService {

    List<CyclistEntity> findAll();
    List<CyclistEntity> findByTeamId(Long teamId);

}
