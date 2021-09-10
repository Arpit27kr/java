import java.util.*;

public class Tech_Number {
	
	
	

	public static void main(String[] args) {
		int n1=0;
		int n2=0;
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int count=0;
		int temp=num;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		
		if(count%2==0)
		{		
		while(num!=0)
		{
			n1=num%100;
			n2=num/100;
			break;
		}
		
		int sum=n1+n2;
		int sqsum=sum*sum;
		if(sqsum==num)
		{
			System.out.println("Number is tech number");
		}
		else {
			System.out.println("Number is not a tech number");
		}

	}
		else {
			System.out.println("Number is not a tech number ");
		}
		
		}
	}

