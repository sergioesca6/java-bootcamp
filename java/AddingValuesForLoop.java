import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int b = 0;
		System.out.print( "number: " );
		int n = keyboard.nextInt();
	
		for ( int x = 1 ; x <= n ; x = x+1 )
		{
	     System.out.print( "\n" + x );
	     b = b + x;
	    }
	     System.out.println( "\nthe sum is " + b );
	}
}