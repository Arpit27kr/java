//Write a Java program to sort  a array list
import java.util.*;
public class Arraylist_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList <>();
		al.add("Arpit");
		al.add("rupesh");
		al.add("rupash");
		al.add("ketan");
		al.add("bansal");
		System.out.println("Array list before ---------------->" +al);
		Collections.sort(al);
		System.out.println("Array List after --------------------> " +al);
		
		

	}

}
