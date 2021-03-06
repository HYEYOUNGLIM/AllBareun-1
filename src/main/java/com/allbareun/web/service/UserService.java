package com.allbareun.web.service;

import javax.servlet.http.HttpSession;

import com.allbareun.web.entity.User;

public interface UserService{
	boolean isValid(String email, String password);
	User get(String email, String password);
	String getEmail(String name, String phone);
	String getPassword(String email, String name, String phone);
	int insert(User user);
	int update(User user);
	int delete(User user);
	int idCheck(String query);
	//회원로그아웃
	void logout(HttpSession session);
}
