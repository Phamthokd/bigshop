package com.thuongmaidientu.bigshop.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AccountController {
	@GetMapping(value="/my-account")
	public String myaccount(HttpServletRequest request) {
		request.setAttribute("smg", "success");
		return "/web/my-account";
	}
}
