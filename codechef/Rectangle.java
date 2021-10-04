package hello;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();	
		while(t-->0)
		{
		int a=input.nextInt();
		int b=input.nextInt();	
		int c=input.nextInt();
		int d=input.nextInt();
		
		if(a==b||a==c||a==d )
		{
			if(b==c||b==d||c==d)
			{
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
		else {
			System.out.println("No");
		}
		
		}
		
		
	}

}

  //                                         METHOD 2-------------------------->

/*
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		 if(((a==b)&&(c==d))||((a==d)&&(c==b))||(a==c)&&(b==d))
		{
		System.out.println("YES");    
		}
		else
		{
		    System.out.println("NO");
		}
		
		}
		
	}
}

 */
 
 
 
 









