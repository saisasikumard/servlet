package com.jsp.service;

import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dto.Admin;

public class AdminService {
	AdminDao dao=new AdminDao();
	
	public Admin saveAdmin(Admin admin) {
		return dao.saveAdmmin(admin);
	}
	
	public List<Admin> displayAdmin(){
		return dao.displayAdmin();
	}
	
	public Admin deleteAdmin(int id) {
		return dao.deleteAdmin(id);
	}
	
	public Admin updateAdmin(int id) {
		return dao.updateAdmin(id);
	}
}
