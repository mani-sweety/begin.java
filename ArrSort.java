import java.util.*;
import java.lang.*;
import java.io.*;


class ArrSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int i,n,temp,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
	                        	if(a[i]>a[j])
	                        	{
	                        		temp=a[i];
	                        		a[i]=a[j];
	                        		a[j]=temp;
	                        	}
		
		  	
		}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		
		
	}
}
