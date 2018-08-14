import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Multiple
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i;
      int n=5;
      int res;

      Scanner input = new Scanner(System.in);

         
         i = input.nextInt();

        for(int j=1; j<=n;j++){
        	
        res=i*j;

         System.out.print(res+" ");
	}
		
	}
}
