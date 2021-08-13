
public class java_strings_concepts_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "My name is arpit this is sample program for testing ";
		//Finding a Character in a String
		System.out.println(text.indexOf("this"));
		//converting string in upper case
		String text2=text.toUpperCase();
		System.out.println(text2);
		// String concatination
		String fname="Arpit";
		String Surname="Yadav";
		// String concatination with capital and small
		System.out.println(fname+" "+Surname);
		System.out.println(fname.toUpperCase()+" "+Surname.toLowerCase());
		//adding number and strings 
		int x=10;
		String y="20";
		String z=x+y;
		System.out.println(z);
		//Absolute
		System.out.println(Math.abs(-64.4));
		//random number
		System.out.println((int)(Math.random()*101));
		

	}

}
