package com.geekymv.web;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchController {
	
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}

	/**
	 * ajax搜索
	 * @param content 搜索条件
	 */
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public void search(HttpServletResponse response, String content) {
		
	}
	
}
