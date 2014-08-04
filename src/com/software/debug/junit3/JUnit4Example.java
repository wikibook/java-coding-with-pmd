package com.software.debug.junit3;

import org.junit.Before;
import org.junit.Test;

public class JUnit4Example {
	
	private IDGenerator generator;

	@Before
	public void setUp() throws Exception {
		generator = new IDGenerator(0);
	}

	@Test
	public void generateId() {
		System.out.println(generator.getNewId()); 
	}
	
	@Test
	public void generateId2() {
		System.out.println(generator.getNewId()); 
	}

}
