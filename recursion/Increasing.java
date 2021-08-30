import java.io.*;
import java.util.*;

public class Increasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printIncreasing( n);
    }

    public static void printIncreasing(int n){
    	if(n>0)
    	{
        
          printIncreasing(n-1);
          System.out.println(n);
    	}
    }

}