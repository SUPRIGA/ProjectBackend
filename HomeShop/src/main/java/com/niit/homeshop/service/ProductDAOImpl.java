package com.niit.homeshop.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.homeshop.model.Product;




@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSession()
	{
		return sessionFactory;
	}
	
	public ProductDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}
	
	@Transactional
	public List<Product> getAllProduct() {
		
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}
	
	@Transactional
	public Product getProduct(int product_id) {
		return(Product)sessionFactory.getCurrentSession().get(Product.class, product_id);
	}

	@Transactional
	public void insertProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

	@Transactional
	public void updateProduct(Product product) {
		

	}

	@Transactional
	public void deleteProduct(int id) {
		Product deleteProduct=new Product();
		  deleteProduct.setId(id);
		  sessionFactory.getCurrentSession().delete(deleteProduct);


	}

	public void deleteallProduct(Product product) {
		// TODO Auto-generated method stub

	}

}
