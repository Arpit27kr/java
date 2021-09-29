
public class class_and_object {

	 public static  class person{
		  int age;
		  String name;
		  
		  void sayhi()
		  {
			  System.out.println("My name is " +name+ " my age is "+age);
		  }
		
	}
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1=new person();
		p1.age=10;
		p1.name="Arpit";
		p1.sayhi();
		
		person p2=new person();
		p2.age=20;
		p2.name="Rupesh";
		p2.sayhi();
		
		
		person p3=p1;
		p3.age=21;
		p3.sayhi();
		p1.sayhi();

	}

}
