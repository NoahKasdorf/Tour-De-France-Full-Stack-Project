package com.project.cycling.dao;

import com.project.cycling.TestDataUtil;
import com.project.cycling.dao.impl.TeamDaoImpl;
import com.project.cycling.domain.Team;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class TeamDaoImplTest {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private TeamDaoImpl underTest;

    @Test
    public void testThatCreatesTeamGeneratesCorrectSql() {

        Team team = TestDataUtil.createTestTeam();


        underTest.create(team);

        verify(jdbcTemplate).update(
                eq("INSERT INTO cyclists (id, name, country, bikeBrand) VALUES (?, ?, ?, ?)"),
                eq(1L),
                eq("Visma Lease A Bike"),
                eq("Denmark"),
                eq("Cervelo")
        );

    }

    @Test
    public void testThatFindOneGeneratesTheCorrectSql(){
        underTest.findOne(1L);
        verify(jdbcTemplate).query(
                eq("SELECT id, name, country, bikeBrand FROM cyclists WHERE id = ? LIMIT 1"),
                ArgumentMatchers.<TeamDaoImpl.TeamRowMapper>any(),
                eq(1L)
        );
    }
}
