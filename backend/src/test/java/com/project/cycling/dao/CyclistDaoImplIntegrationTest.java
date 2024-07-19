package com.project.cycling.dao;

import com.project.cycling.TestDataUtil;
import com.project.cycling.dao.impl.CyclistDaoImpl;
import com.project.cycling.dao.impl.TeamDaoImpl;
import com.project.cycling.domain.Cyclist;
import com.project.cycling.domain.Team;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CyclistDaoImplIntegrationTest {


    private CyclistDaoImpl underTest;
    private TeamDaoImpl teamSetUp;




    @Autowired
    public CyclistDaoImplIntegrationTest(CyclistDaoImpl underTest, TeamDaoImpl teamSetUp){
        this.underTest = underTest;
        this.teamSetUp = teamSetUp;

    }

    @BeforeEach
    public void setUp() {
        // Create a test team before each test
        Team testTeam = TestDataUtil.createTestTeam();
        teamSetUp.create(testTeam);
    }

    @Test
    public void testThatCyclistCanBeCreatedAndRecalled(){

        Cyclist cyclist = TestDataUtil.createTestCyclist();

        underTest.create(cyclist);
        Optional<Cyclist> result = underTest.findOne(cyclist.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(cyclist);

    }
}
