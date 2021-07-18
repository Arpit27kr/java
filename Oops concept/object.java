 /* sample program to declare object 
   and method of a class */
public class object {              // class declared as object
	
	public void run ()                 // class method as run
	{
	   System.out.println("I am running");	
	}
	
	public void eat()                   // another class method eat 
	{
		System.out.println("I am eating");
	}
	
	public static void main(String[] args)       // main method
	{
		System.out.println("Below mentioned are method call with object");
		object bruzo=new object();             // creating object bruzo 
		bruzo.run();                           // calling run method with object name bruzo 
		bruzo.eat();                           // // calling eat method with object name bruzo 
		
	}

	
}
