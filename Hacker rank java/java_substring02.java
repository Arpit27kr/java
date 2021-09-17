import java.util.*;
public class java_substring02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int k=input.nextInt();
		String str=input.next();
		String s="";
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				s=str.substring(i,j);
				if(s.length()==3)
				{
					System.out.println(s);
				}
			}
		}
		
		

	}

}
