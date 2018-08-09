import java.util.*;
import java.lang.*;
import java.io.*;

class DisplayEven
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int n,i,m;
         
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m=s.nextInt();
        for(i=n+1; i<m; i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }   
        
          System.out.println();
	}
}
