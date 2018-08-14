import java.util.*;
import java.lang.*;
import java.io.*

class Fact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int num ;
        long factorial = 1;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            factorial = factorial * i;
           
        }
        System.out.println(factorial);
	}
}
