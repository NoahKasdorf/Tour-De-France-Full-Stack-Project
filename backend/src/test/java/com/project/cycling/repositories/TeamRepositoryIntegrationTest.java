//package com.project.cycling.repositories;
//
//import com.project.cycling.TestDataUtil;
//
//import com.project.cycling.domain.Team;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//public class TeamRepositoryIntegrationTest {
//
//
//        private TeamRepository underTest;
//
//        @Autowired
//        public TeamRepositoryIntegrationTest(TeamRepository underTest){
//            this.underTest = underTest;
//
//        }
//
//        @Test
//        @Transactional
//        public void testThatTeamCanBeCreatedAndRecalled(){
//
//            Team visma = TestDataUtil.createTestTeamVisma();
//
//            underTest.save(visma);
//            Optional<Team> result = underTest.findById(visma.getId());
//            assertThat(result).isPresent();
//            assertThat(result.get()).isEqualTo(visma);
//
//        }
//
//        @Test
//        @Transactional
//        public void testThatMultipleTeamsCanBeCreatedAndRecalled(){
//            Team visma = TestDataUtil.createTestTeamVisma();
//            underTest.save(visma);
//
//            Team soudal = TestDataUtil.createTestTeamSoudal();
//            underTest.save(soudal);
//
//
//            Iterable<Team> result = underTest.findAll();
//            assertThat(result).containsExactly(visma, soudal);
//
//        }
//
//
//}
