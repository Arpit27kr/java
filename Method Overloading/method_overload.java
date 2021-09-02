/*
 * Write a JAVA program which contains a function fun() such that fun(x) 
 * returns x and fun(x,y) returns x + y and fun(x,y,z) returns x*y*z. 
 * (where x, y and z are integers).
 * 
/*
   4.	Write a JAVA program which contains a function fun() such that fun(x) returns x and fun(x,y) 
     returns x + y and fun(x,y,z) returns x*y*z. (where x, y and z are integers).
 */




public class method_overload {
	static  class adder{
	 static int fun(int x )
	{
		return x;
	}
	static  int fun(int x,int y )
	{
		
		return x+y;
	}
	static   int fun(int x,int y,int z )
	{
		return x*y*z;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
		System.out.println(adder.fun(2));
		System.out.println(adder.fun(2,4));
		System.out.println(adder.fun(8,6,4));
	}

}
