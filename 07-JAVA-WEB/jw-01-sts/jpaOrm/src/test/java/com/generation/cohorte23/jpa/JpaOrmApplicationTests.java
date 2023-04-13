package com.generation.cohorte23.jpa;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

@SpringBootTest
@AutoConfigureMockMvc

class JpaOrmApplicationTests {
@Autowired
private MockMvc mockMvc; 

@Test
	void contextLoads() throws Exception {
	this.mockMvc.perform(get("/usuario/1"))
	.andDo(print())
	.andExpect(status().isOk())
	.andExpect( (ResultMatcher) content().string(
			containsString("juan")
			));
	}

}
