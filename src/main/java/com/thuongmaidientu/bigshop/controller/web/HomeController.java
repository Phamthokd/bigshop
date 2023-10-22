package com.thuongmaidientu.bigshop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/web")
public class HomeController {
	@GetMapping(value="/")
	public String home(Model model) {
		model.addAttribute("hi", "hello");
		return "/web/home";
	}
}
