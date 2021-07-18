/* program to declare method through reference variable*/
public class referencevariable {                   //declaring class
	String name;         // declaring reference variable name and age
	int age;
	 
	public static void main(String[] args)   // main method
	{
		referencevariable buzo = new referencevariable();           //creating new object bruzo 
		buzo.name="robert";                 //setting name of reference variable
		buzo.age=10;
		System.out.print("DOG name is " +buzo.name   );
		System.out.print(" age is "  +buzo.age);
		
	}
}

