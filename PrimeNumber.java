import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num,count=0;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i=1;i<=num+1;i++)
           if(num%i==0)
                count=count+1;
        if(count==2)
              System.out.println("yes");
        else
              System.out.println("no");
	}
}
