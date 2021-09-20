package hello_world;

public class object {
	
	String type;
	int time;
	String color;
	
	public object(int age)
	{
		System.out.println("This object is from time "  +age);
	}
	
	public object(String name)
	{
		System.out.println("This object name is "  +name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		object myobj=new object("Empty");
		object myobj2=new object(19);
		
		
		

	}

}
