import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class big_integer {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
    }
}