package com.niit.homeshop.service;

import java.util.List;

import com.niit.homeshop.modal.Category;


public interface CategoryDAO {

	   public List<Category> getAllCategory();
	   public  Category getCategory(int category_id);
	   public void insertCategory(Category category);
	   public void updateCategory(Category category);
	   public void deleteCategory(int id);
	   public void deleteallCategory(Category category);

}
