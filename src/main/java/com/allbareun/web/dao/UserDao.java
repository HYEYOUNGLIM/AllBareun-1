package com.allbareun.web.dao;

import com.allbareun.web.entity.User;

public interface UserDao {

	boolean isValid(String email, String password);
	User get(String email, String password);
	String getEmail(String name, String phone);
	String getPassword(String email, String name, String phone);
	int insert(User user);
	int update(User user);
	int delete(User user);
	User getById(int id);
}
