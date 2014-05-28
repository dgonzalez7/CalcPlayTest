package gatech.cs6300.assignment1;

public class Calculator implements CalculatorInterface {
	
    private double result;
	
	public void add(double x, double y)
    {
    	result = x + y;
    }

    public void subtract(double x, double y)
    {
    	result = x - y;
    }

    public void multiply(double x, double y)
    {
    	result = x * y;
    }
    
    public void divide(double x, double y)
    {
    	result = x / y;
    }

    public double getResult()
    {
    	return result;
    }
}
