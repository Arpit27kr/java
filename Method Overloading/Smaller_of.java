/*
 * Write a set of overloaded functions min() that returns the smaller of 
 * two numbers passed to them as arguments. Make versions for int and float.
 */

public class Smaller_of {
	 static class min{
		 void Min(int x,int y)
		{
			if(x>y)
			{
				System.out.println(y);
			}
			else 
				System.out.println(y);
		}
		void Min(int x,float y)
		{
			if(x>y)
			{
				System.out.println(y);
			}
			else 
				System.out.println(x);
			
		}
		void Min(float x,float y)
		{
			if(x>y)
			{
				System.out.println(y);
			}
			else 
				System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		min ovl=new min();
	    ovl.Min(4, 5);
	    ovl.Min(12, 5.5f);
	    ovl.Min(44.45f, 57.42f);
	    
	    
		

	}

}
