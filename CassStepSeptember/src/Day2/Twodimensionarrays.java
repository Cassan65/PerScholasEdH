

package Day2;

import java.io.*;

public class Twodimensionarrays {

	public static void main(String[] args) throws IOException
	{


	int [] [] data = { 
			{3, 2, 5},
			{1, 4, 4, 8, 13},
			{9, 1, 0, 2}, 
			{0, 2, 6, 3 -1, -8}};
	
    int size=data.length,largestRow=0,sum=0,column=0;
    for(int check=0;check<=(size-1); check++){
        if (largestRow<data[check].length){
            largestRow=data[check].length;
        }

    }

do {
for (int row = 0; row < size; row++){
 if (column<(data[row].length))
sum += data[row][column];}
column+=1;



			}
	
while(column!=largestRow);

System.out.println("Total is " + sum);}
}

