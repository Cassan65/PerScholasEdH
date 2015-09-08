package Day2;

import java.util.Scanner;

public class texteditor {

	int lines;
	
	//get 5 lines of test from user
	Scanner inputline = new Scanner(System.in);
	
	while (inputline !="//done")

		System.out.println("Enter first line of text: ");
		lines = inputline.nextInt();
		System.out.println(inputline);
}
