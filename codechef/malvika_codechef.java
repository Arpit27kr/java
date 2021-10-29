package hello;
import java.util.*;
public class malvika_codechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
			String str=input.next();
			int count1=0;
			int count2=0;
			for(int i=0;i<str.length()-1;i++)
			{
				
				 if(str.charAt(i)=='a')
				{
					count1++;
				}
				
				else 
				{
					count2++;
				}
				
			}
			if(count1==1 || count2==1)
			{
				System.out.println(count1);
			}
			else
			{
				int s=Math.min(count1, count2);
				System.out.println(s);
				System.out.println();
			}
		}

	}

}
