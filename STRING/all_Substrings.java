import java.util.Scanner;

public class all_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.next();
		String temp=" ";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				
				temp=str.substring(i,j);
				System.out.println(temp);
			}
		}
         
	}

}
