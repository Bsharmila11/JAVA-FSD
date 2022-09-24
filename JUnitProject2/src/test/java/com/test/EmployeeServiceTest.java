package com.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.service.EmployeeService;
class EmployeeServiceTest {

	@Test
	void testCheckcredentials() {
		//fail("Not yet implemented");
		String s1=null;
		String s2="Raghu";
		assertTrue(4>0);
		assertFalse(5==6);
		assertNull(s1);
		assertNotNull(s2);
		assertSame(s2,s2);
		assertNotSame(s1,s2);
		EmployeeService e=new EmployeeService();
		String result=e.checkcredentials("raghu@gmail.com","Raghu");
		assertEquals("Valid Credentials",result);
		String result2=e.checkcredentials("raghu@gmail.com","Sharmila");
		assertNotEquals("Valid Credentials",result2);
		
	}

}
