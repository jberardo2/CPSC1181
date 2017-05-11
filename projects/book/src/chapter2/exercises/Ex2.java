/*
 * Write a PerimeterTester program that constructs a Rectangle object and then com­
 * putes and prints its perimeter. Use the getWidth and getHeight methods. Also print the
 * expected answer
 */

package chapter2.exercises;

public class Ex2 {

	public static void main(String[] args) {
		double perimeter = 0;
		
		PerimeterTester tester = new PerimeterTester(2, 5);
		perimeter = tester.getPerimeter();
		
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Expected: 14.0");
	}
}
