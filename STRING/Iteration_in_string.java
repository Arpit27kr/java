
public class Iteration_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java T point For Java I Very Good";
		int n=s1.length();
		for(int i=0;i<n;i++)
		{
			if(i%2==0) {
				System.out.println("CHAR AT " +i+ " is " +s1.charAt(i) );
			}
			else {
				System.out.println("not found");
			}
			
		}

	}

}
