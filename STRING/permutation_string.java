import java.io.*;
import java.util.*;



public class permutation_string {
	
	
	public static int factorial(int n) {
		if(n==1)
		{
			return 1;
		}
		
		int fnc=factorial(n-1);
		int fnc2=n*fnc;
		return fnc2;
		
	}

	
	public static void solution(String str){
		// write your code here
		
		int n=str.length();
		System.out.println(n);
		int f=factorial(n);
		System.out.println(f);
		for(int i=0;i<f;i++) 
		{
		 StringBuilder sb = new StringBuilder(str);
		 int temp=i;
		 for(int div=n;div>=1;div--)
		 {
			int q=temp/div;
			int r=temp%div;
			System.out.print(sb.charAt(r));
			sb.deleteCharAt(r);
			temp=q;
		 }
		  System.out.println();

		
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}