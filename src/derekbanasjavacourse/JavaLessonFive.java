package derekbanasjavacourse;

import java.util.Scanner;

public class JavaLessonFive {


	static int randomNumber; // Class Variable
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while (guessResult != -1)
		{
			System.out.println("Guess a number between 1 and 50: ");
		
			randomGuess = userInput.nextInt();
			
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Yes, you guessed it right, the random number is " + randomGuess);
		
	}
	
	public static int getRandomNum()
	{
		randomNumber = (int) (Math.random() * 51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess)
	{
		if (guess == randomNumber)
		{
			return -1;
		}
		else
		{
			return guess;
		}
	}
	
}
