package com.niit.homeshop.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Cart")
@Component
public class Cart {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	     private int cart_id;
	@Column
		private int user_id;
	@Column
		private int product_id;
	@Column
		private int quantity;
	@Column
		private int price ; 
		
		
		public int getCart_Id() {
			 return cart_id;
			}
			public void setCart_Id(int cart_id) {
				this.cart_id = cart_id;
			}
		public int getUser_Id() {
			 return user_id;
			}
			public void setUser_Id(int user_id) {
				this.user_id = user_id;
			}
		public int getProduct_Id() {
			 return product_id;
			}
			public void setProduct_Id(int product_id) {
				this.product_id = product_id;
			}
			public int getQuantity() {
				 return quantity;
				}
				public void setQuantity(int quantity) {
					this.quantity = quantity;
				}
				public int getPrice() {
					 return price;
					}
					public void setPrice(int price) {
						this.price = price;
					}
	}



