package com.project.cycling.dao;

import com.project.cycling.domain.Cyclist;

import java.util.Optional;

public interface CyclistDao {

    void create(Cyclist cyclist);

    Optional<Cyclist> findOne(long l);
}
