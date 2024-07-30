package com.project.cycling.domain.dto;

import com.project.cycling.domain.TeamEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CyclistDto {

    private Long id;
    private String first_name;
    private String last_name;
    private TeamEntity teamEntity;

}
