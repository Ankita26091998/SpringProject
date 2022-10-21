package com.spring.core.entity;

public class Learner {

	private int lid;
	private String lname;
	public Learner(int lid, String lname) {
		super();
		this.lid = lid;
		this.lname = lname;
	}
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Learner [lid=" + lid + ", lname=" + lname + "]";
	}
	
}
