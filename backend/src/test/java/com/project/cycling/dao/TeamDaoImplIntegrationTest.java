package com.project.cycling.dao;

import com.project.cycling.TestDataUtil;
import com.project.cycling.dao.impl.TeamDaoImpl;
import com.project.cycling.domain.Team;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)

public class TeamDaoImplIntegrationTest {

        private TeamDaoImpl underTest;

        @Autowired
        public TeamDaoImplIntegrationTest(TeamDaoImpl underTest){
            this.underTest = underTest;

        }

        @Test
        public void testThatTeamCanBeCreatedAndRecalled(){

            Team team = TestDataUtil.createTestTeam();

            underTest.create(team);
            Optional<Team> result = underTest.findOne(team.getId());
            assertThat(result).isPresent();
            assertThat(result.get()).isEqualTo(team);

        }


}
