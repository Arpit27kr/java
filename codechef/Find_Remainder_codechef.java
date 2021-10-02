package hello;

import java.util.Scanner;

public class Find_Remainder_codechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		for(int i=0;i<t;i++)
		{
			int num1=input.nextInt();
			int num2=input.nextInt();
			int s=num1%num2;
			System.out.println(s);
		}
				

				
	}

}
