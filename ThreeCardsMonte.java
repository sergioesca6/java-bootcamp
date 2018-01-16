import java.util.Scanner;
import java.util.Random;

public class ThreeCardsMonte
{
	public static void main ( String[] args ) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int guess, a = 1 + r.nextInt(3);
		
		System.out.println( "You slide up to Fast Eddie's card table and plop down your cash. " );
		System.out.println( "He glances at you out of the corner of his eye and starts shuffling. " );
		System.out.println( "He lays down three cards " );
		System.out.println();
		System.out.println( "Which one is the ace? " );
		System.out.println();
	    System.out.println( "          ##  ##  ##" );
	    System.out.println( "          ##  ##  ##" );
	    System.out.println("           1   2   3");
	    System.out.print( ">" );
	    guess = keyboard.nextInt();
	    
	    if ( guess == a )
	    {
	    System.out.println( "You nailed it! Fast Eddie hands over your winnings, great job." );
	    }
	    	else if ( guess != a )
	    	{
	   	 	System.out.println( "Ha! Fast Eddie wins! The ace was card number " + a + "!!" );
	    	}	
	    
	    if ( a == 1 )
	    {
	    System.out.println( "          AA  ##  ##" );
	    System.out.println( "          AA  ##  ##" );
	    System.out.println("           1   2   3");
	    }
	     if ( a == 2 )
	    {
	    System.out.println( "          ##  AA  ##" );
	    System.out.println( "          ##  AA  ##" );
	    System.out.println("           1   2   3");
	    }
	     if ( a == 3 )
	    {
	    System.out.println( "          ##  ##  AA" );
	    System.out.println( "          ##  ##  AA" );
	    System.out.println("           1   2   3");
	    }
	}
}
	    