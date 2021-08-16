/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
*/
import java.util.Scanner;

public class Digit_frequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
       getDigitFrequency(n, d);
        
    }

    public static void getDigitFrequency(int n, int d) {
        // write code here
        int count=0;
        while(n>0)
        {
          
        	if(n%10 == d)
        	{
        		count++;
        				
        	}
        
        	n=n/10;	
        	
        	       
               
        }
        System.out.print(count);
       
        
    }
}
