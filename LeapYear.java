import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LeapYear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int year;
        boolean leap = false;
        Scanner s=new Scanner(System.in);
        year=s.nextInt();

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
               
               if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap==true)
            System.out.println("yes");
        else
            System.out.println("no");
	}
}
