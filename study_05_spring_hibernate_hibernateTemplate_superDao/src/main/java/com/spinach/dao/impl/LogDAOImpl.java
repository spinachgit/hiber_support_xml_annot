package com.spinach.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.spinach.dao.LogDAO;
import com.spinach.model.Log;

@Component("logDAO") 
public class LogDAOImpl extends SuperDAO implements LogDAO {

	
	public void save(Log log) {
		
		//this.getHibernateTemplate().save(log);
		this.getHibernateTemplate().save(log);
		//throw new RuntimeException("error!");
	}

}
