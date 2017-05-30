package question02;

/**
* Program to show some commonly used arithmetic expressions.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-29
*/
public class Arrays {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		
		System.out.println("Before rotation: ========================");
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]: " + x[i]);
		}
		
		x = rotate(x, 3);
		
		System.out.println("After rotation: =========================");
		
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]: " + x[i]);
		}
	}
	
	public static double[] rotate(double[] x, int y) {
		double[] newArray = new double[x.length];
		
		for (int i = y; i < x.length; i++) {
			newArray[i - y] = x[i];
		}
		
		for (int i = 0; i < y; i++) {
			newArray[i] = x[i];
		}
		
		return newArray;
	}
}