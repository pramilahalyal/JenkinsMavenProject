package com.pramila.training.jenkins;

public class JenkinsCalculator {

	//Method to add 2 numbers
	
	public int addNumbers(int numOne,int numTwo) {
		
		int var1=20;
		System.out.println("this is a sample test");
		return numOne+numTwo;
	}
	
	//Method to subtract 2 numbers
	
		public int subtractNumbers(int numOne,int numTwo) {
			
			return numOne-numTwo;
		}
		
	//Method to multiply 2 numbers
		
		public int multiplyNumbers(int numOne,int numTwo) {
			

			return numOne*numTwo;
		}
		
	//Method to divide 2 numbers
		
		public int divideNumbers(int numOne,int numTwo) throws Exception {
			
			if (numTwo==0)
			{
				throw new Exception("Denominator cannot be 0");
			}
			return numOne/numTwo;
			
		}
		
		public boolean equalIntegers(int numOne,int numTwo)
		{
			boolean compare_result = false;
			if(numOne==numTwo)
			{
				compare_result = true;
			}
			return compare_result;
		}
}
