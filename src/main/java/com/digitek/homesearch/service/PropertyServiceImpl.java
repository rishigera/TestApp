package com.digitek.homesearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitek.homesearch.dao.PropertyDAO;
import com.digitek.homesearch.model.Property;

@Service
public class PropertyServiceImpl implements PropertyService {
	
	private PropertyDAO dao;
	
	@Autowired
	public PropertyServiceImpl(PropertyDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Property> getAll() {
		return dao.getProperties();
	}

}
