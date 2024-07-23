package com.project.cycling.domain;

import lombok.*;
import org.springframework.stereotype.Repository;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Manager {

    private Long id;
    private String firstName;
    private String lastName;
    private Long teamId;
}
