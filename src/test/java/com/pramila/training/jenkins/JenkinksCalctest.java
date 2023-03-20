package com.pramila.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinksCalctest {

	@Test
	public void addTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10,myCalc.addNumbers(5, 5));	
	}

	@Test
	public void subtractTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5,myCalc.subtractNumbers(10, 5));	
	}
	
	@Test
	public void multiplyTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		myCalc = "This is a string";
		//assertEquals(30,myCalc.multiplyNumbers(5,7));
		assertNotEquals("The multiplication test is failed", 40, 45); 
	}
	
	@Test
	public void divideTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		myCalc = 10;
		//assertEquals(5,myCalc.divideNumbers(10,10));	
		assertFalse("The division test is failed", false);
	}
	
}
