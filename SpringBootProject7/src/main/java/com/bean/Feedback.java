package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback 
{
	@Id
	private int id;
	private String review;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getReview() 
	{
		return review;
	}
	public void setReview(String review) 
	{
		this.review = review;
	}
	@Override
	public String toString()
	{
		return "Feedback [id=" + id + ", review=" + review + "]";
	}
	
	
}
