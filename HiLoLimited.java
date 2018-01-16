import java.util.Scanner;
import java.util.Random;

public class HiLoLimited
{
	public static void main ( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
	
		int a = 1 + r.nextInt(100), guess, tries = 1, b = 1;
		
		System.out.println( "I'm thinking of a number between 1-100. You have 7 guesses. " );
		System.out.print( "first guess: " );
		guess = keyboard.nextInt();
		tries++;
		
		while ( guess != a && tries <= 7 )
		{
		b++;
		System.out.print( "Guess #" + b + ": " );
		guess = keyboard.nextInt();
		tries++;
		}
	    
	    if ( guess == a && tries >= 7 )
	    {
	    System.out.println( "good job! you guessed it right" );
	    }
	     else if ( guess != a && tries >= 7 )
	     {
	     System.out.println( "Sorry, you didn't guess it in 7 tries.  You lose. " );
	     }
	     
	}
}
		