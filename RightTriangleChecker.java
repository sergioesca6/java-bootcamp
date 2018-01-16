import java.util.Scanner;

public class RightTriangleChecker
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println( "Enter three integers: " );
		System.out.print( "Side 1: " );
		a = keyboard.nextInt();
		System.out.print( "\n Side 2: " );
		b = keyboard.nextInt();
		
		while ( a > b )
		{
		System.out.println( b + " is smaller than " + a + ". Try again. " );
		System.out.print( "\n Side 2: " );
		b = keyboard.nextInt();
		}
		System.out.print( "\n Side 3: " );
		c = keyboard.nextInt();
		
		while ( b > c )
		{
		System.out.println( c + " is smaller than " + b + ". Try again. " );
		System.out.print( "\n Side 3: " );
		c = keyboard.nextInt();
		}
		
		System.out.println( "Your Three sides are " + a + " " + b + " " + c );
		
		if ( a < b && b < c )
		{
		System.out.println( "These sides *do* make a right triangle." );
		}
		 	else 
		 	{
		 	System.out.println( "NO!  These sides do not make a right triangle!" );
		 	}
	}
}
		