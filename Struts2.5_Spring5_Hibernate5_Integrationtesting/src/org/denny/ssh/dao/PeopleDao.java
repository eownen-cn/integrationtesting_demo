package org.denny.ssh.dao;

import java.sql.SQLException;
import java.util.List;

import org.denny.ssh.vo.People;

public interface PeopleDao {
	
	public void add(People peo) throws SQLException ;
	
	public People getById(Integer pid) ;
	
	public List<?> getList() ;
	
}
