/*
 * Write a program that constructs a rectangle with area 42 and a rectangle with
 * perimeter 42. Print the widths and heights of both rectangles.
 */

package chapter2.exercises;

import java.awt.Rectangle;

public class Ex4 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(0, 0, 6, 7);
		double area = rec.getWidth() * rec.getHeight();
		
		Rectangle rec2 = new Rectangle(0, 0, 10, 11);
		double perimeter = (rec2.getWidth() * 2) + (rec2.getHeight() * 2);
		
		System.out.println("First Rectangle");
		System.out.println("Width: " + rec.getWidth());
		System.out.println("Height: " + rec.getHeight());
		System.out.println("Area: " + area);
		
		System.out.println();
		
		System.out.println("Second Rectangle");
		System.out.println("Width: " + rec.getWidth());
		System.out.println("Height: " + rec.getHeight());
		System.out.println("Perimeter: " + perimeter);
	}
}
