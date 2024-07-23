package com.project.cycling.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.stereotype.Repository;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Bike {

    private Long id;
    private String name;
    private Long teamId;

}
