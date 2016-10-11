package com.niit.homeshop.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Supplier")
@Component
public class Supplier {
	
	 @Id
	 @Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int supplier_id; 
	 @Column
	private String supplier_name;
	 @Column
	private String email_id;
	 @Column
	private int mobile_number;
	 @Column
	private String supplier_address;


	public int getSupplier_Id() {
	 return supplier_id;
	}
	public void setSupplier_Id(int supplier_id) {
	 this.supplier_id = supplier_id;
	}
	public String getSupplier_Name() {
	 return supplier_name;
	}
	public void setSupplier_Name(String supplier_name) {
	 this.supplier_name = supplier_name;
	}
	public String getEmail_id() {
	 return email_id;
	}
	public void setEmail_id(String email_id) {
	 this.email_id = email_id;
	}
	
	public int getMobile_Number() {
		 return mobile_number;
	}
	public void setMobile_Number(int mobile_number) {
	 this.mobile_number = mobile_number;
	}
	public String getSupplierAddress() {
	 return supplier_address;
	}
	public void setSupplier_Address(String supplier_address) {
	 this.supplier_address = supplier_address;
	}


}



