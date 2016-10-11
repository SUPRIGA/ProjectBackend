package com.niit.homeshop.service;
import java.util.List;
import com.niit.homeshop.modal.UserAccount;
public interface UserAccountDAO {
	
	   public List<UserAccount> getAllUserAccounts();
	   public  UserAccount getUserAccount(int user_id);
	   public void insertUserAccount(UserAccount userAccount);
	   public void updateUserAccount(UserAccount userAccount);
	   public void deleteUserAccount(int id);
	   public void deleteallUserAccount(UserAccount userAccount);
	}


