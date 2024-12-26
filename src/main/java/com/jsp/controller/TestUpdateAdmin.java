package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;
@WebServlet("/update")
public class TestUpdateAdmin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		long phno=Long.parseLong(req.getParameter("phone"));
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		Admin admin=new Admin();
		admin.setId(id);
		admin.setName(name);
		admin.setPhone(phno);
		admin.setEmail(email);
		admin.setPassword(password);
		
		AdminService adminService=new AdminService();
		Admin admin2=adminService.saveAdmin(admin);
		if(admin2!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("editadmin.jsp");
			dispatcher.include(req, resp);
		}
	}
}
