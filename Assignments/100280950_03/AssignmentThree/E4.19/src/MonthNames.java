/**
  Class to convert month name/number<br>
  You can either create an object with the month name or number<br>
  After the object creation, just call the methods getMonthName() and getMonthNumber()<br>
  To change the month name or number, use the methods setMonthName(String name) and setMonthNunber(int num)

  @author Joao Berardo
  @version 1.0
  @since June, 04, 2017
 */
public class MonthNames
{
	// instance variables
	private String monthName;
	private int monthNumber;

	/**
	  Constructor with no arguments<br>
	  Default value is set to January (1)
	*/
	public MonthNames() 
	{
		this.monthNumber = 1;
		this.monthName = this.getMonthName();
	}
	
	/**
	  Constructs an object with month name
	  @param name Month name
	 */
	public MonthNames(String name)
	{
		monthName = name;
		this.monthNumber = this.getMonthNumber();
	}
	
	/**
	  Constructs an object with month number
	  @param number Month number
	*/
	public MonthNames(int number)
	{
		monthNumber = number;
		this.monthName = this.getMonthName();
	}
	
	/**
	  Method that transforms month number into month name and returns the month name
	  @return month name
	*/
	public String getMonthName()
	{
		switch(this.monthNumber)
		{
			case 1:
				this.monthName = "January";
				break;
			case 2:
				this.monthName = "February";
				break;
			case 3:
				this.monthName = "March";
				break;
			case 4:
				this.monthName = "April";
				break;
			case 5:
				this.monthName = "May";
				break;
			case 6:
				this.monthName = "June";
				break;
			case 7:
				this.monthName = "July";
				break;
			case 8:
				this.monthName = "August";
				break;
			case 9:
				this.monthName = "September";
				break;
			case 10:
				this.monthName = "October";
				break;
			case 11:
				this.monthName = "November";
				break;
			case 12:
				this.monthName = "December";
				break;
			default:
				this.monthName = "N/A";
				break;
		}

		return this.monthName;
	}
	
	/**
	  Method that transforms month name into month number and returns the month number
	  @return month number
	*/
	public int getMonthNumber()
	{
		switch(this.monthName)
		{
		case "January":
			this.monthNumber = 1;
			break;
		case "February":
			this.monthNumber = 2;
			break;
		case "March":
			this.monthNumber = 3;
			break;
		case "April":
			this.monthNumber = 4;
			break;
		case "May":
			this.monthNumber = 5;
			break;
		case "June":
			this.monthNumber = 6;
			break;
		case "July":
			this.monthNumber = 7;
			break;
		case "August":
			this.monthNumber = 8;
			break;
		case "September":
			this.monthNumber = 9;
			break;
		case "October":
			this.monthNumber = 10;
			break;
		case "November":
			this.monthNumber = 11;
			break;
		case "December":
			this.monthNumber = 12;
			break;
		default:
			break;
		
		}

		return this.monthNumber;
	}
	
	/**
	  Method to set the month name
      @param name month name
	*/
	public void setMonthName(String name)
	{
		this.monthName = name;
		this.monthNumber = this.getMonthNumber();
	}
	
	/**
	  Method to set the month number
	  @param num month number
	*/
	public void setMonthNumber(int num)
	{
		this.monthNumber = num;
		this.monthName = this.getMonthName();
	}
}