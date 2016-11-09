package com.niit.homeshop.service;

import java.util.List;

import com.niit.homeshop.model.Role;



public interface RoleDAO {
	
	 public List<Role> getAllRole();
	   public  Role getRole(String user_name);
	   public void insertRole(Role role);
	   public void updateRole(Role role);
	   public void deleteRole(int id);
	   public void deleteallRole(Role role);


}
