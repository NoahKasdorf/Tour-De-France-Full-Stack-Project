package com.project.cycling;

import com.project.cycling.domain.Cyclist;
import com.project.cycling.domain.Team;

public final class TestDataUtil {

    private TestDataUtil(){

    }

    public static Cyclist createTestCyclistVingegaard(final Team team) {
        return Cyclist.builder()
                .id(1L)
                .first_name("Jonas")
                .last_name("Vingegaard")
                .team(team)
                .build();
    }

    public static Cyclist createTestCyclistKuss(final Team team) {
        return Cyclist.builder()
                .id(2L)
                .first_name("Sepp")
                .last_name("Kuss")
                .team(team)
                .build();
    }

    public static Cyclist createTestCyclistVanAert(final Team team) {
        return Cyclist.builder()
                .id(3L)
                .first_name("Wout")
                .last_name("Van Aert")
                .team(team)
                .build();
    }

    public static Cyclist createTestCyclistEvenepoel(final Team team) {
        return Cyclist.builder()
                .id(4L)
                .first_name("Remco")
                .last_name("Evenepoel")
                .team(team)
                .build();
    }

    public static Team createTestTeamVisma() {
        return Team.builder()
                .id(1L)
                .name("Visma | Lease A Bike")
                .country("Denmark")
                .bike_brand("Cervelo")
                .build();
    }

    public static Team createTestTeamSoudal() {
        return Team.builder()
                .id(2L)
                .name("Soudal Quick-Step")
                .country("Belgium")
                .bike_brand("Specialized")
                .build();
    }

}
