package com.niit.homeshop.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.homeshop.model.Supplier;




@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}
	
	public SessionFactory getSession()
	{
		return sessionFactory;
	}

	@Transactional
	public List<Supplier> getAllSupplier() {
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	}

	@Transactional
	public Supplier getSupplier(int supplier_id) {
		return(Supplier)sessionFactory.getCurrentSession().get(Supplier.class, supplier_id);
	}

	@Transactional
	public void insertSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
	}

	@Transactional
	public void updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteSupplier(int id) {
		Supplier deleteSupplier=new Supplier();
		  deleteSupplier.setSupplier_Id(id);
		  sessionFactory.getCurrentSession().delete(deleteSupplier);
	}

	@Transactional
	public void deleteallSupplier(Supplier supplier) {
		// TODO Auto-generated method stub

	}

}
