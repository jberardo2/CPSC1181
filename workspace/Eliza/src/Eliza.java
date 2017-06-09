import org.omg.CORBA.StringHolder;

/**
 * Eliza
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since June, 08 2017
 *
 */
public class Eliza
{
	// instance variables
	String phrase;
	String answer;

	/**
	 * Creates a psychoterapist called Eliza
	 */
	public Eliza()
	{
		this.phrase = "The doctor is in.\n\nWhat's on your mind?";
		this.answer = "";
	}
	
	/**
	 * Eliza says something to user<br/>
	 * It can greet the user or ask a question</br>
	 * This method displays the string phrase in console
	 */
	public void speak()
	{
		System.out.println(phrase);
	}
	
	/**
	 * Retrieves the user's answer
	 * @param userAnswer answer entered by the user
	 */
	public void getAnswer(String userAnswer)
	{
		this.answer = userAnswer;
		analyzeAnswer();
	}
	
	/**
	 * Analyzes the user answer</br>
	 * Search and replace words, format response, etc
	 */
	private void analyzeAnswer()
	{
		ElizaHelper helper = new ElizaHelper(this.phrase);
		phrase = helper.getPhrase();
	}
}