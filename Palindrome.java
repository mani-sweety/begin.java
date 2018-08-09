import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int num , reversed= 0, rem, original;
       Scanner s=new Scanner(System.in);
       num=s.nextInt();

        original = num;

        while( num != 0 )
        {
            rem= num % 10;
            reversed = reversed* 10 + rem;
            num  /= 10;
        }

        if (original== reversed)
            System.out.println("yes");
        else
            System.out.println("no");
	}
}
