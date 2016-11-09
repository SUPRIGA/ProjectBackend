package com.niit.homeshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Product")
@Component
public class Product {
	@Id
	@Column(name="id")
	@GeneratedValue
		private int id;
	
	  @Column
		private String pn;
	  @Column
		private String description;
	  @Column
		private int quantity;
	  @Column
		private int price ; 
	  @Column
		private String category_name;
	  @Column
		private String sn;
	 
	  @Column
		private int liters;
	  @Column
		private int weight ; 

	
		
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		public String getDescription() {
		  return description;
		}
		public void setDescription(String description) {
			this.description = description;
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
		
	  
	    public String getPn() {
			return pn;
		}
		public void setPn(String pn) {
			this.pn = pn;
		}
		
		public String getCategory_name() {
			return category_name;
		}
		public void setCategory_name(String category_name) {
			this.category_name = category_name;
		}
		public String getSn() {
			return sn;
		}
		public void setSn(String sn) {
			this.sn = sn;
		}
		public int getLiters() {
		  return liters;
		}
		public void setLiters(int liters) {
			this.liters =liters;
		}
		public int getWeight() {
		  return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
	}
							
	


