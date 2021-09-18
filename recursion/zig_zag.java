import java.io.*;
import java.util.*;

public class zig_zag {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        
        if(n==0)
        {
            return;
        }
        System.out.print(n+ " ");
        pzz(n-1);
        System.out.print(n+ " ");
        pzz(n-1);
        System.out.print(n+ " ");
        
        
    }

}