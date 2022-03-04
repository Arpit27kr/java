package codechef;

import java.util.Scanner;

public class Car_and_Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
			int x=input.nextInt();
			int y=input.nextInt();
			if(x>y)
			{
				System.out.println("CAR");
			}
			else if(y>x)
			{
				System.out.println("BIKE");
			}
			else
			{
				System.out.println("BOTH");
			}
			
		}

	}

}
