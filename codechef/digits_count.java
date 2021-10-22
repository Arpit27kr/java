package hello;

import java.util.Scanner;



public class digits_count {
	public static void countdig(int n)
	{
		int count =0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		if(count==1)
		{
			System.out.println("1");
		}
		else if(count==2)
		{
			System.out.println("2");
		}
		else if(count==3)
		{
			System.out.println("3");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		countdig(n);

	}

}
