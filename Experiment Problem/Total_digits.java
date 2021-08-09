
public class Total_digits {
	public static void main(String[] args)
	{
		int n=5478;
		int count =0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Numbers of digits are : " +count);
	}

}
