import java.util.*;
public class Sunny_Number {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int c=0;
		for(int i=1;i<=num;i++)
		{
			int a=(i*i)-1;
			if(num==a)
			{
				  c=1;
			}
			if(c==1) {
				System.out.println("Number is sunny number");
				break;
			}
			else {
				System.out.println("Number is not Sunny number");
				break;
			}
		}
	}

}
