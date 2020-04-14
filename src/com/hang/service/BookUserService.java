package com.hang.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hang.pojo.BookCategory;
import com.hang.pojo.BookInfo;
import com.hang.pojo.BookUser;

public interface BookUserService {

	//定义一个登录的方法
	BookUser loginValidate(@Param("userId") String userId,@Param("userPsw") String userPsw);
	//定义一个注册的方法
	int saveUser(BookUser user);
	//获取图书种类
	List<BookCategory> getBookCategory();
	
	//查询图书信息
	List<BookInfo> getBookInfo();
}
