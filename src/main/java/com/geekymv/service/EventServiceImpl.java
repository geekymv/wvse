package com.geekymv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekymv.dao.EventDao;
import com.geekymv.domain.pojo.Event;
import com.geekymv.domain.service.EventService;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventDao eventDao;
	
	public List<Event> list() {
		return eventDao.list();
	}

	public boolean updateTitle(Event event) {
		if(event == null) {
			return false;
		}
		
		return eventDao.updateTitle(event) == 1 ? true : false;
	} 
}
