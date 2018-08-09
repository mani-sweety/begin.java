import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CountDigits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count = 0,num;
       Scanner s=new Scanner(System.in);
       num=s.nextInt();

        while(num != 0)
        {
            num = num/10;
            ++count;
        }

        System.out.println(count);
	}
}
