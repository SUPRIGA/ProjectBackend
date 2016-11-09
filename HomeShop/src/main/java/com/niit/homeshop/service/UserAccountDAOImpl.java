package com.niit.homeshop.service;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.homeshop.model.UserAccount;



@Repository("UserAccountDAO")

public class UserAccountDAOImpl implements UserAccountDAO {
	
	@Autowired
private SessionFactory sessionFactory;
	public SessionFactory getSession()
	{
		return sessionFactory;
	}
	public UserAccountDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory =sessionFactory;
	}
	
@Transactional
	public List<UserAccount> getAllUserAccounts() {
		
		return sessionFactory.getCurrentSession().createQuery("from UserAccount").list();
	}

@Transactional
	public UserAccount getUserAccount(int user_id) {
		
		return(UserAccount)sessionFactory.getCurrentSession().get(UserAccount.class, user_id);
	}

@Transactional
	public void insertUserAccount(UserAccount userAccount) {
	sessionFactory.getCurrentSession().saveOrUpdate(userAccount);

	}

@Transactional
	public void updateUserAccount(UserAccount useraccount) {
		// TODO Auto-generated method stub

	}
@Transactional
	public void deleteUserAccount(int id) {
	  UserAccount deleteUserAccount=new UserAccount();
	  deleteUserAccount.setUser_Id(id);
	  sessionFactory.getCurrentSession().delete(deleteUserAccount);
	  

	}
public void deleteallUserAccount(UserAccount userAccount) {
	// TODO Auto-generated method stub
	
}

	

}
