/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set66
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		int i,count=0,count1=0,count2=0;
		for(i=0;i<ch.length();i++)
		{

			//ch = aString.charAt(i);
                                    //di = aString.charAt(i);

			if(Character.isLetter(ch.charAt(i)))
			{
			  
			  count++;
		            }
		            else if(Character.isDigit(ch.charAt(i)))
		            {
		            	count1++;
		            }
		            else
		            {
		            	count2++;
		            }
			
		}
		if(count>0&&count1>0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}
}
