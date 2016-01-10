package com.chorBazaar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles2.*;

import com.chorBazaar.dao.ChorBazaarDao;


@Controller
public class HomeController {
	
	@Autowired
	private ChorBazaarDao chorBazaarDao;
	
	@RequestMapping("/home.action")
	public ModelAndView home(){
		chorBazaarDao.getAll();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Home");
		return mav;
	}
	
	@RequestMapping("/login.action")
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Login");
		return mav;
	}
}
