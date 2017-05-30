package question01;

/**
* Program to show some commonly used arithmetic expressions.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-29
*/
public class ArraySearch {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		/*
		a) Create an array x of doubles with an initializer list that contains the following values: 8, 4, 5, 21, 7, 9, 18, 2, and 100.
		b) Use an enhanced for loop to compute and print the sum of all the elements of x.
		c) Repeat part b, but use a standard for loop instead of an enhanced for loop
		d) Compute and print the minimum value in x. Your program should find this value by examining each element of the array.
		e) Search the array and retrieve the numbers which are the factors of every other number, the readout should mimic the
			following. Each number is a factor of itself, so do not omit them.
		8.0: 8.0 4.0 2.0
		4.0: 4.0 2.0
		 */
		
		// a)
		double[] nums = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };
		
		// b)
		double sum = 0.0;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		System.out.println(sum);
		
		// c)
		sum = 0.0;
		
		for (int i = 0; i < 9; i++) {
			sum += nums[i];
		}
		
		System.out.println(sum);
		
		// d)
		double min = Double.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min)
				min = nums[i];
		}
		
		System.out.println(min);
		
		// e)
		String output = "";
		
		for (int i = 0; i < nums.length; i++) {
			//output += nums[i] + ": " + nums[i];
			output += nums[i] + ":";
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] % nums[j] == 0)
					output += " " + nums[j];
			}
			output += "\n";
		}
		
		System.out.println(output);
	}
}