package io.shan.SpringBootTDD;


import io.shan.SpringBootTDD.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootTddApplicationTests {


	@Autowired
	TestRestTemplate restTemplate;

	@Test
	public void getAllUsers(){
        ResponseEntity<User[]> usersResponseEntity = restTemplate.getForEntity("/v1/users", User[].class);
        assertTrue(usersResponseEntity.getStatusCode().is2xxSuccessful());
        assertNotNull(usersResponseEntity.getBody());

	}
}

