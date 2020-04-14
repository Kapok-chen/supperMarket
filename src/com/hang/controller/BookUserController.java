package com.hang.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hang.Tools.MD5;
import com.hang.pojo.BookCategory;
import com.hang.pojo.BookInfo;
import com.hang.pojo.BookUser;
import com.hang.service.BookUserService;

@Controller
public class BookUserController {

	@Autowired(required=true)
	private BookUserService BookUserService;
	
	
	@RequestMapping("userlogin")
	public ModelAndView userlogin(@Param("userId") String userId,@Param("userPsw") String userPsw) {
		String userPsw1 = MD5.MD5(userPsw);
		BookUser user = new BookUser();
		user.getUserName();
		user.getUserPsw();
		BookUserService.loginValidate(userId, userPsw1);
		ModelAndView mav = new ModelAndView("redirect:/getBookCategory");
		return mav;
	}
	
	/*
	 * //定义一个注册的方法 int saveUser(BookUser user);
	 */
	@RequestMapping("saveUser")
	public ModelAndView saveUser(BookUser user,String userPsw) {
		String userPsw1 = MD5.MD5(userPsw);
		System.out.println(userPsw1);
		user.setUserPsw(userPsw1);
		BookUserService.saveUser(user);
		ModelAndView mav = new ModelAndView("user-login");
		return mav;
	}
	
	//显示图书类别的页面
	@RequestMapping("getBookCategory")
	public ModelAndView getBookCategory() {
		ModelAndView mav = new ModelAndView();
		List<BookCategory> getBookCategory = BookUserService.getBookCategory();
		mav.addObject("getBookCategory",getBookCategory);
		//显示图书内容
		List<BookInfo> getBookInfo = BookUserService.getBookInfo();
		mav.addObject("getBookInfo",getBookInfo);
		mav.setViewName("index");
		return mav;	
	}
	
}
