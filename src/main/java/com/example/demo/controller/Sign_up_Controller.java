package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.UserService;

/**
 * ユーザー情報 Controller
 */
@Controller
public class Sign_up_Controller {
	
	/**
	 * ユーザー情報 Service
	 */
	@Autowired
	UserService userService;
	
	/**
	 * ユーザー情報一覧画面を表示
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@RequestMapping(value = "/user/001-02_Sign_up", method = RequestMethod.GET)	
	public String displayList(Model model) {
		/*
		 * List<User> userlist = userService.searchAll();
		 * model.addAttribute("001-02_Sign_up", userlist);
		 */
	  	return "user/001-02_Sign_up";
	}
}
