import java.util.ArrayList;
import java.util.Scanner;

public class duplicate_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
	
		
		ArrayList<Integer>al=new ArrayList();
		for(int i=0;i<n;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		

	}

}
