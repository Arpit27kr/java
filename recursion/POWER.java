import java.io.*;
import java.util.*;


public class POWER {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int n=input.nextInt();
        int temp=power(x,n);
        System.out.println(temp);
    }

    public static int power(int x, int n){
        if(x<n)
        {
        	int div=(int) Math.pow(n,x);
        	return div;
        }
        return 0;
        
    }

}