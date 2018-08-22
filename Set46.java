import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Set46
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.nextLine();
		int count=0;
		for(int i=0;i<ch.length();i++)
		{
 
			if(Character.isLetter(ch.charAt(i))|| Character.isDigit(ch.charAt(i)))
			{
				//continue;
			}
			else
			{
				count++;
			}
		}
 
System.out.println(count);
	}
}
