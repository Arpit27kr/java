package EXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number a");
		int a=input.nextInt();
		System.out.println("Enter the number b");
		int b=input.nextInt();
		int k=0;
		try
		{
			 k=a/b;
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e);
			
		}
		System.out.println(k);
	}

}
