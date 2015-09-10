package Day2;

import java.io.*;

public class controlchar {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	    
	     String input = "";
	   	 	try
	   	 	{String filename = "output2.txt";
	   	 	FileWriter fw = new FileWriter(filename, true);
	   	 	fw.write(input);
	   	 	fw.close();}
	   	 catch(IOException ioe)
	   	 {
	   		 System.err.println("IOException: " + ioe.getMessage());
	   	 }
	}
}


