package com.geekymv.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.geekymv.dao.EventDao;
import com.geekymv.domain.pojo.Event;

public class MyTest extends BaseTest {
	
	@Autowired
	private EventDao eventDao;
	
	@Test
	public void saveTest() {
		Event event = new Event();
		event.setTitle("tite4");
		event.setDate(new Date());
		
		eventDao.save(event);
	}

	@Test
	public void testHQL() {
		eventDao.query(3L);
	}

}
