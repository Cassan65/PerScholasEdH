package Day2;

import java.util.Scanner;

public class orderchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int b;
		int n;
		int w;
		Scanner inputb = new Scanner(System.in);
		System.out.println("Input number of bolts");
		b = inputb.nextInt();
		Scanner inputn = new Scanner(System.in);
		System.out.println("Input number of nuts");
		n = inputn.nextInt();
		Scanner inputw = new Scanner(System.in);
		System.out.println("Input number of washers");
		w = inputw.nextInt();
		
		if (n<b)
			{System.out.println("Check the Order: too few nuts");}
		if (w < (b*2))
			{System.out.println("Check the Order: too few washers");}
		if (n>=b && (w>=(b*2)))
			{System.out.println("Order is OK");
			System.out.println("Total cost: " + (b*5 + (n*3) + (w)));}
				

}
}

