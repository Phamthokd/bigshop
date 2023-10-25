package com.thuongmaidientu.bigshop.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/web")
public class LoginController {
	@GetMapping(value = "/login")
	public String login() {
		return("/web/login");
	}

}
