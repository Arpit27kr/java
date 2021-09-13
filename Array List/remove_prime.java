import java.io.*;
import java.util.*;

public class remove_prime {
    
    public static boolean isprime(int val)
    {
        int count=0;
        for(int i=1;i<=val;i++)
        {
            if(val%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else {
            return false;
        }
    }

	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=al.size()-1;i>=0;i--)
		{
		    int val=al.get(i);
		    if(isprime(val)==true)
		  {
		      al.remove(i);
		  }
		    
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}