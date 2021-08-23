/*2.	Write a Java Program to accept 10 numbers in an array and compute the 
 * square of each number. Print the sum of these numbers.
 */
import java.util.*;

public class Square_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the  10 number in array ");
		int [] a= new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=input.nextInt();
		}
		
		System.out.println();
		System.out.println("Entered numbers are : ");
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]+",");
		}
		int sum=0;
		for(int i=0;i<10;i++)
		{
			int  temp=a[i]*a[i];
			sum=sum+temp;
			
		}
		System.out.println();
		System.out.println("SUM OF SQUARE OF NUMBERS ARE  : "+sum);
		
		

	}

}
