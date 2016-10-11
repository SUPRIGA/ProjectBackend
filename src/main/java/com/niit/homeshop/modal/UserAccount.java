package com.niit.homeshop.modal;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "UserAccount")
@Component
public class UserAccount {
	@Id
	@Column
	@GeneratedValue
		private int user_id;
	
	@Column
		private String first_name;
	@Column
		private String last_name;
	@Column
		private String gender;
	@Column
		private String email_id;
	@Column
		private String password;
	@Column
		private int mobile_number;
	@Column
		private String address;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="user_id")

private Role role;
		public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
		public int getUser_Id() {
		 return user_id;
		}
		public void setUser_Id(int user_id) {
		 this.user_id = user_id;
		}
		public String getFirst_Name() {
		  return first_name;
		}
		public void setFirst_Name(String first_name) {
		 this.first_name = first_name;
		}
		public String getLast_Name() {
			  return last_name;
			}
			public void setLast_Name(String last_name) {
			 this.last_name =last_name;
			}
		public String getGender() {
			 return gender;
			}
			public void setGender(String gender) {
			 this.gender =gender;
			}
		public String getEmail_id() {
		 return email_id;
		}
		public void setEmail_id(String email_id) {
		 this.email_id = email_id;
		}
		public String Password() {
			 return password;
		}
		public void setPassword(String password) {
		 this.password = password;
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

		


