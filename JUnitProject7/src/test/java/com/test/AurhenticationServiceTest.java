package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.AurhenticationService;


class AurhenticationServiceTest {

	@Test
	void testAuthenticateUser() {
		//fail("Not yet implemented");
		AurhenticationService as=new AurhenticationService();
		
		String result1=as.authenticateUser("raghu@gmail.com", "Raghu", "S02ASH10");
		assertEquals("Congratulations You are Valid User",result1);
		
		String result5=as.authenticateUser("sharmila@gmail.com", "Raghu", "S02ASH10");
		assertEquals("Verification Failed You are not a Valid User",result5);
		
		String result6=as.authenticateUser("raghu@gmail.com", "Sharmila", "S02ASH10");
		assertEquals("Verification Failed You are not a Valid User",result6);
		
		String result7=as.authenticateUser("raghu@gmail.com", "Raghu", "1206");
		assertEquals("Verification Failed You are not a Valid User",result7);
				
	}

}
