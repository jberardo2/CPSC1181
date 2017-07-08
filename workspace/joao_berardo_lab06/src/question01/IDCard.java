package question01;

import java.util.Objects;

/**
 * Create an ID card with name and ID number
 * 
 * @author Joao Berardo
 * @since 1.0, July, 01 2017
 */
public class IDCard extends Card {
	private String idNumber;

	/**
	 * Constructs an ID Card
	 * @param newName card holder's name
	 * @param newId card holder's ID number
	 */
	public IDCard(String newName, String newId)
	{
		super(newName);		
		this.idNumber = newId;
	}
	
	/**
	 * Retrieves the card holder's ID number
	 * @return card holder's ID number
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * Sets the card holder's ID number
	 * @param idNumber card holder's ID number
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * Format description of the card details
	 * @return formatted descrition of the card details
	 */
	public String format()
	{
		return "IDCard [Name=" + this.getName()  + ",IdNumber=" + this.idNumber + "]";
	}
	
	/**
	 * Format description of the card details
	 * @return formatted descrition of the card details
	 */
	public String toString()
	{
		return this.format();
	}
	
	/**
	 * Checks to see if the object passed is the same as this one
	 * @return true if both objects are equal, false otherwise
	 */
    public boolean equals(Object o)
    {
        if (this == o)
        {
        	return true;
        }
        
        if (o == null || getClass() != o.getClass())
        {
        	return false;
        }
        
        IDCard idCard = (IDCard) o;
        
        return Objects.equals(this.getName(), idCard.getName()) &&
        		Objects.equals(this.getIdNumber(), idCard.getIdNumber());
    }
}