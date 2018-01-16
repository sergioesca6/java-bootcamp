import java.util.Scanner;

public class KeepGuessingCounter
{
	public static void main ( String[] args )
	{
	
		Scanner keyboard = new Scanner(System.in);
		int number, x, count;
		x = 4;
		count = 1;
		
		System.out.println( "I have chosen a number between 1 and 10. Try to guess it." );
		System.out.print( "Your Guess: " );
		number = keyboard.nextInt();
		if ( number == x )
		{
		System.out.println( "It only took you 1 try!!" );
		}
		else 
		{
		do
		{
			count++;
			System.out.println( "That was incorrect. Guess again." );
			System.out.print( "Your Guess: " );
			number = keyboard.nextInt();
		} while ( number != x );
		
		System.out.println( "That's right!! You're a good guesser. " );
		
		if ( number == x )
			{
			System.out.println( "It only took you " + count + " tries!" );
			}
		}
	}
}
