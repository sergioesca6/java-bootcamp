import java.util.Scanner;

public class CollatzSequence
{
	public static void main ( String[] args )
	{
	Scanner keyboard = new Scanner(System.in);
	int n, counter = 0;
	
	System.out.print( "Starting number: " );
	n = keyboard.nextInt();
	
		while ( n != 1 )
		{
			if ( n % 2 == 0 )
			{
			n = n / 2;
			System.out.println(n);
			}
				else
				{
				n = n * 3 + 1;
				System.out.println(n);
				}
		counter++;
		}
		System.out.println("this finished after " + counter + " Steps." );
	}
}		