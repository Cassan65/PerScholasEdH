package cassPackageTwo;

import java.util.Random;
import java.util.Scanner;

public class guessinggame {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Random randomGenerator = new Random();
		  //generate random number from 1 to 10
		  int random = randomGenerator.nextInt(10) + 1;
		  int guess = 0;
		  //user gets three guess
		  for (int tries = 0; tries <3; tries++)
		
		  	System.out.println("Please enter a value for x: ");
			  guess = input.nextInt();
		  		//if user is right
			    if (guess == random)
		  		System.out.println("You are right");
		  		//if user is wrong and not three guesses
			    else if (guess == random - 3)
		  			System.out.println("You are cold");	
			    else if (guess == random + 3)
		  			System.out.println("You are cold");	
			    else if (guess == random - 2)
		  			System.out.println("You are warm");	
			    else if (guess == random + 2)
		  			System.out.println("You are warm");	
			    else if (guess == random - 1)
		  			System.out.println("You are hot");	
			    else if (guess == random + 1)
		  			System.out.println("You are hot");	
		  		//if user is wrong and is three guesses
			    else
		  			System.out.println("The correct number is " + guess + ". You have lost the game");


		}
		

}
