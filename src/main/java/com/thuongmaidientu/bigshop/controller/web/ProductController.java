package com.thuongmaidientu.bigshop.controller.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ProductController {
	@GetMapping(value="/shop-fullwidth-list")
	public String shopfullwidthlist(HttpServletRequest request) {
		request.setAttribute("smg", "success");
		return "/web/shop-fullwidth-list";
	}
}
