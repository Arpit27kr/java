import java.util.Scanner;

public class puppy_and_sum_codechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int d=input.nextInt();
		int sum=0;
		for(int i=d;i>0;i--)
		{
			sum=sum+i;
			
			
		}
		if(n>1)
		{
			for(int j=sum-1;j>0;j--)
			{
				sum=sum+j;
				
				
			}
			System.out.println(sum);
		}
		else {
			System.out.println(sum);
		}

	}

}
