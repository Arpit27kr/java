package hello;
import java.util.*;
public class chef_and_digits_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		
		while(t-->0)
		{
			String n=input.next();
			int count0=0;
			int count1=0;
			for(int i=0;i<n.length();i++)
			{
				if(n.charAt(i)=='0')
				{
					count0++;
				}
				else
				{
					count1++;
				}
			}
			System.out.println(count1);
			System.out.println(count0);
				if(count0==1||count1==1)
				{
					System.out.println("yes");
					
					
				}
				else
				{
					System.out.println("no");
				}
			
				
			
			
			
			
		}
		
		
		
		
	}

}
