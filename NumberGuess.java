import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int guess, x = 1 + r.nextInt(10);
		
		System.out.println( "I'm thinking of a number from 1 to 10. " );
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();
		
		if ( guess == x )
		{
		System.out.println( "that's right! my secret number was " + x + "!!" );
		}
		if ( guess != x )
		{System.out.println( "sorry but the number i had was " + x + "!!" );
		}
	}
}
		
		
		
		