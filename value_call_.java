package revision;

public class value_call_ {
	
	public static void swap(int a,int b)
	{		
		int temp=a;
		a=b;
		b=temp;
		int no;
		System.out.println( "SWAPPED VALUE"  +a+ " " +b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=6;
		swap(x,y);
	}
}
