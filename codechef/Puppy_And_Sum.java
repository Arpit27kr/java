package hello;
import java.util.*;
public class Puppy_And_Sum {
	
	public static int num(int p)
	{
		int sum=(p*(p+1))/2;	
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		int t=input.nextInt();
		for(int k=0;k<t;k++)
		{
		int c=input.nextInt();
		int p=input.nextInt();
		
	
			for(int i=0;i<c;i++)	
			{
		
		       p= num(p);
			}
			System.out.println(p);
		}
		
	}

}
