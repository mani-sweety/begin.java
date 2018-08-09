import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumNK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here  Scanner in=new Scanner(System.in);
	               Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int sum=0;
		int a[]=new int[N];
		for (int i = 0; i < N; i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<K;i++)
		{
			sum=sum+a[i];
		}
	
		System.out.println(sum);
	}
}
