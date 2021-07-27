import java.util.ArrayList;

public class array_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();  // create an array list object
		cars.add("volvo");
		cars.add("Bus");
		cars.add("car");
		cars.add("ford");
		System.out.println(cars);
		System.out.println("**********ACESS AN ELEMENT********");
		System.out.println(cars.get(0)); 
		System.out.println("**********change an item with set********");
		cars.set(1,"abc");
		System.out.println(cars.get(1));
		System.out.println("**********Remove the eklement********");
		System.out.println(cars.get(2));
		cars.remove(2);
		System.out.println("********array list size********");
		System.out.println(cars.size());
		System.out.println("********loops in Array*****");
		 for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
		
		
	}

}
