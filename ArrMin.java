import java.util.*;
import java.lang.*;
import java.io.*;


class ArrMin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,n,min;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		min=a[0];
		for(i=0;i<n;i++)
		{
		if(a[i]<min)
		{
		  min=a[i]; 	
		}
		}
		System.out.println(min);
		
		
		
	

	}
}
