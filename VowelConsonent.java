import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VowelConsonent
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int i=0;
	Scanner sc=new Scanner(System.in);
	char ch=sc.next( ).charAt(0);	 

	switch(ch)
	{
	 case 'a'  :
	 case 'e'  :
	 case 'i'  :
	 case 'o'  :
	 case 'u'  :
	 case 'A'  :
	 case 'E'  :
	 case 'I'  :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Vowel");
	else 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Consonent");
		else
		System.out.println("Invalid");		
	}
}
