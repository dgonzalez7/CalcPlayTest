package gatech.cs6300.assignment1;

public class PlayTestAssignment2 {
	
	public static void main(String[] args) 
	{
		System.out.println("Play Test Assignment 2\n");
		
		double x;
		double y;
		double result;
						
		// ADD
		System.out.println("Addition");
		x = 10;
		y = 5;
		testAdd(x, y);
		
		x = (double) Double.MAX_VALUE;
		y = (double) Double.MAX_VALUE;
		testAdd(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = (double) Double.MIN_VALUE;
		testAdd(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = (double) Double.MAX_VALUE;
		testAdd(x, y);
		
		// SUBTRACT
		System.out.println("\nSubtraction");
		x = 10;
		y = 5;
		testSubtract(x, y);
		
		x = (double) Double.MAX_VALUE;
		y = (double) Double.MAX_VALUE;
		testSubtract(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = (double) Double.MIN_VALUE;
		testSubtract(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = (double) Double.MAX_VALUE;
		testSubtract(x, y);
		
		// MULTIPLY
		System.out.println("\nMultiplication");
		x = 10;
		y = 5;
		testMultiply(x, y);
		
		x = (double) Double.MAX_VALUE;
		y = (double) Double.MAX_VALUE;
		testMultiply(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = (double) Double.MIN_VALUE;
		testMultiply(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = (double) Double.MAX_VALUE;
		testMultiply(x, y);
		
		// DIVIDE
		System.out.println("\nDivision");
		x = 10;
		y = 5;
		testDivide(x, y);
		
		x = (double) Double.MAX_VALUE;
		y = (double) Double.MAX_VALUE;
		testDivide(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = (double) Double.MIN_VALUE;
		testDivide(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = (double) Double.MAX_VALUE;
		testDivide(x, y);
		
		x = (double) Double.MIN_VALUE;
		y = 0;
		testDivide(x, y);
	}
	
	public static void testAdd(double x, double y)
	{
		double result;
		
		Calculator myCalc = new Calculator();
		myCalc.add(x, y);
		result = myCalc.getResult();
		System.out.println(result);		
	}
	
	public static void testSubtract(double x, double y)
	{
		double result;
		
		Calculator myCalc = new Calculator();
		myCalc.subtract(x, y);
		result = myCalc.getResult();
		System.out.println(result);		
	}
	
	
	public static void testMultiply(double x, double y)
	{
		double result;
		
		Calculator myCalc = new Calculator();
		myCalc.multiply(x, y);
		result = myCalc.getResult();
		System.out.println(result);		
	}
	
	
	public static void testDivide(double x, double y)
	{
		double result;
		
		Calculator myCalc = new Calculator();
		myCalc.divide(x, y);
		result = myCalc.getResult();
		System.out.println(result);		
	}

}
