package hello;

import java.util.Scanner;

public class small_factorials {
	
	public static int recfact(int num)
	{
		if(num==0)
		{
			return 1;
		}
	
		int fact=recfact(num-1);
		int temp=fact*num;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		int num=input.nextInt();
	
		System.out.println(	recfact(num));
		}
		

	}

}
