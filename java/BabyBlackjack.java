import java.util.Random;

public class BabyBlackjack
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		
		int x = 1 + r.nextInt(10);
		int b = 1 + r.nextInt(10);
		int a = 1 + r.nextInt(10);
		int k = 1 + r.nextInt(10);
		int y = x + b;
		int m = a + k;
		
		System.out.println( "Baby Blackjack" );
		
		System.out.println( "You drew a " + x + " and " + b );
		System.out.println( "Your total is " + y );
		
		System.out.println( "The dealer has " + a + " and " + k );
		System.out.println( "Dealer's total is " + m );
		
		if ( y > m )
		{
		System.out.println( "YOU WINN!!" );
		}
		else if ( m > y )
		{
		System.out.println( "YOU LOST!" );
		}
		else 
		{
		System.out.println( "TIE" );
		}
	}
}		