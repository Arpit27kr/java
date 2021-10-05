package hello;

import java.util.Scanner;

public class Helping_chef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		int num=input.nextInt();
		if(num<10)
		{
			System.out.println("Thanks for helping Chef!");
		}
		else {
			System.out.println("-1");
		}

	}
	}
}
