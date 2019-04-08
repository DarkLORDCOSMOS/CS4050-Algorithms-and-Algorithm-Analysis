import java.math.BigInteger;
import java.util.Scanner;

public class GCD_v2
{
  private static BigInteger zero = new BigInteger("0");
  private static BigInteger one = new BigInteger("1");

  public static void main(String[] args)
  {
    Scanner keys = new Scanner( System.in );
    System.out.println("This program will find the GCD of two positive integers");
    System.out.println("Enter a---the larger of the two integers:\n");
    BigInteger a = new BigInteger( keys.nextLine() );
    System.out.println("\nEnter b---the smaller of the two integers:\n");
    BigInteger b = new BigInteger( keys.nextLine() );

    BigInteger[][] table = new BigInteger[100][7];

    table[0][0] = a;  table[0][1] = b;

    // fill in the first four columns going down to get the gcd:
    int row = 0;
    while( table[row][1].compareTo(zero) > 0 )
    {
      table[row][2] = table[row][0].mod( table[row][1] );  		// remainder
      table[row][3] = table[row][0].divide( table[row][1] );  	// quotient
      table[row+1][0] = table[row][1];  						// shift over for next row
      table[row+1][1] = table[row][2];							// 
      row++;
    }

    // go from last row up, filling in the multipliers
 
    // bottom row multipliers are [1 0] or [1 1]
    if( row % 2 == 1 )
    {
      table[row][4] = one;
      table[row][5] = zero;
    }
    else
    {
      table[row][4] = one;
      table[row][5] = one;
    }

    // now loop upward
    for( int r=row-1; r>=0; r-- )
    {
      table[r][4] = table[r+1][5];
      table[r][5] = table[r+1][4].subtract( table[r+1][5].multiply( table[r][3] ) );
      table[r][6] = table[r][4].multiply(table[r][0]).add(table[r][5].multiply(table[r][1]));
    }

    // display the entire table:
    System.out.printf("\n%10s %10s %10s %10s %10s %10s %10s\n\n", "a", "b", "r = a % b", "q = a / b", "s", "t", "sa + tb");
    for( int r=0; r<=row; r++ )
    {
      System.out.printf("%10d %10d %10d %10d %10d %10d %10d\n", table[r][0], table[r][1],
                                                 table[r][2], table[r][3],
                                                 table[r][4], table[r][5], table[r][6] );
    } 

	
	
  }
}
