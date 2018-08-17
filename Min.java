

import java.util.*;
import java.lang.*;
import java.io.*;

class Min
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int m;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		int hr=m/60;
		int min=m%60;
		System.out.printf("%d %d", hr,min);
	}
}
