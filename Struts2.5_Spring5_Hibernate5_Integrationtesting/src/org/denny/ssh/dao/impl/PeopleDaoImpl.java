package org.denny.ssh.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.denny.ssh.dao.PeopleDao;
import org.denny.ssh.vo.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("peopleDao")
public class PeopleDaoImpl implements PeopleDao{

	@Autowired
	private SessionFactory sessionFactory ;
	
	public void add(People peo) throws SQLException {
		sessionFactory.openSession().save(peo) ;
	}

	
	public People getById(Integer pid) {
		return sessionFactory.openSession().get(People.class, pid) ;
	}

	
	public List<?> getList() {
		return sessionFactory.openSession().createQuery("from People").list() ;
	}

}
