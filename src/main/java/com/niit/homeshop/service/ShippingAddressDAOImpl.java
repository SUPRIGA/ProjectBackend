package com.niit.homeshop.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.homeshop.modal.ShippingAddress;

@Repository("ShippingAddressDAO")

public class ShippingAddressDAOImpl implements ShippingAddressDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
   public SessionFactory getSession()
	{
		return sessionFactory;
	}
	
	public ShippingAddressDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}

	@Transactional
	public List<ShippingAddress> getAllShippingAddress() {
		return sessionFactory.getCurrentSession().createQuery("from ShippingAddress ").list();
	}

	@Transactional
	public ShippingAddress getShippingAddress(int shippingaddress_id) {
		return(ShippingAddress)sessionFactory.getCurrentSession().get(ShippingAddress.class, shippingaddress_id);
	}
	
	@Transactional
	public void insertShippingAddress(ShippingAddress shippingaddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingaddress);

	}

	@Transactional
	public void updateShippingAddress(ShippingAddress shippingaddress) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteShippingAddress(int id) {
		ShippingAddress deleteShippingAddress=new ShippingAddress();
		  deleteShippingAddress.setShippingAddress_Id(id);
		  sessionFactory.getCurrentSession().delete(deleteShippingAddress);
	}

	@Transactional
	public void deleteallShippingAddress(ShippingAddress shippingaddress) {
		// TODO Auto-generated method stub

	}

	
		
	}


