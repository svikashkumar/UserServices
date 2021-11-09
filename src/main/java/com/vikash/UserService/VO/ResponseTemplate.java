package com.vikash.UserService.VO;

import com.vikash.UserService.Entity.User;

public class ResponseTemplate {
	private User user;
	private DepartmentVO department;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public DepartmentVO getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentVO department) {
		this.department = department;
	}
	

}
