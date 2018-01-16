import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
	public static void main ( String[] args ) throws InterruptedException
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int a = 2 + r.nextInt(10), b = 2 + r.nextInt(10), c = 2 + r.nextInt(10), d = 2 + r.nextInt(10);
		//Four cards handed out.
		int e = a + b, f = c + d, g = 0, h = 0; 
		// totals g is the user's and h is the dealer's.
		String answer;
		
		System.out.println( "Welcome to Sergio's Blackjack program" );
		Thread.sleep(2000);
		System.out.println( "You get a " + a + " and a " + b + "." );
		Thread.sleep(2000);
		System.out.println( "Your total is " + e + "." );
		Thread.sleep(2000);
		System.out.println();
		System.out.println( "The dealer has a " + c + " showing, and a hidden card too. his total is also hidden." );
		g = e;
		Thread.sleep(2000);
		System.out.println( "Would you like to \"hit\" or \"stay\" ? " );
		answer = keyboard.nextLine();
			if ( answer.equals("hit") )
			{ 
			int u = 2 + r.nextInt(10);
			System.out.println( "You drew a " + u + "." );
			Thread.sleep(2000);
			g = e + u;
			System.out.println( "Your total is " + g + "." );
			Thread.sleep(2000);
			if ( g > 21 )
			{
			System.out.println( "Busted!!" );
			}
			}
			
				
		System.out.println( "Okay dealers turn." );
		Thread.sleep(2000);
		System.out.println( "The hidden card was a " + d + "." );
		Thread.sleep(2000);
		System.out.println( "His total was a " + f + "." );
		Thread.sleep(2000);
		h = f;
		
		if ( f <= 16 )
		{
		System.out.println( "Dealer chooses to hit" );
		int t = 2 + r.nextInt(10);
		System.out.println( "He draws a " + t + "." );
		Thread.sleep(2000);
		h = f + t;
		System.out.println( "His total is " + h + "." );
		Thread.sleep(2000);
		}
	
		System.out.println( "Dealer Stays." );
		Thread.sleep(2000);
		System.out.println( "Dealer total is " + h + "." );
		Thread.sleep(2000);
		System.out.println( "Your total is " + g + "." );
		Thread.sleep(2000);
		
		if ( h <= 21 && g <= 21 )
		{
		if ( h > g )
		{
		System.out.println( "You lost!" );
		}
		else if ( g > h )
		{
		System.out.println( "YOU WIN!!!" );
		}
		}
		if ( g > 21 )
		{
		System.out.println( "YOU LOSE" );
		}
		if ( h > 21 )
		{
		System.out.println( "YOU WIN!!" );
		}
		if ( h == g )
		{
		System.out.println( "its a tie!" );
		}
	}
}