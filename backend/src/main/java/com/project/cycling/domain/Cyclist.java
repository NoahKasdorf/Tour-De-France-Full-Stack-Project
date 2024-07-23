package com.project.cycling.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Repository;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "cyclists")
public class Cyclist {

    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cyclist_id_seq")

    @Id
    private Long id;

    private String first_name;
    private String last_name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team_id")
    private Team team;

}
