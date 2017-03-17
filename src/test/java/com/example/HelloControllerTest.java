package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Created by zc.lin on 2017/3/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        // init applicationContext
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void postIndex() throws Exception {
        // get using get
        this.mockMvc
                .perform(
                        post("/hello/index")
                                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andDo(print());
    }

    @Test
    public void getIndex() throws Exception {
        // get using get
        this.mockMvc
                .perform(
                        get("/hello/index")
                                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().is(405))
                .andDo(print());
    }

}