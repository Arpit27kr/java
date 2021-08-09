//Write a program to print first digit. e.g. input 23516 output 2.
import java.util.*;
public class first_digit {
	public static void main(String[] args)
	{
	   Scanner input=new Scanner(System.in);
	   System.out.print("Enter the number for first number calculation : ");
		int n=input.nextInt();
		while(n>=10)
		{
			n=n/10;
			
		}
		
		System.out.println();
		System.out.print("First number is : " +n);
		
	}	
		
	}


