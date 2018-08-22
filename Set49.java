/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set49
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	
		int i,big;
		int a[];
		Scanner sc=new Scanner(System.in);
		//n=sc.nextInt();

		a=new int[10];
		for(i=0;i<10;i++)
		{
		
			a[i]=sc.nextInt();
		}
		
		big=a[0];
		for(i=1;i<10;i++)
		{
		
		if(a[i]>big)
		{
			big=a[i];
		}
		
		}
		System.out.println(big);
	}
	
	
}
