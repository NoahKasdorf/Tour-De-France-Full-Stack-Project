package com.project.cycling.mappers;

import com.project.cycling.domain.CyclistEntity;
import com.project.cycling.domain.TeamEntity;
import com.project.cycling.domain.dto.CyclistDto;
import com.project.cycling.domain.dto.TeamDto;

public interface Mapper<A, B>{

     B mapTo(A a);
     A mapFrom(B b);

//     TeamDto mapTo(TeamEntity teamEntity);
//
//     TeamEntity mapFrom(TeamDto teamDto);
//
//     CyclistDto mapTo(CyclistEntity cyclistEntity);

}
