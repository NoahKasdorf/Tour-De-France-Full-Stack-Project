package com.project.cycling.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Cyclist {
    
    private Long id;
    private String firstName;
    private String lastName;
    private Long teamId;

}
