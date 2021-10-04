package hello;
import java.util.*;
public class is_vowel_or_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		char c = input.next().charAt(0);
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
		{
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
		
		
		
	}

}
