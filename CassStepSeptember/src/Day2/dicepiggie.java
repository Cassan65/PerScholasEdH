package Day2;


import java.util.Random;
import java.util.Scanner;

public class dicepiggie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Random randomGenerator = new Random();
		  //generate random number from 1 to 6 for dice

		  int p1sum = 0;
		  int p2sum = 0;


		  //if either player reaches 100, game is over

	  {
		  //each rolls three times	
		  while (p1sum <=100 ||  p2sum <= 100); 
				for (int p1diceroll = 0; p1diceroll < 3; p1diceroll++)
					{int p1random;
					p1random = randomGenerator.nextInt(6) + 1;
					if(p1random == 1)
						{p1sum = p1sum;
						System.out.println("You rolled a " + p1random + ". Computer Current score is still: " + p1sum);
							for(int p2diceroll = 0; p2diceroll < 3; p2diceroll++)
								{int p2random;
								p2random = randomGenerator.nextInt(6) + 1;
								if(p2random == 1)
									{p2sum = p2sum;
									System.out.println("You rolled a " + p2random + ". Your Current score is still: " + p2sum);}
								else if (p2sum>=100)
									{p2sum = p2sum + p2random ;
									System.out.println("YOU WIN!!! You rolled a " + p2random + ". Your Current score is: " + p2sum);}
								else					
									{p2sum = p2sum + p2random ;
									System.out.println("You rolled a " + p2random + ". Your Current score is: " + p2sum);}
							}
					  }
					else
						{p1sum = p1sum + p1random ;
						System.out.println("You rolled a " + p1random + ". Computer Current score is: " + p1sum);
						continue;
		  }
				}
				}
			 }
	
		


	private static Object nextInt() {
		// TODO Auto-generated method stub
		return null;
	}

}