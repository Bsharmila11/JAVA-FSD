package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee 
{
	@Value(value="1206")
	private int id;
	@Value(value="Sharmila")
	private String name;
	@Value(value="29000")
	private float salary;
	@Autowired
	private Address add;
	public int getId() {
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public float getSalary() 
	{
		return salary;
	}
	public void setSalary(float salary) 
	{
		this.salary = salary;
	}
	public Address getAdd() 
	{
		return add;
	}
	public void setAdd(Address add) 
	{
		this.add = add;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	
	
}
