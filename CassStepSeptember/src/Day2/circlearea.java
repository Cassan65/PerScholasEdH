package Day2;

import java.util.Scanner;

public class circlearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r;
		Scanner inputr = new Scanner(System.in);
		System.out.println("Input the radius");
		r = inputr.nextInt();
		System.out.println("The radius is: " + r + ". The area is: " + Math.PI * Math.pow(r, 2));

}
}
