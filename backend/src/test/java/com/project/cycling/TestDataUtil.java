package com.project.cycling;

import com.project.cycling.domain.CyclistEntity;
import com.project.cycling.domain.TeamEntity;

public final class TestDataUtil {

    private TestDataUtil(){

    }

    public static CyclistEntity createTestCyclistVingegaard(final TeamEntity teamEntity) {
        return CyclistEntity.builder()
                .id(1L)
                .first_name("Jonas")
                .last_name("Vingegaard")
                .teamEntity(teamEntity)
                .build();
    }

    public static CyclistEntity createTestCyclistKuss(final TeamEntity teamEntity) {
        return CyclistEntity.builder()
                .id(2L)
                .first_name("Sepp")
                .last_name("Kuss")
                .teamEntity(teamEntity)
                .build();
    }

    public static CyclistEntity createTestCyclistVanAert(final TeamEntity teamEntity) {
        return CyclistEntity.builder()
                .id(3L)
                .first_name("Wout")
                .last_name("Van Aert")
                .teamEntity(teamEntity)
                .build();
    }

    public static CyclistEntity createTestCyclistEvenepoel(final TeamEntity teamEntity) {
        return CyclistEntity.builder()
                .id(4L)
                .first_name("Remco")
                .last_name("Evenepoel")
                .teamEntity(teamEntity)
                .build();
    }

    public static TeamEntity createTestTeamVisma() {
        return TeamEntity.builder()
                .id(1L)
                .name("Visma | Lease A Bike")
                .country("Denmark")
                .bike_brand("Cervelo")
                .build();
    }

    public static TeamEntity createTestTeamSoudal() {
        return TeamEntity.builder()
                .id(2L)
                .name("Soudal Quick-Step")
                .country("Belgium")
                .bike_brand("Specialized")
                .build();
    }

    public static TeamEntity createTestTeamDecathalon() {
        return TeamEntity.builder()
                .id(3L)
                .name("Decthalon AG2R")
                .country("France")
                .bike_brand("Van Rysel")
                .build();
    }

}
