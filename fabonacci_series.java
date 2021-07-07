//program for fabpnacci series
public class fabonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1; //initialize a and b
		System.out.println(a); //print first two numbers
		System.out.println(b);
		int c;
		for(int i=0;i<10;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b; //swaping position of a and b
			b=c; //swapping position of b and c
			
			
		}

	}

}
