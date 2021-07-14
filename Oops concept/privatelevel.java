/* Private level modifiers only allow to acess element
 * within same class not outside the class.
 

class A 
{
         private  void m1()
          {
        	  System.out.println("A class method");
          }
}

public class privatelevel 
{
	public static void main(String[] args)
	{
		A a=new A();
		a.m1();
	}
}

*/


/* Private members only allow to acess within same
 * class.
 */

class A 
{
         private  void m1()
          {
        	  System.out.println("A class method");
          }
         
         public static void main(String[] args)
     	{
     		A a=new A();
     		a.m1();
     	}
}

public class privatelevel

{
	private  void m3()
	{
		System.out.println("This function is in private mode");
	}
	public static void main(String[] args)
	{
		privatelevel a=new privatelevel();
		a.m3();
	}
}

































