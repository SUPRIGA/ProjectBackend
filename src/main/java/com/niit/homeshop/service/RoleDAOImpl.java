package com.niit.homeshop.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.homeshop.modal.Role;

@Repository("RoleDAO")
public class RoleDAOImpl implements RoleDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public RoleDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}
	

	public SessionFactory getSession()
	{
		return sessionFactory;
	}

	@Transactional
	public List<Role> getAllRole() {
		return sessionFactory.getCurrentSession().createQuery("from Role").list();
		
	}

	@Transactional
	public Role getRole(int role_id) {
		return(Role)sessionFactory.getCurrentSession().get(Role.class, role_id);
		
	}

	@Transactional
	public void insertRole(Role role) {
		sessionFactory.getCurrentSession().saveOrUpdate(role);

	}

	@Transactional
	public void updateRole(Role role) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteRole(int id) {
		Role deleteRole=new Role();
		deleteRole.setRole_Id(id);
		sessionFactory.getCurrentSession().delete(deleteRole);

	}

	@Transactional
	public void deleteallRole(Role role) {
		// TODO Auto-generated method stub

	}

}
