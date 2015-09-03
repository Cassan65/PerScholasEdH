package cassPackageThree;
import java.util.Random;
import java.util.Scanner;
public class piggie {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		p2 = input.nextLine();
		System.out.println("Hi " + p2);
		Random randomGenerator = new Random();
		int p1sum = 0;
		int p2sum = 0;
		  //if either player reaches 100, game is over
		  //each rolls three times	
		  while (p1sum <=100 ||  p2sum <= 100); 
				for (int p1diceroll = 0; p1diceroll < 3; p1diceroll++)
					{int p1random;
					p1random = randomGenerator.nextInt(6) + 1;
					if(p1random == 1)
						{System.out.println("You rolled a " + p1random + ". Computer Current score is still: " + p1sum);
							for(int p2diceroll = 0; p2diceroll < 3; p2diceroll++)
								{int p2random;
								p2random = randomGenerator.nextInt(6) + 1;
								if(p2random == 1)
									{System.out.println("You rolled a " + p2random + ". Your Current score is still: " + p2sum);}
								else if (p2sum>=100)
								{p2sum = p2sum + p2random;
								System.out.println("YOU WIN!!! You rolled a " + p2random + ". Your Current score is: " + p2sum);}
								else
									{p2sum = p2sum + p2random ;
									System.out.println("You rolled a " + p2random + ". Your Current score is: " + p2sum);}}}
					else if (p1sum>=100)
					{p2sum = p2sum + p1random;
					{System.out.println("YOU WIN!!! You rolled a " + p1random + ". Computer score is still: " + p1sum);}}
					else
						{p1sum = p1sum + p1random ;
						System.out.println("You rolled a " + p1random + ". Computer Current score is: " + p1sum);
		  }
				}
					}				
 }			
	private static Object nextInt() {
		// TODO Auto-generated method stub
		return null;
	}
}