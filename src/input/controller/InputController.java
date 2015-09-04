package input.controller; 					//< Package

import java.util.Scanner; 					//< Defined Import

public class InputController 				//< Class declared
{
								//Comment: Declaration section for instance variables.
								//Data members are always private.
	
	private Scanner inputScanner; 			//< Instance Variables
	
	public InputController() 				//< Constructor
	{
		inputScanner = new Scanner(System.in);
	}
	
	public void start() 					//< Method
	{
		questions(); 						//< Call "questions" method inside of "start" method; still runs
		questions();						//< Second time calling "questions"; runs program twice
	}
	
	private void questions()
	{
		System.out.println("Please type your name below"); 							//< Variable
		String myInput; 															//< Declared visible to lines 18 to 21
		myInput = inputScanner.nextLine(); 											//> Grabs the entire next line
		System.out.println("Hello there " + myInput +", do you like food?"); 		//< Appears as "Hello there (afore-typed input), do you like food?"
		System.out.println("Did you type more than one word? Sorry, please type your full name below.");
		String fullName = inputScanner.nextLine(); 									//< Defines new input string
		System.out.println("Your full name is: " + fullName); 						//< Calls on input string, and displays it
		System.out.println("Greetings, I am Java");
		System.out.println("How old are you?");
		int age = inputScanner.nextInt();											//< Defines new Input 
		System.out.println("You are " + age + " years old? Alright.");				//< Calls on previous input, and displays it
	}
	
}
