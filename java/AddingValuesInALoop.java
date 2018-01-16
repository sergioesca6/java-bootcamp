import java.util.Scanner;

public class AddingValuesInALoop
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int give = keyboard.nextInt(), total = 0;
		
		System.out.println( "I will add up the numbers you give me." );
		
		while ( give != 0 )
			{
			System.out.print( "Number: " );
			give = keyboard.nextInt();
			total = give + total;
			System.out.println( "The total so far is " + total );
			}
			
		System.out.println( "The total is " + total );
		
	}
}