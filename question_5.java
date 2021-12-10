package EXCEPTION;

import java.util.Scanner;

class myex extends Exception{
	
	public myex() {
		// TODO Auto-generated constructor stub
		System.out.println("Number should greater than 0");	
	}	
}
class myex2 extends Exception{
	
	public myex2()
	{
		System.out.println("Number should not be 0");
	}	
}

public class question_5 {
	
	public static void raise(int c,int d)
	{
		int z=(int) Math.pow(c, d);
		System.out.println(z);
		
	}
	


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		try
		{
			if(a<0||b<0)
			{
				throw new myex();
			}
			else if(a==0||b==0)
			{
				throw new myex2();
				
			}
			else
			{
				raise(a,b);
			}
			
			
		}catch(Exception e)
		{
			
		}
		

	}

}
