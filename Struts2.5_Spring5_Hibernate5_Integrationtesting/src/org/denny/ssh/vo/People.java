package org.denny.ssh.vo;

import java.io.Serializable;

public class People implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer pid ;
	
	private String pname ;
	
	private String password ;

	public final Integer getPid() {
		return pid;
	}

	public final void setPid(Integer pid) {
		this.pid = pid;
	}

	public final String getPname() {
		return pname;
	}

	public final void setPname(String pname) {
		this.pname = pname;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}

	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public People(String pname, String password) {
		super();
		this.pname = pname;
		this.password = password;
	}

	@Override
	public String toString() {
		return "People [pid=" + pid + ", pname=" + pname + ", password=" + password + "]";
	}
	
}
