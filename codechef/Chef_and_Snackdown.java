package hello;

import java.util.Scanner;

public class Chef_and_Snackdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
			int n=input.nextInt();
			if(n==2010||n== 2015||n==  2016||n==  2017||n==  2019)
			{
				System.out.println("HOSTED");
			}
			else {
				System.out.println("NOT HOSTED");
			}
		}
		

	}

}
