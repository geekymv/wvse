package com.geekymv.domain.service;

import java.util.List;

import com.geekymv.domain.pojo.Event;

public interface EventService {

	public List<Event> list();
	
	public boolean updateTitle(Event event);
	
	
}
