package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Trainer {
	@Id
	private int tid;
	private String tname;
	@OneToOne 
	private Course course; //one trainer one course
	@OneToMany
	@JoinColumn(name="tsid")
	private List<Students> listofStd; //one trainer many students
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Students> getListofStd() {
		return listofStd;
	}
	public void setListofStd(List<Students> listofStd) {
		this.listofStd = listofStd;
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + ", course=" + course + ", listofStd=" + listofStd + "]";
	}
	

}
