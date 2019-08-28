package com.mars.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlles {

	@RequestMapping(value = "home")
	public String homepage(HttpServletRequest req, String name, HttpSession session) {
		req.getSession();
		req.getParameter("name");
		session.setAttribute("name", name);
		System.out.println("Hi " + name);

		return "home";
	}

	@RequestMapping(value = "test")
	public String testHtml() {

		System.out.println("test method ");
		return "test";
	}

}
