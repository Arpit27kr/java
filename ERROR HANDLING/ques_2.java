package EXCEPTION;

import java.util.Scanner;

class myexception extends Exception{
	
	public myexception()
	{
		System.out.println("Number is less than 500");		
	}
}

public class ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		try 
		{
			if (n<500)
			{
				throw new myexception();
			}
			else
			{
				System.out.println("Number is greater than 500");
			}
			
		}catch(Exception e)
		{
		
		}
	}

}
