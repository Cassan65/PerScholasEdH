package Day2;

import java.util.Scanner;

public class centstodollars { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int c;
		int d;
		int e;
		Scanner inputc = new Scanner(System.in);
		System.out.println("Input the cents: ");
		c = inputc.nextInt();
		d =  c / 100;
		e = c % 100;
		System.out.println("That is " + d + " dollars and " + e + " cents.");
		
	

}
}

