package question01;

/**
* Program to show some commonly used arithmetic expressions.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-29
*/
public class ArrayBasics {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		/*
		a) Create an array x of doubles with an initializer list that contains the following values: 8, 4, 5, 21, 7, 9, 18, 2, and 100.
		b) Print the number of items in the array using the expression x.length.
		c) Print the first element of the array, x[0].
		d) Print the last element of the array. Be careful to choose the right index.
		e) Print the expression x[x.length – 1]. Is this value the same as in part d? Why?
		f) Use a standard for loop to print all the elements of the array without labels.
		g) Use a standard for loop to print all the elements of the array with labels to indicate what each element is.
		h) Use a standard for loop to print all the elements of the array in reverse order with labels to indicate what each element is.
		i) Use an enhanced for loop to print all the values in the array without labels.
		*/
		
		// a)
		Double[] nums = { 8.0, 4.0, 5.0, 21.0, 9.0, 18.0, 2.0, 100.0 };
		
		// b)
		System.out.println(nums.length);
		
		// c)
		System.out.println(nums[0]);
		
		// d)
		System.out.println(nums[7]);
		
		// e)
		System.out.println(nums[nums.length - 1]);
		
		// f)
		for (int i = 0; i < 7; i++) {
			System.out.print(nums[i] + ", ");
		}
		
		System.out.println();
		
		// g)
		for (int i = 0; i < 7; i++) {
			System.out.print("[" + i + "]" + ": " + nums[i] + ", ");
		}
		
		System.out.println();
		
		// h)
		for (int i = 7; i > 0; i--) {
			System.out.print("[" + i + "]" + ": " + nums[i] + ", ");
		}
		
		System.out.println();
		
		// i)
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}
}