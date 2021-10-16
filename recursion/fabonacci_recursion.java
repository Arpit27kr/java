package recursion;

import java.util.Scanner;

public class fabonacci_recursion {
	
	public static int fabonacci(int n)
	{
	
	if(n==0|| n==1)
	{
		return n;
	}
	
	{
		return fabonacci(n-1)+fabonacci(n-2);
	}
}
	
	public static void main(String [] args)
	{
	
	Scanner input=new Scanner (System.in);
	int n=input.nextInt();
	int rs=fabonacci(n);
	System.out.println(rs);
	}

}
