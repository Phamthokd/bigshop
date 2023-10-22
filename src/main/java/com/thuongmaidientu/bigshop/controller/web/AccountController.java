package com.thuongmaidientu.bigshop.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value="/web")
public class AccountController {
	@GetMapping(value="/my-account")
	public String myAccount(HttpServletRequest request) {
		request.setAttribute("smg", "success");
		return "/web/my-account";
	}
}
