import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Arithmetic
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,a,d,sum;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=s.nextInt();
		d=s.nextInt();
		sum=(n*(2*a+(n-1)*d)/2);
		System.out.println(sum);
	}
}
