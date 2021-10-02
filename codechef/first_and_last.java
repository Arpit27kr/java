package hello;

import java.util.Scanner;

public class first_and_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int test_case;
        int remainder = 0;
        int sum;
        Scanner in = new Scanner(System.in);
        test_case = in.nextInt();
        for (int i = 0; i < test_case; i++) {
            int x = in.nextInt();
            sum = x%10;
            while(x>0){
                remainder = x%10;
                x = x/10;
                System.out.println(remainder);
            }
            sum = sum + remainder;
            
        }

	}

}
