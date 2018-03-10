package org.denny.ssh.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.denny.ssh.service.PeopleService;
import org.denny.ssh.vo.People;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PeopleAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private PeopleService peopleService ;
	
	public void setPeopleService(PeopleService peopleService) {
		this.peopleService = peopleService;
	}
	
	public String execute() {
		System.out.println("execute ... index");
		return SUCCESS ;
	}
	
	public String register() {
		System.err.println("execute ... register");
		HttpServletRequest request = ServletActionContext.getRequest();
		try {
			this.peopleService.addPeople(new People(request.getParameter("pname"),request.getParameter("password")));
		} catch (SQLException e) {
			System.out.println("注册失败！");
			return ERROR ;
		}
		return SUCCESS ;
	}
	
	public String login() {
		System.err.println("execute ... login");
		HttpServletRequest request = ServletActionContext.getRequest();
		String pname = request.getParameter("pname");
		String password = request.getParameter("password");
		boolean result = this.peopleService.login(pname, password) ;
		return result ? SUCCESS : ERROR ;
	}
	
}
