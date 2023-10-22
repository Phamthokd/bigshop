package com.thuongmaidientu.bigshop.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProductDetailsController {
	@GetMapping(value="/product-details")
	public String productdetails(HttpServletRequest request) {
		request.setAttribute("smg", "success");
		return "/web/product-details";
	}
}
