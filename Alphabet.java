import java.util.*;
import java.lang.*;
import java.io.*;


class Alphabet
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    char c=s.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println("Alphabet.");
        else
            System.out.println("No");
	}
}
