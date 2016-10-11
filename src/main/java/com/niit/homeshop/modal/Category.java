package com.niit.homeshop.modal;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int category_id;
    
    @Column
	   private String category_name; 
    @Column
	   private String category_description; 

	   
    public int getCategory_Id() {
	     return category_id;
    }
	public void setCategory_Id(int category_id) {
		 this.category_id = category_id;
	}
    public String getCategory_Name() {
        return category_name;
    }
    public void setCategory_Name(String category_name) {
	    this.category_name = category_name;
    }
    public String getCategory_Description() {
	     return category_description ;
	}
	public void setCategory_Description(String category_description) {
		 this.category_description = category_description;
	}
}



 