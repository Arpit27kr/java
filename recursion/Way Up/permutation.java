package recursion;
import java.util.Scanner;

public class permutation {
	
	public static void permutation(String str,String ans)
	{
		
		if(str.length()==0)
		{
			System.out.println(ans);
		}
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		    String leftp=str.substring(0,i);
		    String rightp=str.substring(i+1);
		    String ros=leftp+rightp;
	        permutation(ros,ch+ans);	
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		String str=input.next();
		permutation(str,"");

		
		
		
		
	}

}
