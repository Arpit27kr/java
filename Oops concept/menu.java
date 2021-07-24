import java.util.*;
public class menu {
	static void sum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int num1=sc.nextInt();
		System.out.println("Enter the number two");
		int num2=sc.nextInt();
		int sum;
		sum=num1+num2;
		System.out.println("entered sum is " +sum);
	}
	static void diff()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
		int num1=sc.nextInt();
		System.out.print("enter a number");
		int num2=sc.nextInt();
		int diff;
		diff=num1-num2;
		System.out.println(diff);
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("Enter 1 for sum");
		System.out.println("enter two for difference");
		System.out.println("************************************");
		int num=sc.nextInt();
		
		switch(num)
		
		{
		case 1:
		sum();
		break;		
		
		case 2:
		diff();	
		break;
		}
			
		
	}

}
