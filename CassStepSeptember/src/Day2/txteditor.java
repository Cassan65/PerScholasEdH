package Day2;

	import java.util.Scanner;

	public class txteditor {

		public static void main(String[] args)	{
		//get lines of test from user - when user enters '//done' then stop input


	Scanner scan = new Scanner(System.in);{
	System.out.println("Enter line of text: ");
	String in = scan.next();
	while (in != "//done")
		{
		System.out.println("Enter line of text: ");
		in = scan.nextLine();
		System.out.println("You entered " + in);
		System.out.println("");	
		
	if(in == "//done")
		System.out.println("Ok you are done");
		break;
	}
		}
	}
	}
	
	
	
	