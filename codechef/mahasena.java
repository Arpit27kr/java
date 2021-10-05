package hello;
import java.util.*;
public class mahasena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int lu=0;
		int unlu=0;
		int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=input.nextInt();
			}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				lu++;
				
		
			}
			else {
				unlu++;				
				
			}
	
		
		}
		if(lu>unlu)
		{
			System.out.println("READY FOR BATTLE");
			
		}
		else {
			System.out.println("NOT READY ");
		}
		
	
		

	}

}
