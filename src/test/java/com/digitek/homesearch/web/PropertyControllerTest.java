package com.digitek.homesearch.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.digitek.homesearch.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PropertyControllerTest {
	
	@LocalServerPort
	private int port;
	
	TestRestTemplate restTemplate = new TestRestTemplate();
	
	HttpHeaders headers = new HttpHeaders();
	
	@Test
	public void getProperties() {
		HttpEntity<String> entity = new HttpEntity<String>(null,headers);
		ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/property"),HttpMethod.GET,entity,String.class);
		String expected = "[{id:100},{id:101}]";
		JSONAssert.assertEquals(expected,response.getBody(),false);
	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
}
