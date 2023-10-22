package com.thuongmaidientu.bigshop.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(value="/")
	public String home(HttpServletRequest request,Model model) {
		request.setAttribute("smg", "success");
		String P = "hello";
		model.addAttribute("hi", P);
		return "/web/home";
	}
}
