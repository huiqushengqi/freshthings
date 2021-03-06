package com.yixin.freshthings;

import com.yixin.freshthings.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class SpringbootApplicationTests {

    private MockMvc mock;

    public void setUp() throws Exception{
        mock = MockMvcBuilders.standaloneSetup(new UserController()).build();

    }
    @Test
    public void testHome() throws Exception{
        mock.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON));

    }

}
