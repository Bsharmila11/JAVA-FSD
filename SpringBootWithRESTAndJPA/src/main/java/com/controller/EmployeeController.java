package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@RequestMapping(value="employee",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeInfo()
	{
		Employee emp1=new Employee(1,"Sharmila",29000);
		return emp1;
	}
	
	@RequestMapping(value="employees",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeDetails()
	{
		List<Employee> listOfEmployee=new ArrayList<Employee>();
		listOfEmployee.add(new Employee(1,"Sharmila",29000));
		listOfEmployee.add(new Employee(2,"Sharmila",19000));
		return listOfEmployee;
	}
	
	@RequestMapping(value="employeesFromDb",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeDetailsFromDb(){
		return employeeService.getAllEmployee();
		
	}
	
	
	@RequestMapping(value="findEmployeeById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee findEmployeeById(@PathVariable("id") int id){
		return employeeService.findEmployeeById(id);
		
	}
	
	@RequestMapping(value="findEmployeeByIdwithQueryParam",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee findEmployeeByIdUsingQueryParam(@RequestParam("id") int id){
		return employeeService.findEmployeeById(id);
		
	}
	
	@RequestMapping(value="storeEmployee",consumes=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST)
	public String storeEmployee(@RequestBody Employee emp) {
		return employeeService.storeEmployee(emp);
	}
	
	@RequestMapping(value="deleteEmployee/{id}",method=RequestMethod.DELETE)
	public String deleteEmployeeDetails(@PathVariable("id") int id){
		return employeeService.deleteEmployee(id);
		
	}
	
	@RequestMapping(value="updateEmployee",consumes=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.PATCH)
	public String updateEmployee(@RequestBody Employee emp){
		return employeeService.updateEmployee(emp);
		
	}
		
		
	}
	
	

