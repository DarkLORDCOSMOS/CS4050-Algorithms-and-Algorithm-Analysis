import java.util.Scanner;
import java.math.BigInteger;

public class PascalDynProg {

   private static BigInteger[][] chart;

   public static void main(String[] args) {
      Scanner keys = new Scanner( System.in );
      System.out.print("enter n: ");
      BigInteger n = new BigInteger( keys.nextLine() );
      System.out.print("enter k: ");
      BigInteger k = new BigInteger( keys.nextLine() );

      // build empty chart for size of main problem:
      chart = new BigInteger[ n.intValue()+1 ][ k.intValue()+1 ];

      System.out.println("n choose k is " + pascal(n,k) );
   }
   
   private static BigInteger pascal(BigInteger n, BigInteger k) {
      if (k.equals(BigInteger.ZERO) ||
          k.equals(n) ) {
         return BigInteger.ONE;
      }
      else {
         // if desired answer is in chart, use it
         BigInteger temp = chart[ n.intValue() ][ k.intValue() ];
         if ( temp != null )
            return temp;
        
         BigInteger n1 = n.subtract(BigInteger.ONE);
         BigInteger k1 = k.subtract(BigInteger.ONE);
         chart[ n.intValue() ][ k.intValue() ] = 
                    pascal(n1,k1).add( pascal(n1,k));
         return chart[ n.intValue() ][ k.intValue() ];
      }
   }
}
