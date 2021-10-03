package hello;

import java.util.Scanner;

public class Lucky_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input= new Scanner(System.in);
         
            int t=input.nextInt();
            int i=1;
            while(i<t)
            {
            	   int num=input.nextInt();
            int count=0;
            while(num>0)
            {
            	int rem=num%10;
            	if(rem==4)
            	{
            		count++;
            	}
            	num=num/10;
            }
            System.out.println(count);
           i++;
            
            }
           
	}

}
