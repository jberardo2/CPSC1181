package question02;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author Joao Berardo
 * @since 1.0, July, 04 2017
 *
 */
public class RectangleComparatorTest {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		class RectangleComparator implements Comparator<Rectangle>
		{

			/**
			 * Compares two Rectangle objects.
			 * @param r1 the first rectangle
			 * @param r2 the second rectangle
			 * @return 1 if the area of the first rectangle is larger than the area of
			 * the second rectangle, -1 if the area of the first rectangle is
			 * smaller than the area of the second rectangle or 0 if the two
			 * rectangles have the same area
			*/
			public int compare(Rectangle r1, Rectangle r2)
			{
				if (getArea(r1) < getArea(r2))
				{
					return -1;
				}
				
				if (getArea(r1) > getArea(r2))
				{
					return 1;
				}
				
				return 0;
			}
		}
		
		RectangleComparator comp = new RectangleComparator();
		Rectangle rect1 = new Rectangle(5, 10, 20, 30);
		Rectangle rect2 = new Rectangle(10, 20, 30, 15);
		Rectangle rect3 = new Rectangle(20, 30, 45, 10);
		
		ArrayList<Rectangle> list = new ArrayList<Rectangle>();
		list.add(rect1);
		list.add(rect2);
		list.add(rect3);
		
		// Call the library sort method
		Collections.sort(list, comp);
		
		System.out.println("----- Rectangles sorted by area -----");
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("\nRectangle #" + (i + 1));
			System.out.println("Width: " + list.get(i).width);
			System.out.println("Height: " + list.get(i).height);
			System.out.println("Area: " + (getArea(list.get(i))));
		}
	}
	
	private static double getArea(Rectangle r)
	{
		return r.getWidth() * r.getHeight();
	}
}