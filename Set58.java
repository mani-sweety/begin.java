import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Set58
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int sum=0,avg;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[];
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
System.out.println(avg);
	}
}
