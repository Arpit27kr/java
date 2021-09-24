import java.io.*;
import java.util.*;

public class tower_of_hanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int t1id=input.nextInt();
        int t2id=input.nextInt();
        int t3id=input.nextInt();
        toh(n,t1id,t2id,t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        
        if(n==0)
        {
            return;
        }
        
        toh(n-1,t1id,t3id,t2id);//shifting n-1 (2,1) from tower 1 to tower 3 using tower 2
        System.out.println(n+"shifting last disc "+t1id+ " -> "+t2id+"]");//shifting last disc(3) from tower 1 to tower 2 using tower 3
        toh(n-1,t3id,t2id,t1id);//shifting (1,2) disc from tower 3 to tower 2 using tower 1
        
    }

}
