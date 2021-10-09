package hello;

import java.util.Scanner;

public class primality_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		int num=input.nextInt();
		int count=0;
		for(int i=num;i>0;i--)
		{
			if(num%i==0)
			{
				count++;
			}
		
		}
		if(count==2)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}
	}
}
