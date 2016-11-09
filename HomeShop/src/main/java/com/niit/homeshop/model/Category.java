package com.niit.homeshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Category")
@Component
public class Category {
	
    @Id
    @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	   private int category_id;
    
    @Column
	   private String cn; 
    @Column
	   private String cd; 

	   
    public int getCategory_Id() {
	     return category_id;
    }
	public void setCategory_Id(int category_id) {
		 this.category_id = category_id;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
   
}



 