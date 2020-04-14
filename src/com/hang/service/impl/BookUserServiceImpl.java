package com.hang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hang.mapper.user.BookUserMapper;
import com.hang.pojo.BookCategory;
import com.hang.pojo.BookInfo;
import com.hang.pojo.BookUser;
import com.hang.service.BookUserService;

@Service
public class BookUserServiceImpl implements BookUserService {

	//创建mapper
	@Autowired
	private BookUserMapper BookUserMapper;
	
	//登录的操作
	@Override
	public BookUser loginValidate(String userId, String userPsw) {
		return BookUserMapper.loginValidate(userId, userPsw);
	}

	//注册用户的操作
	@Override
	public int saveUser(BookUser user) {
		return BookUserMapper.saveUser(user);
	}

	@Override
	public List<BookCategory> getBookCategory() {
		// TODO Auto-generated method stub
		return BookUserMapper.getBookCategory();
	}

	@Override
	public List<BookInfo> getBookInfo() {
		// TODO Auto-generated method stub
		return BookUserMapper.getBookInfo();
	}

}
