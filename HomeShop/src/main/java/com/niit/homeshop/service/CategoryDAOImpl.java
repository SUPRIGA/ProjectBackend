package com.niit.homeshop.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.homeshop.model.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory= sessionFactory; 
	}
	

	public SessionFactory getSession()
	{
		return sessionFactory;
	}
	

	@Transactional
	public List<Category> getAllCategory() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

	@Transactional
	public Category getCategory(int category_id) {
		return(Category)sessionFactory.getCurrentSession().get(Category.class, category_id);
	}

	@Transactional
	public void insertCategory(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);

	}

	@Transactional
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}

	@Transactional
	public void deleteCategory(int id) {
		Category deleteCategory=new Category();
		  deleteCategory.setCid(id);
		  sessionFactory.getCurrentSession().delete(deleteCategory);
  

	}

	public void deleteallCategory(Category category) {
		// TODO Auto-generated method stub

	}

}
