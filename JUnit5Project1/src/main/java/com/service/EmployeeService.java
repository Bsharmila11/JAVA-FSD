package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;


public class EmployeeService 
{
public String checkUser(String emailId,String password) {
	if(emailId.equals("raghu@gmail.com") && password.equals("Raghu"))
	{
		return "Success";
	}
	else
	{
		return "Failure";
	}
}

public Employee getEmployee() {
	Employee emp=new Employee();
	emp.setId(1206);
	emp.setName("Sharmila");
	emp.setSalary(29000);
	return emp;
}

public List<Employee> listOfEmployee(){
	List<Employee> listOfEmp = new ArrayList<Employee>();
	Employee emp1=new Employee();
	emp1.setId(1209);
	emp1.setName("Lekha");
	emp1.setSalary(29000);
	
	Employee emp2=new Employee();
	emp2.setId(1202);
	emp1.setName("Valli");
	emp1.setSalary(29000);
	
	listOfEmp.add(emp1);
	listOfEmp.add(emp2);
	return listOfEmp;
	
	
}

public float passEmployeeObject(Employee emp) {
	return emp.getSalary()+500;
}
}
