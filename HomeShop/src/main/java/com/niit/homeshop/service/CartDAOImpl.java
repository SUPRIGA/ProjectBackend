package com.niit.homeshop.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.homeshop.model.Cart;

@Repository("CartDAO")
public class CartDAOImpl implements CartDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSession()
	{
		return sessionFactory;
	}
	
	public CartDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}

	@Transactional
	public List<Cart> getAllCart() {
		return sessionFactory.getCurrentSession().createQuery("from Cart").list();
	}

	@Transactional
	public List<Cart> getCart(String pn) {
		return sessionFactory.getCurrentSession().createQuery("from Cart where pn='"+pn+"'").list();
	}

	@Transactional
	public void insertCart(Cart cart) {
		System.out.println("inside insert cart");
		sessionFactory.getCurrentSession().saveOrUpdate(cart);

	}

	@Transactional
	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteCart(int id) {
		Cart deleteCart=new Cart();
		  deleteCart.setCart_id(id);
		  sessionFactory.getCurrentSession().delete(deleteCart);

	}

	@Transactional
	public void deleteallCart(Cart cart) {
		// TODO Auto-generated method stub

	}

}
