/**
  Program to test the MonthNames class

  @author Joao Berardo
  @version 1.0
  @since June, 04 2017
*/
public class TestMonthNames
{
	/**
	  Main method
	  @param args Not used
	*/
	public static void main(String[] args)
	{
		// create some objects to test
		MonthNames names = new MonthNames();
		MonthNames names2 = new MonthNames("March");
		MonthNames names3 = new MonthNames(4);
		String monthName = "";
		
		// test first constructor and some methods
		System.out.println("----- Constructor with no arguments -----");
		// test if the constructor with no arguments set the default value to January and 1
		System.out.println("Output: " + names.getMonthName());
		System.out.println("Expected: January");
		System.out.println("Output: " + names.getMonthNumber());
		System.out.println("Expected: 1\n");

		// change some values
		names.setMonthName("June");
		names.setMonthNumber(12);
		
		// print the modified object
		System.out.println("Output: " + names.getMonthName());
		System.out.println("Expected: December");
		System.out.println("Output: " + names.getMonthNumber());
		System.out.println("Expected: 12\n");
		
		// test second constructor and some methods
		
		// set month to july (7)
		names2.setMonthName("July");
		// check methods
		String name2 = names2.getMonthName();
		int num2 = names2.getMonthNumber();
		
		// print output
		System.out.println("----- Constructor with argument @name -----");
		System.out.println("Output: " + name2);
		System.out.println("Expected: July");
		
		System.out.println("Output: " + num2);
		System.out.println("Expected: 7\n");
		
		// test third constructor and some methods
		System.out.println("----- Constructor with argument @number -----");
		// test without changing any value first
		System.out.println("Output: " + names3.getMonthName());
		System.out.println("Expected: April");
		System.out.println("Output: " + names3.getMonthNumber());
		System.out.println("Expected: 4\n");
		
		
		// change some values and print the result
		names3.setMonthName("August");
		System.out.println("Output: " + names3.getMonthName());
		System.out.println("Expected: August");
		
		System.out.println("Output: " + names3.getMonthNumber());
		System.out.println("Expected: 8\n");
		
		// change one more time and check the output
		names3.setMonthNumber(11);
		System.out.println("Output: " + names3.getMonthName());
		System.out.println("Expected: November");
		
		System.out.println("Output: " + names3.getMonthNumber());
		System.out.println("Expected: 11\n");
	}
}