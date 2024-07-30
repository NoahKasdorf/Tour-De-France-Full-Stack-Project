//package com.project.cycling.controllers;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.project.cycling.TestDataUtil;
//import com.project.cycling.domain.Team;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//@AutoConfigureMockMvc
//public class TeamControllerIntegrationTest {
//
//
//    private MockMvc mockMvc;
//
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    public TeamControllerIntegrationTest(MockMvc mockMvc) {
//        this.mockMvc = mockMvc;
//        this.objectMapper = new ObjectMapper();
//    }
//
////    @Test
////    public void testThatCreatesTeamSuccessfully() throws Exception {
////
////        Team testTeam = TestDataUtil.createTestTeamDecathalon();
////        String teamJson = objectMapper.writeValueAsString(testTeam);
////
////        mockMvc.perform(
////                MockMvcRequestBuilders.post("/teams")
////                .contentType(MediaType.APPLICATION_JSON)
////                .content(teamJson)
////        ).andExpect(MockMvcResultMatchers.status().isCreated());
////
////
////    }
//
//    @Test
//    @Transactional
//    public void testThatCreatesTeamSuccessfullyReturnsSaveTeam() throws Exception {
//
//        Team testTeam = TestDataUtil.createTestTeamDecathalon();
//        String teamJson = objectMapper.writeValueAsString(testTeam);
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.post("/teams")
////                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(teamJson)
//        ).andExpect(MockMvcResultMatchers.jsonPath("$.id").isNumber());
//
//
//    }
//
//
//}
