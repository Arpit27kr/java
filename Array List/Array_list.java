import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>al=new ArrayList ();
		al.add(10);                                                               // adding elements in array list
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al+ " ----------------------->" +al.size());               // printing with size  
		al.add(0,1000);                                                          // insert element at specific index
		System.out.println(al+ " ----------------------->" +al.size());          
		int temp=al.get(2);                                                           //get element of specific location      
		System.out.println(temp);
		al.set(1,100);                                                              //replace a element at specific index
		System.out.println(al);
		al.remove(1);                                                             //remove element from specific location
		System.out.println(al);
		for(int i=0;i<al.size();i++)                                               //iterate the array list 
		{
			int tsp=al.get(i);
			System.out.print(tsp+" ");
			
		}
		

	}

}
