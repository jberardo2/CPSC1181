package test;

public class Tests {

	public static void main(String[] args)
	{
//		double diameter = 5;
//		// MAGIC NUMBER! USE CONSTANTS FOR PI
//		double circumference = 3.14 * diameter;
//		System.out.println(circumference);
		
//		// When does the cast (long) x yield a
//		// different result from the call Math.round(x)?
//		double a = 5.50000001;
//		System.out.println(Math.round(a));
//		System.out.println((long)a);
		
		String s = "Agent";
		s = s + s.length();
		print(s);
		
		String river = "Mississipi ";
		print(river.substring(1,2));
		print(river.substring(2, river.length() - 3));
	}
	
	private static void print(String value)
	{
		System.out.println(value);
	}
	
	private static void print(int value)
	{
		System.out.println(value);
	}
	
	private static void print(double value)
	{
		System.out.println(value);
	}
}