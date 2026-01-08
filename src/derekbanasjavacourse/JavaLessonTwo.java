package derekbanasjavacourse;

import java.util.Scanner;

public class JavaLessonTwo {
	
	public static void main(String[] args) 
	{
		System.out.print("Your favorite number: ");
		
		if (userInput.hasNextInt()) 
		{
			
			int numberEntered = userInput.nextInt();	
			System.out.println("You entered " + numberEntered);
			
			
		} else if (userInput.hasNext("Tomatos")) 
		{
			System.out.println("Need have cucumber");		
		} 
		else 
		{
			System.out.print("Please type a number next time.");
		}
		
	}
	
	static Scanner userInput = new Scanner(System.in);
	
}
