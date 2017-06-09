/**
 * <h3>Roman Numbers Class</h3>
 * <br/>
 * 
 * This class converts a positive integer into the Roman number system
 *
 * Rules:
 * 	Positive number
 * 	Numbers up to 3,999
 * 	Thousands, hundreds, tens, and ones are expressed separately
 * 	The numbers 1 to 9 are expressed as: I, II, III, IV, V, VI, VII, VIII, IX
 * 	I preceding a V or X is subtracted from the value
 * 	Never have more than three I’s in a row
 * 	Tens and hundreds are done the same way (different letters)
 * 
 * Roman number system digits:
 * I	1
 * V	5
 * X	10
 * L	50
 * C	100
 * D	500
 * M	1,000
 * 
 * @author Joao Berardo
 * @since June, 09 2017
 * @version 1.0
 *
 */
public class RomanNumber {
	private int decimalNumber;
	private String romanNumber;
	
	/**
	 * Creates an object with the decimal number passed as argument
	 * @param number Decimal number to be converted to Roman Number
	 */
	public RomanNumber(int number)
	{
		this.decimalNumber = number;
		this.romanNumber = "";

		convertNumber();
	}
	
	/**
	 * Returns the decimal number
	 * @return number in decimal system
	 */
	public int getDecimalNumber()
	{
		return decimalNumber;
	}
	
	/**
	 * Returns the Roman number
	 * @return number in roman number system
	 */
	public String getRomanNumner()
	{
		return this.romanNumber;
	}
	
	/**
	 * Convert a decimal number to Roman number 
	 */
	private void convertNumber()
	{
		int temp = 0;
		
		// get the thousands
		// if number < 1000, temp is 0, between 1000-1999, temp is 1, etc.
		temp = this.decimalNumber / 1000;
		
		// if number is > 1000
		if (temp > 0)
		{
			// add M to each thousand (temp can be 0, 1, 2 or 3)
			for (int i = 1; i <= temp; i++)
			{
				this.romanNumber += "M".trim();
			}
		}
		
		//this.romanNumber = "XII";
	}
}