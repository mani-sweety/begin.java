import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AmstrongDisplay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int low, high;
		Scanner s=new Scanner(System.in);
		low=s.nextInt();
		high=s.nextInt();
		

        for(int number = low + 1; number < high; ++number) {

            if (checkArmstrong(number))
                System.out.print(number + " ");
        }
    }

    public static boolean checkArmstrong(int num) {
        int digits = 0;
        int result = 0;
        int originalNumber = num;

        // number of digits calculation
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }

        originalNumber = num;

        // result contains sum of nth power of its digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        if (result == num)
            return true;

        return false;
	}
}
