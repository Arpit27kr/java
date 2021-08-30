import java.util.*;
public class factorial {
	
	 public static int factorial(int n){
	        if(n==1){
	        	return 1;
	        }
	        int fnc=factorial(n-1);
	        int fnc2=n*fnc;
	        return fnc2;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
       int fact=factorial(n);
        System.out.println(fact);

	}

}
