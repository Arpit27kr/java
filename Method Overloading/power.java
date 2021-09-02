/*6.	Write a set of overloaded functions power() that returns the Xn where n is integer and X may be int and float.
 * 
 */


import java.util.*;
public class power
{
    public int Power(int a,int n)
    {
    	int fn4=(int)Math.pow(a,n);
            return fn4;
    }
    public float Power(int a,float n)
    {
    	float fn4=(float)Math.pow(a,n);
        return fn4;
       
    }
    public static void main(String []args)
    {
        int a,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number : ");
        a=sc.nextInt();
        System.out.print("Enter A Power : ");
        n=sc.nextInt();
        power jp=new power();
        System.out.println(  jp.Power(a,n));
      
    }
} 