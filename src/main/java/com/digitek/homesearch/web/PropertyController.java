package com.digitek.homesearch.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitek.homesearch.model.Property;
import com.digitek.homesearch.service.PropertyService;

@RestController
public class PropertyController {
	
	private PropertyService service;
	
	@Autowired
	public PropertyController(PropertyService service) {
		this.service = service;
	}
	
	@RequestMapping("/property")
	public List<Property> getProperties(HttpServletRequest request) {
		return service.getAll();
	}

}
