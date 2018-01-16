import java.util.Scanner;
import java.util.Random;

public class BlackjackTry
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
		
		System.out.println( "|--------------------------------|" );
		System.out.println( "|                                |" );
		System.out.println( "|  SERGIO'S BLACKJACK PROGRAM!!! |" );
		System.out.println( "|                                |" );
		System.out.println( "|________________________________|" );
		Thread.sleep(2000);
		System.out.println( "You get" );
		System.out.println( "|---|   |---|" );
		System.out.println( "| " + a +" |   | " + b + " |" );
		System.out.println( "|___|   |___|" );
		
		Thread.sleep(2000);	
		System.out.println( "|------------|" );
		System.out.println( "|    total   |" );
		System.out.println( "|     " + e +"     |" );
		System.out.println( "|____________|" );
		Thread.sleep(2000);
		System.out.println();
		System.out.println( "The dealer has ");
		System.out.println( "|---|   |---|" );
		System.out.println( "| " + c +" |   | ? |" );
		System.out.println( "|___|   |___|" );
		Thread.sleep(2000);	
		System.out.println( "|------------|" );
		System.out.println( "|    total   |" );
		System.out.println( "|    ???     |" );
		System.out.println( "|____________|" );
		g = e;
		Thread.sleep(2000);
		System.out.println( "Would you like to \"hit\" or \"stay\" ? " );
		answer = keyboard.nextLine();
			if ( answer.equals("hit") )
			{ 
			int u = 2 + r.nextInt(10);
			System.out.println( "You drew a " );
			System.out.println( "|---|" );
			System.out.println( "| " + u + " |" );
			System.out.println( "|___|" );
			Thread.sleep(2000);
			g = e + u;
			System.out.println( "|------------|" );
			System.out.println( "|    new     |" );
			System.out.println( "|    total   |" );
			System.out.println( "|     " + g +"     |" );
			System.out.println( "|____________|" );
			Thread.sleep(2000);
			if ( g > 21 )
			{
			System.out.println( "Busted!!" );
			}
			}
			
				
		System.out.println( "Okay dealers turn." );
		Thread.sleep(2000);
		System.out.println( "The hidden card was a " );
		System.out.println( "|---|" );
		System.out.println( "| " + d + " |" );
		System.out.println( "|___|" );
		Thread.sleep(2000);
		System.out.println( "|------------|" );
		System.out.println( "|    total   |" );
		System.out.println( "|     " + f +"     |" );
		System.out.println( "|____________|" );
		Thread.sleep(2000);
		h = f;
		
		if ( f <= 16 )
		{
		System.out.println( "Dealer chooses to hit" );
		int t = 2 + r.nextInt(10);
		System.out.println( "He draws a " );
		System.out.println( "|---|" );
		System.out.println( "| " + t + " |" );
		System.out.println( "|___|" );
		Thread.sleep(2000);
		h = f + t;
		}
	
		System.out.println( "Dealer Stays." );
		Thread.sleep(2000);
		System.out.println( "|------------|   |------------|" );
		System.out.println( "|    dealer  |   |    your    |" );
		System.out.println( "|    total   |   |    total   |" );
		System.out.println( "|     " + h +"     |   |     " + g + "     |" );
		System.out.println( "|____________|   |____________|" );
		Thread.sleep(2000);
		
		if ( h <= 21 && g <= 21 )
		{
		if ( h > g )
		{
		System.out.println( "|-----------|" );
		System.out.println( "|           |" );
		System.out.println( "|  YOU LOST |" );
		System.out.println( "|           |" );
		System.out.println( "|___________|" );
		}
		else if ( g > h )
		{
		System.out.println( "|-----------|" );
		System.out.println( "|           | " );
		System.out.println( "|  YOU WIN! | " );
		System.out.println( "|           |" );
		System.out.println( "|___________|" );
		}
		}
		if ( g > 21 )
		{
		System.out.println( "|-----------|" );
		System.out.println( "|           | " );
		System.out.println( "|  YOU LOST | " );
		System.out.println( "|           |" );
		System.out.println( "|___________|" );
		}
		if ( h > 21 )
		{
		System.out.println( "|-----------|" );
		System.out.println( "|           | " );
		System.out.println( "|  YOU WIN! | " );
		System.out.println( "|           |" );
		System.out.println( "|___________|" );
		}
		if ( h == g )
		{
		System.out.println( "its a tie!" );
		}
	}
}