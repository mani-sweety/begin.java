import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Set43
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int space=0;
		    char ch;
		    for(int i=0;i<str.length();i++)
		    {
			  ch=str.charAt(i);

			if(ch==' ')
			{
		              space++;
			}
			
		}
System.out.println(space);
	}
}
