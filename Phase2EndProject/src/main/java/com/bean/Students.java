package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Students 
{
	@Id
	private int sid;
	private String sname;
	private int age;
	private Integer tsid;
	
	@OneToOne 
	private Classes classes;

	public int getSid() 
	{
		return sid;
	}

	public void setSid(int sid) 
	{
		this.sid = sid;
	}

	public String getSname() 
	{
		return sname;
	}

	public void setSname(String sname) 
	{
		this.sname = sname;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public Integer getTsid() 
	{
		return tsid;
	}

	public void setTsid(Integer tsid) 
	{
		this.tsid = tsid;
	}

	public Classes getClasses() 
	{
		return classes;
	}

	public void setClasses(Classes classes) 
	{
		this.classes = classes;
	}

	@Override
	public String toString() 
	{
		return "Students [sid=" + sid + ", sname=" + sname + ", age=" + age + ", tsid=" + tsid + ", classes=" + classes
				+ "]";
	}

	
	
	

}