package com.itdragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "pic-upload";
	}
	
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		System.out.println("page : " + page);
		return page;
	}
}
