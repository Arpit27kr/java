


public class palindrome_program_from1to1000 {
	
	static int check(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("palindrome between 1 to 1000 are :");
		for(int i=0;i<=1000;i++)
		{
			int rev=check(i);
			if(i==rev)
			{
				System.out.println(i);
			}
		}
	}

}
