package com.geekymv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.geekymv.base.HibernateDao;
import com.geekymv.domain.pojo.Event;
import com.geekymv.domain.vo.EventVO;

@Repository
@SuppressWarnings("unchecked")
public class EventDao extends HibernateDao {

	public void save(Event event) {
		this.getSession().save(event);
	}
 
	public void query(Long id) {
		String hql = "select new com.geekymv.domain.vo.EventVO(title) from Event e where e.id = :id";
		EventVO eventVO = (EventVO) this.getSession() //
				.createQuery(hql) //
				.setLong("id", id) //
				.uniqueResult(); //

		System.out.println(eventVO);
	}

	public int updateTitle(Event event) {
		String hql = "update Event set title =:title where id =:id";
		int number = this.getSession().createQuery(hql)
						.setString("title", event.getTitle())
						.setLong("id", event.getId())
						.executeUpdate();
		return number;
	}
	
	public List<Event> list() {
		String hql = "from Event";
		List<Event> events = this.getSession().createQuery(hql).list();
		
		return events;
	}

}
