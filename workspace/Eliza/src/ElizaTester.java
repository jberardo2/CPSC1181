
import java.util.Scanner;

public class ElizaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eliza bot = new Eliza();
		Scanner input = new Scanner(System.in);
		String answer = "";
		
		bot.speak();
		
		do
		{
			System.out.print(" - ");
			answer = input.nextLine();
			bot.getAnswer(answer);
			bot.speak();
			
		} while (!answer.toLowerCase().equals("bye"));

	}

}