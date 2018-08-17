import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Set41
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int sum=0;
 
 
 
                         String ch = sc.nextLine();
 
 
 
 
		for(int i=0;i<ch.length();i++)
		{
			if(ch.charAt(i)==' ')
			{
			continue ;
			}
			sum++;
		}
		System.out.println(sum);
	}
