/**
 * Program to output a run in parenthesis </br>
 * Run: sequence of adjacent repeated values <br/>
 * Twenty random numbers are generated simulating a die toss</br>
 * The output should be all the numbers with the runs in ()<br/>
 * 
 * @author Joao Berardo
 * @since 19, June 2017
 * @version 1.0
 *
 */
public class RunChecker {
	/**
	 * Main method 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// total numbers to display
		final int TOTAL_NUMS = 20;
		// new die object
		Die die = new Die();
		// array to store values from 'TOTAL_NUMS' numbers
		int numbers[] = new int[TOTAL_NUMS];
		// is the string in the run?
		// true: enclose with ()
		// false: do nothing
		boolean inRun = false;

		// loop thought array populating each value with the roll result
		for (int i = 0; i < TOTAL_NUMS; i++)
		{
			numbers[i] = die.roll();
		}
		
		// if in run, use parenthesis
		for (int i = 0; i < TOTAL_NUMS; i++)
		{
			if (inRun)
			{
				if (i < TOTAL_NUMS - 1)
				{
					if (numbers[i] != numbers[i - 1])
					{
						System.out.printf(")");
						inRun = false;
					}
				}
			}
			// if is not in run, and still inside array
			else
			{
				if (i < TOTAL_NUMS - 1)
				{
					// if both are the same, initialize run
					if (numbers[i] == numbers[i + 1])
					{
						System.out.printf("(");
						inRun = true;
					}					
				}
			}
			// print current number
			System.out.printf(" %d ", numbers[i]);
		}
		// if it's still in run and its the last number, close parenthesis
		if (inRun)
		{
			System.out.printf(")");			
		}
	}
}