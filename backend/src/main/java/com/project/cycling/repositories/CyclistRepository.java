package com.project.cycling.repositories;

import com.project.cycling.domain.CyclistEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CyclistRepository extends CrudRepository<CyclistEntity, Long> {

    @Query("SELECT c FROM CyclistEntity c WHERE c.teamEntity.id = :teamId")
    List<CyclistEntity> findByTeamId(@Param("teamId") Long teamId);

}
