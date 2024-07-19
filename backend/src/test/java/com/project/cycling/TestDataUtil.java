package com.project.cycling;

import com.project.cycling.domain.Cyclist;
import com.project.cycling.domain.Team;

public final class TestDataUtil {

    private TestDataUtil(){

    }

    public static Cyclist createTestCyclist() {
        return Cyclist.builder()
                .id(1L)
                .firstName("Jonas")
                .lastName("Vingeggard")
                .teamId(1L)
                .build();
    }

    public static Team createTestTeam() {
        return Team.builder()
                .id(1L)
                .name("Visma Lease A Bike")
                .country("Denmark")
                .bikeBrand("Cervelo")
                .build();
    }
}
