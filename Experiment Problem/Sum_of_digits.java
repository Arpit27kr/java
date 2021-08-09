//Write program to find sum of all digits
import java.util.*;
public class Sum_of_digits {
	public static void number(int n)
	{
		int sum=0;
		int m;
		while(n>0)
		{
			 m=n%10;
			sum=sum+m;
			n=n/10;
			
		}
		
		System.out.print("Sum of digits of number is : "+sum);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
		int n=input.nextInt();
		System.out.println();
		number(n);
		

	}

}
