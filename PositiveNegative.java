import java.util.*;
import java.lang.*;
import java.io.*;

public class PositiveNegative {

    public static void main(String[] args) throws java.lang.Exception {
      
      Scanner s=new Scanner(System.in);    
 
         int number=s.nextInt();

        
        if (number < 0)
            System.out.println("Negative");

      
        else if ( number > 0)
            System.out.println("Positive");

        
        else
            System.out.println("Zero");
    }
}
