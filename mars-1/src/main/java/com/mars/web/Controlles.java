package com.mars.web;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlles {

	/*
	 * @RequestMapping(value = "home") public String homepage(HttpServletRequest
	 * req, String name, HttpSession session) { req.getSession();
	 * req.getParameter("name"); session.setAttribute("name", name);
	 * System.out.println("Hi " + name);
	 * 
	 * return "home"; }
	 */

	@RequestMapping(value = "hi")
	public ModelAndView view(@RequestParam("home") String home, Alien alien) {

		alien.setAlienID(123456);
		alien.setAlienLang("Hammer");
		alien.setAlienLang("avvc");
		System.out.println("here eeeeeeeeeeeeeeeeeeee " + home);
		ModelAndView mv = new ModelAndView();

		mv.addObject("alien", alien);
		System.out.println("here --------------------");
		mv.setViewName("home");
		return mv;
	}

	
	@RequestMapping(value = "login")
	public String loginPage() {
    
	MyLogger.DEBUG_STATUS.debug("Hi Logger is working here ----");
		return "login";
	}

	@RequestMapping(value = "/Userlogin")
	public String loginUser(Users users, Model map) {

		map.addAttribute("user", users.getUserID());
		MyLogger.DEBUG_STATUS.debug("Hi Logger is working here ----");
		String uname = users.getUserID();
		String pwd = users.getUserPwd();
		
		String profile = null;
		if (uname.equals("user123") && pwd.equals("12345")) {
			MyLogger.DEBUG_STATUS.debug("user authenticated  ----");
			profile = "home";

		} else {

			profile = "userNot";
		}

		return profile;
	}

}
