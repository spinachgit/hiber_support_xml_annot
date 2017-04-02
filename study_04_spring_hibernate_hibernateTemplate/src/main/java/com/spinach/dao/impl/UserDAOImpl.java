package com.spinach.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spinach.dao.UserDAO;
import com.spinach.model.User;

@Component("u")
public class UserDAOImpl implements UserDAO {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void save(User user) {
		System.out.println("hibernateTemplate代替sessionFactory-->session.save(object)实现！  ");
		hibernateTemplate.saveOrUpdate(user);
		System.out.println("保存成功！ ");
		// throw new RuntimeException("exeption!");
	}

}
