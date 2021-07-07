
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rev=0;
		int rem;
		int num=1221;
		int temp=num;
		while(temp!=0)
		{
		rem= temp % 10;
		rev=rev*10+rem;
		temp=temp/10;
		}
		
		if (rev==num)
			
		{
			System.out.println("Number is palindrome");
		}
		else {
			System.out.print("Number is not palindome");
		}
			
		

	}

}
