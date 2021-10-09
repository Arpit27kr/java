package hello;

import java.util.Scanner;

public class block_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		int rev;
		while(t-->0)
		{
			int num=input.nextInt();
		int temp=num;
		 rev=0;
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
			
		}
		if(num==rev)
		{
			System.out.println("You win");
		}
		else {
			System.out.println("Not win");
		}
	}
			
			
			
			
			
		
		
		
		
		
		

	}

}
