package hello;

import java.util.Scanner;

public class Tanu_and_HeadBob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-- >0){
	        int N=0,Y=0,I=0;
	        int n=sc.nextInt();
	        String str=sc.next();
	        for(int i=0;i<n;i++){
	            if(str.charAt(i)=='Y')
	            Y++;
	            else if(str.charAt(i)=='I')
	            I++;
	            else
	            N++;
	            
	        }
	        
	        if(I>0)
	        System.out.println("INDIAN");
	        else if(Y>0)
	         System.out.println("NOT INDIAN");
	        else
	             System.out.println("NOT SURE");
	    }
		

	}

}
