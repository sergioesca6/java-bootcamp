import java.util.Random;

public class DiceDoubles
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		int a = 1 + r.nextInt(6), b = 1 + r.nextInt(6), c = a + b;
		
		System.out.println( "HERE COMES THE DICE!" );
		
		do
		{
		a = 1 + r.nextInt(6);
		b = 1 + r.nextInt(6);
		c = a + b;
		System.out.println( "Roll #1: " + a );
		System.out.println( "Roll #2: " + b );
		System.out.println( "The total is " + c );
		} while ( a != b );
	}
}