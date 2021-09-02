/*
   Write a JAVA program which contains a function cube() such that cube(3)
    returns 27, cube(0.2) returns 0.008.

*/
import java.util.*;
public class cube {
	
	
		public static int cube(int n)
		{
		   int fn1=n*n*n;
		   return fn1;
		}
		public static float cube(float a)
		{
		   float fn2=a*a*a;
		   return fn2;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter integer number ");
		int n=input.nextInt();
		int intsq=cube(n);
		System.out.println(intsq);
		System.out.println();
		System.out.print("Enter decimal number ");
		float a=input.nextFloat();
		float fltsq=cube(a);
		System.out.println(fltsq);
		
		

	}

}
