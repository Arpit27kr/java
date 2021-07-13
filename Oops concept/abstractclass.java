/* abstract method declared then abstract 
  class should be declared
 

 abstract class Test 

	 {
		// TODO Auto-generated method stub
		 
		 public abstract void m1() ; // abstract method

	}
    
*/

/*abstract class can contain 0 number of
 * abstract method

  abstract class Test{
	
	public void m1() {}
	public void m2() {}	
	public void m3() {}	
	public void m4() {}	
}


 */
/* 
 * Both class method m1() and m2() must be implemented in child class
 * sub test or if you do not want to implement both method in same child class
 * we can declare that child class as abstract and further declare  
 * susubtest abstract  class and implement the method m2(). 
 
abstract class Test 
{
	public abstract void m1() ;
	public abstract void m2() ;
	
}
abstract class SubTest extends Test
{
	public void m1() {}
	
}

abstract class SubSubTest extends Test
{
	
	public void m2() {}
}
 
*/

/*  Example for above iteration

abstract class vehicle
{
	public abstract int getnowheels();
}
class bus extends vehicle
{
	public int getnowheels()
	{
		return 6;
	}
}
 class auto extends vehicle
 {
	 public int getnowheels()
	 {
		 return 3;
	 }
 }
 class test {
	 public static void main(String[] args ) {
		 bus b =new bus();
		 System.out.println(b.getnowheels());
		 auto a=new auto();
		 System.out.println(a.getnowheels());
	 }
	 
 }

 
*/









