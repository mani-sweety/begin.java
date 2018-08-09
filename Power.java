
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.DecimalFormat;


/* Name of the class has to be "Main" only if the class is public. */
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int base, exponent;
        Scanner s=new Scanner(System.in);
        base=s.nextInt();
        exponent=s.nextInt();
        long result;
        result=(long)Math.pow(base,exponent);
        System.out.println(result);
	}
}
