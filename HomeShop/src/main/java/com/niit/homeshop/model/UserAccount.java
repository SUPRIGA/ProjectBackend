package com.niit.homeshop.model;


/*import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

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
	
	
		private String user_name;
	
	
		private String gender;
	
		private String email_id;
	
		private String password;
	
		private int mn;

		private String address;

	private boolean enabled=true;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMn() {
		return mn;
	}

	public void setMn(int mn) {
		this.mn = mn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


}
*/


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

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
		private String user_name;
	
	@Column
		private String gender;
	@Column
		private String email_id;
	@Column
		private String password;
	@Column
		private int mn;
	@Column
		private String address;
	@Column
	private boolean enabled=true;

public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
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
		
		public String getUser_name() {
			return user_name;
		}
		public void setUser_name(String user_name) {
			this.user_name = user_name;
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
		
		
		public int getMn() {
			return mn;
		}
		public void setMn(int mn) {
			this.mn = mn;
		}
		public String getAddress() {
		 return address;
		}
		public void setAddress(String address) {
		 this.address = address;
		}
		
			
		}

		


