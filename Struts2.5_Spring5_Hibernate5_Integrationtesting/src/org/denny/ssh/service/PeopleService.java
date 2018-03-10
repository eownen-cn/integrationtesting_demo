package org.denny.ssh.service;

import java.sql.SQLException;
import java.util.List;

import org.denny.ssh.dao.PeopleDao;
import org.denny.ssh.vo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
	
	@Autowired
	private PeopleDao peopleDao ;

	public boolean login(String pname,String password) {
		@SuppressWarnings("unchecked")
		List<People> peoples = (List<People>) peopleDao.getList();
		for ( People p : peoples ) {
			if (p.getPname().equals(pname) && p.getPassword().equals(password)) {
				System.out.println("登陆成功！");
				return true ;
			}
		}
		
		return false ;
	}
	
	public boolean register(String pname,String password) {
		@SuppressWarnings("unchecked")
		List<People> peoples = (List<People>) peopleDao.getList();
		for ( People p : peoples ) {
			if (p.getPname().equals(pname)) {
				System.out.println("用户已存在！");
				return false ;
			}
		}
		return true ;
	}
	
	public void addPeople(People peo) throws SQLException {
		this.peopleDao.add(peo);
	}
	
}
