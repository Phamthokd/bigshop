package com.thuongmaidientu.bigshop.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
	@GetMapping(value="/cart")
	public String cart(HttpServletRequest request) {
		request.setAttribute("smg", "success");
		return "/web/cart";
	}
}
