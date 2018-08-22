/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set57
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,large,small,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		
			a[i]=sc.nextInt();
		}
		large=small=a[0];
		
		for(i=1;i<n;++i)
    {
        if(a[i]>large)
            large=a[i];
        if(a[i]<small)
            small=a[i];
    }
    
System.out.print(small+" "+large);
	}
}
