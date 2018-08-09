import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DisplayPrime
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i,m,count=0;

        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        m=s.nextInt();

        for(i=n+1; i<m; i++)

        {

            for(int j=2;j<i;j++)

            {
 
           	if(i%j==0)

            	{

            	   count=0;

            	   break;

            	}

            	else

            	{


            	   
count=1;

            	}
 

         }

            if(count==1)

 
               System.out.print(i+" ");

        }   
     
	}
}
