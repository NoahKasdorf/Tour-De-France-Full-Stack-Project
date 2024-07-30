package com.project.cycling.services.impl;

import com.project.cycling.domain.CyclistEntity;
import com.project.cycling.repositories.CyclistRepository;
import com.project.cycling.services.CyclistService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CyclistServiceImpl implements CyclistService {

    private CyclistRepository cyclistRepository;

    public CyclistServiceImpl(CyclistRepository cyclistRepository) {
        this.cyclistRepository = cyclistRepository;
    }


    @Override
    public List<CyclistEntity> findAll() {
        return StreamSupport.stream(cyclistRepository.
                findAll().
                spliterator(),
                false)
                .collect(Collectors.toList());
    }
}
