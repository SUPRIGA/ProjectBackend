package com.niit.homeshop.service;

import java.util.List;

import com.niit.homeshop.modal.ShippingAddress;



public interface ShippingAddressDAO {
	
	 public List<ShippingAddress> getAllShippingAddress();
	   public  ShippingAddress getShippingAddress(int shippingaddress_id);
	   public void insertShippingAddress(ShippingAddress shippingaddress );
	   public void updateShippingAddress(ShippingAddress shippingaddress );
	   public void deleteShippingAddress(int id);
	   public void deleteallShippingAddress(ShippingAddress shippingaddress);

}
