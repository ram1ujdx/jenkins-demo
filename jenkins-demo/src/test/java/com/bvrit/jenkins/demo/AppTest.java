package com.bvrit.jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@Test
	public void test1() {
		assertEquals(10, 10);
	}
	
	@Test
	public void test2() {
		assertThrows(ArithmeticException.class, ()->{int x=5/0;});
	}
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   
    /**
     * @return the suite of tests being tested
     */
    
}
