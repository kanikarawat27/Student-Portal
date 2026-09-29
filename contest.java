import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
      
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char ch = 'A';
        int n = 0;
        for (int i = 1; i <= N; i++) 
        {
            for (int sp = 1; sp <= 2 * (N - i); sp++) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(ch);
                System.out.print(n);
                ch++;
                n++;
            }

            System.out.println();
        }
    }
}
    
    
	
	

	
