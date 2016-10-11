package com.niit.homeshop.modal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Role")
@Component

public class Role {
		
		@Id
		@Column
		@GeneratedValue(generator = "newGenerator")
		@GenericGenerator(name="newGenerator",strategy="foreign", parameters = {@Parameter(value = "user", name="property")})
		
	  private int user_id; 
		@Column
		private  int role_id;
		@Column
	     private String role; 
		@Column
		 private String password;
		@Column
		  private String user_name;
		@Column
		 private String enabled;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="user_id")

private UserAccount  useraccount; 
		
		public UserAccount getUseraccount() {
			return useraccount;
		}
		public void setUseraccount(UserAccount useraccount) {
			this.useraccount = useraccount;
		}
		public int getRole_Id() {
		 return role_id;
		}
		public void setRole_Id(int role_id) {
			this.role_id = role_id;
		}
		public int getUser_Id() {
		 return user_id;
		}
		public void setUser_Id(int user_id) {
		    this.user_id = user_id;
		}
		public String getPassword() {
		 return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		public String getUser_name() {
			 return user_name;
			}
			public void setUser_name(String user_name) {
				this.user_name = user_name;
			}
			public String getEnabled() {
				 return enabled;
				}
				public void setEnabled(String enabled) {
					this.enabled = enabled;
				}
				public String getRole() {
					 return role;
					}
					public void setRole(String role) {
						this.role= role;
					}
			
		}



