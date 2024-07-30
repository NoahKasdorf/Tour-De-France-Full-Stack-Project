package com.project.cycling.repositories;

import com.project.cycling.domain.CyclistEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CyclistRepository extends CrudRepository<CyclistEntity, Long> {


}
