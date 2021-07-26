
public class recursion {
	public static void main(String[] args)
	{
		int result=sum(9);
		System.out.println("sum of 10 numbers from back is " +result);
	}
	public static int sum(int k) {
		if(k>5 && k<10) {
			return k+sum(k-1);		
		}
		else {
			return 0;
		}
	}

}
