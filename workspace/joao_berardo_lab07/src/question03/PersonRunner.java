package question03;

public class PersonRunner {
	public static void main(String[] args)
	{
		Person aperson = new Person("Bob", 33);
		aperson.tellAll();
		aperson.rememberAnEvent("I was born in 1970.");
		aperson.rememberAnEvent("I finished school in 2003.");
		aperson.tellAll();
		// add an amnesia test here
		aperson.amnesia();
		System.out.println("After amnesia: ");
		aperson.tellAll();
		
		aperson.rememberAnEvent("Test");
		aperson.tellAll();
	}
}