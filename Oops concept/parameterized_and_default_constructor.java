package hello;

public class parameterized_and_default_constructor {
	
	 public static class person{
			int age ;
			String name ;
			
	 void details()
			{
				System.out.println("Hi my name is " +name+ " and my age is " +age );
						
			}
   person() // default constructor
	{
		
	}
	 person(int age,String name)  // declaring default constructor
	{
		this.age=age;
		this.name=name;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person p1=new person();  //default constructor is called
		p1.age=30;
		p1.name="arpit";
		p1.details();
		person  p2=new person(20,"amit");   // using default construcytor
		p2.details();

		
	}

}
