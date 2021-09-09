//count number of words

import java.util.*;
public class count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if( str.charAt(i) ==' ')
				
			{
				count++;
				
			}
		
		}
		System.out.println(count);

		
	}

}
