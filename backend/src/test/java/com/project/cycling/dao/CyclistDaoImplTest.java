package com.project.cycling.dao;


import com.project.cycling.TestDataUtil;
import com.project.cycling.dao.impl.CyclistDaoImpl;
import com.project.cycling.domain.Cyclist;
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
public class CyclistDaoImplTest {

    @Mock
    private JdbcTemplate jdbcTemplate;

    @InjectMocks
    private CyclistDaoImpl underTest;

    @Test
    public void testThatCreatesCyclistGeneratesCorrectSql(){

        Cyclist cyclist = TestDataUtil.createTestCyclist();


        underTest.create(cyclist);

        verify(jdbcTemplate).update(
                eq("INSERT INTO cyclists (id, first_name, last_name, team_id) VALUES (?, ?, ?, ?)"),
                eq(1L),
                eq("Jonas"),
                eq("Vingeggard"),
                eq(1L)
        );
    }

    @Test
    public void testThatFindOneGeneratesTheCorrectSql(){
        underTest.findOne(1L);
        verify(jdbcTemplate).query(
                eq("SELECT id, first_name, last_name, team_id FROM cyclists WHERE id = ? LIMIT 1"),
                ArgumentMatchers.<CyclistDaoImpl.CyclistRowMapper>any(),
                eq(1L)
                );
    }

}
