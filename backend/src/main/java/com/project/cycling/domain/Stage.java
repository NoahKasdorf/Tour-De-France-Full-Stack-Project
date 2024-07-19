package com.project.cycling.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Stage {

    private Long id;
    private String name;
    private Long elevation;
    private Long distance;
    private Long winner_id;
}
