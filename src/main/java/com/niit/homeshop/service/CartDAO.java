package com.niit.homeshop.service;

import java.util.List;

import com.niit.homeshop.modal.Cart;



public interface CartDAO {
	
	 public List<Cart> getAllCart();
	   public  Cart getCart(int cart_id);
	   public void insertCart(Cart cart);
	   public void updateCart(Cart cart);
	   public void deleteCart(int id);
	   public void deleteallCart(Cart cart);


}
