import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int num,sum = 0;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

        for(int i = 1; i <= num; ++i)
        {
             sum = sum + i;
           
        }

        System.out.println(sum);  
	}
}
