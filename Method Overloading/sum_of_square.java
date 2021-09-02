/*3.	Write a JAVA program which contains a function fun() such that fun(x) 
 * returns x2 and fun(x,y) returns x2 + y2. (where x and y are integers).
 */


public class sum_of_square {
	static class adder{
	static int fun(int x )
	{
		int fn1=x*x;
		return fn1;
	}
	 static int fun(int x,int y )
	{
		int fn1=(int)Math.pow(x,2);
		int fn2=(int)Math.pow(y,2);
		int fn3=fn1+fn2;
		return fn3;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Square of number is : "+adder.fun(2));
		System.out.println("Square of sum of digit : "+adder.fun(2,4));
		
	}

}
