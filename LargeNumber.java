import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LargeNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int n1,n2,n3;
       Scanner s=new Scanner(System.in);
       
        n1=s.nextInt();
    
        n2=s.nextInt();

        n3=s.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1);

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2);

        else
            System.out.println(n3);
	}
}
