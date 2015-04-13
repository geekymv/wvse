package com.geekymv.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geekymv.domain.pojo.Event;
import com.geekymv.domain.service.EventService;

@Controller
public class IndexController {

	@Autowired
	private EventService eventService;
	
	@RequestMapping("/index.do")
	public String index() {
		return "index";
	}
	
	/**
	 * 跳转到listPage页面
	 * @return
	 */
	@RequestMapping("/listPage.do")
	public String list() {
		return "listPage";
	}
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Event> list(Model model) {
		List<Event> events = eventService.list();
		
		return events;
	}
	
	@RequestMapping("/update-title.do")
	@ResponseBody
	public String updateTitle() {
		Event event = new Event();
		event.setId(1L);
		event.setTitle("title111");
		
		boolean res = eventService.updateTitle(event);
		System.out.println(res);
		
		return "success";
	}
}
