package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private float fees;
	@OneToMany
	@JoinColumn(name="csid") 
	private List<Students> listofStd;
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + ", listofStd=" + listofStd + "]";
	}
	public List<Students> getListofStd() {
		return listofStd;
	}
	public void setListofStd(List<Students> listofStd) {
		this.listofStd = listofStd;
	}
	@OneToMany
	@JoinColumn(name="csid")
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	
	
	
}
