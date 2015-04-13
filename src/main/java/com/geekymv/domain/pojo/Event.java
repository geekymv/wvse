package com.geekymv.domain.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EVENTS")
public class Event {
	private Long id;
	private String title;
	private Date date;
	
	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", date=" + date + "]";
	}
	
	public Event() {
	}
	public Event(Long id, String title) {
		this.id = id;
		this.title = title;
	}
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="event_date")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
