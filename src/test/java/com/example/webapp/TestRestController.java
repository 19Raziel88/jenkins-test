package com.example.webapp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.webapp.controller.SalutiRestController;

@RunWith(SpringRunner.class)
@WebMvcTest(SalutiRestController.class)
public class TestRestController {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testGreetingsController() throws Exception{
		
		mvc.perform(get("/api/test")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$")
				.value("Oggi è il 29/10/2021."))
				.andDo(print());
	}
}
