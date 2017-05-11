package question02;

import java.awt.Rectangle;

public class RectanglePrinter {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0, 0, 100, 50);
		Rectangle r2 = new Rectangle(0, 0, 100, 50);
		
		r2.grow(10, 20);
		
		printRectangle(r1);
		printRectangle(r2);
		
		r2 = r1;
		
		printRectangle(r2);
	}

	private static void printRectangle(Rectangle r) {
		//System.out.println(r);
		double x, y, w, h;
		x = r.getX();
		y = r.getY();
		w = r.getWidth();
		h = r.getHeight();
		
		System.out.println("#===============#");
		System.out.println("arg\tvalue");
		System.out.println("x\t " + x);
		System.out.println("y\t " + y);
		System.out.println("w\t " + w);
		System.out.println("h\t " + h);
	}	
}