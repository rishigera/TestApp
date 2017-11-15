package com.digitek.homesearch.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digitek.homesearch.model.Property;

@Component
public class PropertyDAOMyBatisImpl implements PropertyDAO {
	
/*	@Override
	public List<Property> getProperties() {
		SqlSession session = null;
		List<Property> properties = null;
		try {
			session = MyBatisConfig.getSqlSessionFactory().openSession();
			PropertyDAO mapper = session.getMapper(PropertyDAO.class);
			properties = mapper.getProperties();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (session != null)
			session.close();
		}
		return properties;
	}
*/	
	@Autowired
	private SqlSession session;

	@Override
	public List<Property> getProperties() {
		PropertyDAO mapper = session.getMapper(PropertyDAO.class);
		return mapper.getProperties();
	}
}
