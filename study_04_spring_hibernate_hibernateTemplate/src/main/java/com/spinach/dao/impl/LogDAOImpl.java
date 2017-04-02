package com.spinach.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spinach.dao.LogDAO;
import com.spinach.model.Log;

@Component("logDAO") 
public class LogDAOImpl implements LogDAO {
	//@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Log log) {
		
		Session s = sessionFactory.getCurrentSession();
		s.save(log);
		//throw new RuntimeException("error!");
	}

}
