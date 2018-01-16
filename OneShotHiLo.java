import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int guess, a = r.nextInt(100);
		
		System.out.println( "I'm thinking of a number between 1-100.  Try to guess it." );
		System.out.print( ">" );
		guess = keyboard.nextInt();
		
		if ( guess > a ) 
		{
		System.out.println( "Sorry, you are too high.  I was thinking of " + a );
		}
		if ( guess < a ) 
		{
		System.out.println( "Sorry, you are too low.  I was thinking of " + a );
		}
		if ( guess == a ) 
		{
		System.out.println( "You guessed it right!! What are the odds?!?!?!?" );
		}
	}
}