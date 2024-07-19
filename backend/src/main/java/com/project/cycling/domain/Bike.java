package com.project.cycling.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Bike {

    private Long id;
    private String name;
    private Long teamId;

}
