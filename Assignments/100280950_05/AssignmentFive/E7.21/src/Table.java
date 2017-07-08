/**
 * Table class<br/>
 * This class uses 3-d arrays to represent a table</br>
 * We can get the sum of the ith row or column<br/>
 * 
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since June 18, 2017
 *
 */
public class Table {
	// array representing the table
	private int[][] values;
	// if horizontal, get sum of ith row
	// else, get sum of ith column
	private boolean isHorizontal;

	/**
	 * Creates a table with rows and columns<br/>
	 * If <i>horizontal</i> is true, the sum is calculated for rows<br/>
	 * if it is false, the sum if for columns<br/>
	 * 
	 * @param rows number of rows
	 * @param columns number of columns
	 * @param horizontal true for sum of rows, false for sum of columns
	 */
	public Table(int rows, int columns, boolean horizontal)
	{
		values = new int[rows][columns];
		this.isHorizontal = horizontal;
	}
	
	/**
	 * Inserts the value <i>n</i> in row <i>i</i> and column <i>j</i> 
	 * @param i row number
	 * @param j column number
	 * @param n value to be inserted
	 */
	public void set(int i, int j, int n)
	{
		values[i][j] = n;
	}

	/**
	 * Returns the sum of the i'th row (horizontai=true)
	 * of column (horizontal=false)
	 * @param i index of the row or column
	 * @param horizontal return the sum of row (true) or column (false)
	 * @return the sum for the i'th index (row or column)
	 */
	public double sum(int i, boolean horizontal)
	{
		double total = 0;

		// if true, sum rows
		if (horizontal)
		{
			// sum of rows
			for (int row  = 0; row < values.length; row++)
			{
				total += this.values[i][row];
			}
		}
		// false, sum cols
		else
		{
			// sum of columns
			for (int col = 0; col < values[0].length; col++)
			{
				total += this.values[col][i];
			}
		}
		return total;
	}
	
	/**
	 * Returns the maximum value in a determined row or column
	 * @param index index of the row or column
	 * @return maximum value in a row or column
	 */
	public double getMaxBar(double index)
	{
		double maxNum;
		
		// get maximum value of row 'index'
		if (this.isHorizontal)
		{
			maxNum = 0;
			
			// loop rows
			for (int i = 0; i < values.length; i++)
			{
				double rowSum = this.sum(i, true);
				
				if (rowSum > maxNum)
				{
					maxNum = rowSum;
				}
			}			
		}
		// get maximum value of col 'index'
		else
		{
			maxNum = 0;
			
			// loop cols
			for (int i = 0; i < values[0].length; i++)
			{
				double colSum = this.sum(i, true);
				
				if (colSum > maxNum)
				{
					maxNum = colSum;
				}
			}			
		}
		return maxNum;
	}
	
	/**
	 * Returns true if calculating the sum of rows<br/>
	 * false otherwise
	 * @return true (sum of rows) or false (sum of cols)
	 */
	public boolean isHorizontal() {
		return isHorizontal;
	}

	/**
	 * Change the method for calculating the sum<br/> 
	 * @param isHorizontal new value to be changed
	 */
	public void setHorizontal(boolean isHorizontal) {
		this.isHorizontal = isHorizontal;
	}
}