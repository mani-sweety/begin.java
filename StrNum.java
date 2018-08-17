

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class StrNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
        String str;
        Scanner s=new Scanner(System.in);
        str=s.next();
        boolean numeric = true;

        try {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric)
            System.out.println("Yes");
        else
            System.out.println("No");
	}
}
