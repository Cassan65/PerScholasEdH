package Day2;

import java.util.Scanner;

public class discounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int c; // user input
		int d; // discounted price
		Scanner inputc = new Scanner(System.in);
		System.out.println("Enter amount of purchases: ");
		c = inputc.nextInt();
		if(c > 1000)
			{int p; // percentage off
			p =  c / 10;
			d = c - p;
			System.out.println("Dicounted price: " + d);}
	else 
			System.out.println("No discount applied. Pay full " + c);

}
}
