package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.User;

@Repository
public class MySqlUserDao implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addRecord(User user) {
		getSession().save(user);
		System.out.println("Record added...");
	}
	
	private Session getSession() {
		Session ssn=null;
		
		try {
			ssn=sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			ssn=sessionFactory.openSession();
		}
			
		
		return ssn;
	}

}
