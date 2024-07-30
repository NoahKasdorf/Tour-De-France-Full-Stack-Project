package com.project.cycling.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "teams")
public class TeamEntity {

    @Id
    private Long id;

    private String name;

    private String country;

    private String bike_brand;


}
