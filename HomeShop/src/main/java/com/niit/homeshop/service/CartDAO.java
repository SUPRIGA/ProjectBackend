package com.niit.homeshop.service;

import java.util.List;

import com.niit.homeshop.model.Cart;



public interface CartDAO {
	
	 public List<Cart> getAllCart();
	   public  List<Cart> getCart(String user_name);
	   public void insertCart(Cart cart);
	   public void updateCart(Cart cart);
	   public void deleteCart(int id);
	   public void deleteallCart(Cart cart);


}
