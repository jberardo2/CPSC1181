/**
  A cash register totals up sales and computes change due

  @author Joao Berardo
  @version 1.0
  @since June, 04 2017
*/
public class CashRegister
{
	// instance variables
	private double purchase;
	private double payment;
	
	/**
	  Constructs a cash register with no money in it
	*/
	public CashRegister()
	{
		purchase = 0;
		payment = 0;
	}

	/**
	  Records the sale of an item.
	  @param amount The price of the item
	*/
	public void recordPurchase(double amount)
	{
		purchase = purchase + amount;
	}
	
	/**
	  Processes a payment received from the customer
	  @param amount Payment value
	*/
	public void receivePayment(double amount)
	{
		payment = payment + amount;
	}
	
	/**
	  Computes the change due and resets the machine for the next customer
	  @return the change due to the customer
	*/
	public double giveChange()
	{
		double change = 0;
		change = payment - purchase;
		purchase = 0;
		payment = 0;
		
		return change;
	}

	/**
	  Receives a dollar and subtracts from payment
	  @param amount the amount of the payment in dollars (ex: 10 dollars)
	*/
	public void enterDollars(double amount)
	{
		payment+= amount;
	}
	
	/**
	  Receives a quarter and subtracts from payment
	  @param amount the amount of the payment in quarters (ex: 5 quarters)
	*/
	public void enter­Quarters(double amount)
	{
		payment += amount * 0.25;
	}
	
	/**
	  Receives a dime and subtracts from payment
	  @param amount the amount of the payment in dimes (ex: 2 dimes)
	*/
	public void enterDimes(double amount)
	{
		payment += amount * 0.10;
	}
	
	/**
	  Receives a nickel and subtracts from payment
	  @param amount the amount of the payment in nickels (ex: 3 nickels)
	*/
	public void enterNickels(double amount)
	{
		payment += amount * 0.05;
	}
	
	/**
	  Receives a penny and subtracts from payment
	  @param amount the amount of the payment in pennies (ex: 9 pennies)
	*/
	public void enterPennies(double amount)
	{
		payment += amount;
	}
}