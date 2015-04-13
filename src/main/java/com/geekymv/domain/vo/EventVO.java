package com.geekymv.domain.vo;

public class EventVO {
	
	private String tilte;

	
	@Override
	public String toString() {
		return "EventVO [tilte=" + tilte + "]";
	}
	
	public EventVO() {
	}
	public EventVO(String title) {
		this.tilte = title;
	}
	
	public String getTilte() {
		return tilte;
	}
	public void setTilte(String tilte) {
		this.tilte = tilte;
	}
	
}
