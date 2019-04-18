package Project_30;

import java.util.Scanner;
import java.math.BigInteger;

public class Pascal {

   public static void main(String[] args) {
      Scanner keys = new Scanner( System.in );
      System.out.print("enter n: ");
      BigInteger n = new BigInteger( keys.nextLine() );
      System.out.print("enter k: ");
      BigInteger k = new BigInteger( keys.nextLine() );

      System.out.println("n choose k is " + pascal(n,k) );
   }
   
   private static BigInteger pascal(BigInteger n, BigInteger k) {
      if (k.equals(BigInteger.ZERO) ||
          k.equals(n) ) {
         return BigInteger.ONE;
      }
      else {
         BigInteger n1 = n.subtract(BigInteger.ONE);
         BigInteger k1 = k.subtract(BigInteger.ONE);
         return pascal(n1,k1).add( pascal(n1,k));
      }
   }
}
