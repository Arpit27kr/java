package hello;

import java.util.Scanner;

public class chef_and_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
			int num1=input.nextInt();
			int num2=input.nextInt();
			if(num1>num2)
			{
				System.out.println(">");
			}
			else if(num1<num2)
			{
				System.out.println("<");
			}
			else {
				System.out.println("=");
			}
		}

	}

}
