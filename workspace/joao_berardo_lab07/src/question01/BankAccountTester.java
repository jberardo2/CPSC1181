package question01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class to test the BankAccount class.
 * 
 * @author Joao Berardo
 * @since 1.0, July, 04 2017
*/
public class BankAccountTester
{
	/**
	 * Tests the methods of the BankAccount class.
	 * @param args not used
	*/
	public static void main(String[] args)
	{
		// create five bank accounts
		BankAccount acc1 = new BankAccount(100);
		BankAccount acc2 = new BankAccount(250);
		BankAccount acc3 = new BankAccount(900);
		BankAccount acc4 = new BankAccount(50);
		BankAccount acc5 = new BankAccount(180);
		
		// Put bank accounts into a list
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);
		list.add(acc5);
		
		// sort bank accounts
		Collections.sort(list);
		
		// Print out the sorted list
		for (int i = 0; i < list.size(); i++)
		{
			BankAccount b = list.get(i);
			System.out.println(b.getBalance());
		}
	}
}