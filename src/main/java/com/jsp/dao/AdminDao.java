package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;

public class AdminDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("god");
	public Admin saveAdmmin(Admin admin) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		if(admin!=null) {
			entityTransaction.begin();
			entityManager.persist(admin);
			entityTransaction.commit();
		}
		return admin;	
	}

	public List<Admin> displayAdmin() {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select a from Admin a");
		List<Admin> list=query.getResultList();
		return list;
	}
	
	public Admin deleteAdmin(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Admin admin=entityManager.find(Admin.class,id);
		if(admin!=null) {
			entityTransaction.begin();
			entityManager.remove(admin);
			entityTransaction.commit();
		}
		return admin;
	}
	
	public Admin updateAdmin(int id) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Admin admin=entityManager.find(Admin.class,id);
		if(admin!=null) {
			entityTransaction.begin();
			entityManager.merge(admin);
			entityTransaction.commit();
		}
		return admin;	}
}
