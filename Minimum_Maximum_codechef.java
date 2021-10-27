package hello;
import java.util.*;
public class Minimum_Maximum_codechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		int n=input.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
		int min=a[0];
		int count=0;
		for(int i=0;i<n;i++)
		{
			
			if(a[0]>a[i])
			{
				min=a[i];
			}
			count++;
			
		}
		int sum=0;
		for(int j=0;j<count-1;j++)
		{
			sum=sum+min;
		}
		System.out.println(sum);
		}

	}

}
