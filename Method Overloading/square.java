/*1.	Write a JAVA program which contains a function square() such that square(3) returns 9, 
 * square(0.2) returns 0.04.
 */
import java.util.*;
public class square {
	public static int square(int n)
	{
	   int fn1=n*n;
	   return fn1;
	}
	public static float square(float a)
	{
	   float fn2=a*a;
	   return fn2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter integer number ");
		int n=input.nextInt();
		int intsq=square(n);
		System.out.println(intsq);
		System.out.println();
		System.out.print("Enter decimal number ");
		float a=input.nextFloat();
		float fltsq=square(a);
		System.out.println(fltsq);
		

	}

}
