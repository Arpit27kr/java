package hello;
import java.util.*;
public class sum_of_digit_codechef {
	
	public static void rev(int num)
	{
		
		int sum=0;
		int m=0;
		while(num>0)
		{
		
			int rem=num%10;
			 sum=sum+rem;
			num=num/10;
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int num=input.nextInt();
			rev(num);
		
		}
		
	}

}
