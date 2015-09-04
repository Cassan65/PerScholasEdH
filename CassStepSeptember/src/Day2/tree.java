package Day2;

import java.util.Scanner;

public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int i; // counter
		int t; // number of lines in tree entered by user
		String b = "*";
		char a = '*'; // character to repeat
		Scanner inputt = new Scanner(System.in);
		System.out.println("Enter the length of your tree");
		t = inputt.nextInt();
		for (i = 0; i < t; i++)
			{System.out.print(a);
			System.out.println(repeat("*", i));}
			
			
			
	}


public static String repeat(String str, int times){
	   StringBuilder ret = new StringBuilder();
	   for(int i = 0;i < times;i++) ret.append(str);
	   return ret.toString();
}
}

	 
