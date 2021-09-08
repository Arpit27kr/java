//Peterson Number Java Program


import java.util.*;
public class Peterson_Number {
	
	
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		return count;
	}
	public static void tera(int num,int cnt)
	{
		int sum=0;
		int n=num;
		while(n>0)
			
		{
			
				int ld=n%10;
				sum=sum+factorial(ld,cnt);
				n=n/10;
				
		}
			if(num==sum)
			{
				System.out.println("Number is  peterson number");
			}
			else {
				System.out.println("Number is not peterson number");
				
			}
			
		}
		
	public static int factorial(int ld,int cnt)
	{
		int fact=1;
		
		for(int i=ld;i>0;i--)
		{
			fact=i*fact;
		}
		
		return fact;
		
		
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
        int cnt=count(num);
        tera( num, cnt);
        
        
		
	}

}
