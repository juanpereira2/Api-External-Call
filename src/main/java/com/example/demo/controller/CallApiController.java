package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CallApiController {

	@Autowired
	private RestTemplate restTemplate;
	
	private static String url = "https://restcountries.eu/rest/v2/all";
	
	@GetMapping("/paises")
	public List<Object> getPaises(){
		Object[] paises = restTemplate.getForObject(url, Object[].class);
		return Arrays.asList(paises);
	}
}
