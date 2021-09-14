import java.util.ArrayList;

public class Searching_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList <>();
		al.add("Arpit");
		al.add("rupesh");
		al.add("rupash");
		al.add("ketan");
		al.add("bansal");
		if(al.contains("Arpit"))
		{
			System.out.println("This is created by arpit");
		}
		else {
			System.out.println("Name not found");
		}

	}

}
