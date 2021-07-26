// method overloading used for creating multiple method with same name but different parameter
public class methodoverloading {
	int x;
	int y;
	static int  sumMethod(int x,int y)  // sumMethod with int type parameter
	{
	    
		return x+y;
		
	}
	static double sumMethod(double x , double y)                  // same method with different types parameter like double and double
	{
		return x+y;
	}
	public static void main (String[] args)
	{
		int num=sumMethod(4,5);
		double num2=sumMethod(65.5,45.2);
		System.out.println("Int method prints "  +num);
		System.out.println("Double method prints " +num2);
	}

}
