package com.bigdocument.bigdocument.controller;

import com.bigdocument.bigdocument.service.BigDocumentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BigDocumentController.class)
public class BigDocumentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BigDocumentService bigDocumentService;

    @Test
    public void tesBadRequest() throws Exception {
        this.mockMvc.perform(post("/api/big-document")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"pageSize\": \"0\", \"offset\": \"0\"}"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void testGoodRequest() throws Exception {
        this.mockMvc.perform(post("/api/big-document")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"pageSize\": \"10\", \"offset\": \"0\"}"))
                .andExpect(status().isOk());
    }
}
