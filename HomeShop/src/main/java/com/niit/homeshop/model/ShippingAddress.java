package com.niit.homeshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "ShippingAddress")
@Component

public class ShippingAddress {
	
	 @Id
	 @Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int shippingaddress_id;
	 @Column
		private int id;
	 @Column
		private int user_id ; 
	 @Column
		private int price;
	 @Column
		private int mobile_number;
	 @Column
		private String address;
	   
		
	public int getShippingAddress_Id() {
		return  shippingaddress_id;
	}
	public void setShippingAddress_Id(int shippingaddress_id) {
		this. shippingaddress_id = shippingaddress_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_Id() {
		return user_id;
	}
	public void setUser_Id(int user_id) {
		this.user_id = user_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMobile_Number() {
		return mobile_number;
	}
	public void setMobile_Number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	}


