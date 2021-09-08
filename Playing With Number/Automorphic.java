import java.util.*;
public class Automorphic {
	
	public static void rev(int num)
	{
		if(num>0&&num<10)
		{
		int nsq=num*num;     //square of number
		int ldn=nsq%10;   //last digit of number
		if(ldn==num)
		{
			System.out.println("Number is Automorphic");
		}
		else {
			System.out.println("NO");
		}
		
		}
		else {
			int sqnum=num*num;
			int last=sqnum%10;
			int numlast=num%10;
			
			if(last==numlast)
			{
				System.out.println("Number is Automorphic");
			}
			else
			{
				System.out.println("Number is not Automorphic");
			}
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		rev(num);
	}

}
