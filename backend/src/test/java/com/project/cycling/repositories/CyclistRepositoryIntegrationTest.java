package com.project.cycling.repositories;

import com.project.cycling.TestDataUtil;

import com.project.cycling.domain.Cyclist;
import com.project.cycling.domain.Team;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class CyclistRepositoryIntegrationTest {



    private CyclistRepository underTest;


    @Autowired
    public CyclistRepositoryIntegrationTest(CyclistRepository underTest){
        this.underTest = underTest;

    }


    @Test
    @Transactional
    public void testThatCyclistCanBeCreatedAndRecalled(){

        Team testTeam = TestDataUtil.createTestTeamSoudal();

        Cyclist cyclist = TestDataUtil.createTestCyclistEvenepoel(testTeam);
        underTest.save(cyclist);

        Optional<Cyclist> result = underTest.findById(cyclist.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(cyclist);

    }

    @Test
    public void testThatMultipleCyclistsCanBeCreatedAndRecalled(){

        Team visma = TestDataUtil.createTestTeamVisma();

        Cyclist cyclist = TestDataUtil.createTestCyclistVingegaard(visma);
        underTest.save(cyclist);

        Cyclist cyclistA = TestDataUtil.createTestCyclistKuss(visma);
        underTest.save(cyclistA);

        Cyclist cyclistB = TestDataUtil.createTestCyclistVanAert(visma);
        underTest.save(cyclistB);

        Iterable<Cyclist> result = underTest.findAll();
        assertThat(result).containsExactly(cyclist, cyclistA, cyclistB);

    }
}
