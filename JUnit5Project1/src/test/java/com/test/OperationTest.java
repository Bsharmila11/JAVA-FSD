package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.service.Operation;

class OperationTest {

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		Operation op=new Operation();
		int result=op.add(100, 200);
		assertEquals(300,result);
	}
	
	@Test
	void testSub() {
		//fail("Not yet implemented");
		Operation op=new Operation();
		int result=op.sub(300, 200);
		assertEquals(100,result);
	}
	
	@Test
	void testMul() {
		//fail("Not yet implemented");
		Operation op=new Operation();
		int result=op.mul(100, 2);
		assertEquals(200,result);
	}
	
	@Test
	void testDiv() {
		//fail("Not yet implemented");
		Operation op=new Operation();
		int result=op.div(400, 200);
		assertEquals(2,result);
	}

}
