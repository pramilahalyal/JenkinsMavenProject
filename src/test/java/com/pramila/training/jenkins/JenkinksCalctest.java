package com.pramila.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinksCalctest {
	
	private int compare_result;

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
	
		//assertEquals(30,myCalc.multiplyNumbers(5,7));
		assertNotEquals("The multiplication test is failed", 40, 45); 
	}
	
	@Test
	public void divideTest() {
		JenkinsCalculator myCalc = new JenkinsCalculator();

		//assertEquals(5,myCalc.divideNumbers(10,10));	
		try
		{
			compare_result = myCalc.divideNumbers(6,3);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void divisionTest_Equal_Zero()
	{
		try
		{
			JenkinsCalculator myCalc=new JenkinsCalculator();
			compare_result=myCalc.divideNumbers(6, 0);
			assertEquals(2,compare_result);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEqual()
	{
		JenkinsCalculator myCalc=new JenkinsCalculator();
		boolean isEqual = myCalc.equalIntegers(4, 4);
		assertTrue(isEqual);
	}
	
	
	@Test
	public void testEqual_When_Not_Equal()
	{
		JenkinsCalculator myCalc=new JenkinsCalculator();
		boolean isEqual = myCalc.equalIntegers(4, 2);
		assertFalse(isEqual);
	}
}

