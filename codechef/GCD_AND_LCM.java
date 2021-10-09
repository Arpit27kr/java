package hello;

import java.util.Scanner;

public class GCD_AND_LCM {
	
	public static int gcd(int n1,int n2)
	{
		while(n1%n2!=0)
		{
		int rem=n1%n2;
		n1=n2;
		n2=rem;
		}
		return n2;
	}
	public static int lcm(int p,int on1,int on2)
	{
		int o=((on1*on2)/p);
		return o;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		
		int n1=input.nextInt();
		int n2=input.nextInt();
		int on1=n1;
		int on2=n2;
		
		int p=gcd( n1, n2);
		System.out.println(p);
		int k=lcm(p,on1,on2);
		System.out.println(k);
		}
		
	}

}
