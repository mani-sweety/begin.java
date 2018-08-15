import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrMedian
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int i,n,temp,j;
				int median,middle;
	
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		
		for(i=0;i<n;i++)
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
	
                         middle=n/2;
                         if(n%2==1)
                          median=a[middle];
                          else
                          {
                          	median=(a[middle-1]+a[middle])/2;
                          	
                          }
                         System.out.print(median);
                         
		
	}
}
