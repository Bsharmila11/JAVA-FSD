package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bean.Employee;
import com.service.EmployeeService;

class EmployeeServiceTest {

	@Test
	void testCheckUser() {
		//fail("Not yet implemented");
		EmployeeService es=new EmployeeService();
		String result=es.checkUser("raghu@gmail.com","Raghu");
		assertEquals("Success",result);
		
		String result1=es.checkUser("tvraghu@gmail.com","TVRaghu");
		assertEquals("Failure",result1);
	}

	@Test
	@Disabled
	void testGetEmployee() {
		//fail("Not yet implemented");
		EmployeeService es=new EmployeeService();
		Employee emp=es.getEmployee();
		assertNotNull(emp);
		assertEquals(1206,emp.getId());
		assertEquals("Sharmila",emp.getName());
		assertEquals(29000,emp.getSalary());
	}

	@Test
	void testListOfEmployee() {
		//fail("Not yet implemented");
		EmployeeService es=new EmployeeService();
		List<Employee> listOfEmp=es.listOfEmployee();
		assertEquals(2,listOfEmp.size());
	}

	@Test
	void testPassEmployeeObject() {
		//fail("Not yet implemented");
		EmployeeService es=new EmployeeService();
		Employee emp=new Employee();
		emp.setId(1206);
		emp.setName("Sharmila");
		emp.setSalary(29000);
		float updatedSalary=es.passEmployeeObject(emp);
		assertEquals(29500,updatedSalary);
	}

}
