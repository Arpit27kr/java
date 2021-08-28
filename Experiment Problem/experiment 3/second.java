
public class second {
	
	public static void sum()
	{
		int sum=0;
		for (int i=101;i<200;i++)
			if(i%3==0)
		{
			{
			   sum=sum+i; 
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of number above 101 and less then 200 are : " );
		sum();
		
	}

}
