import java.util.Scanner;

public class Questions2
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String type, big;
		
		System.out.println( " 2 questions!! " );
		System.out.println( " Think of an object, and I'll try to guess it. " );
		System.out.println( "Q1) is it an animal, vegetable, or mineral? " );
		type = keyboard.next();
		
		System.out.println( "Q2) is it bigger than a shoebox? " );
		big = keyboard.next();
		
		if ( type.equals("animal") && big.equals("yes") )
		{
		System.out.println( " You're thinking of a dog!! " );
		}
		if ( type.equals("animal") && big.equals("no") )
		{
		System.out.println( " You're thinking of a squirrel!! " );
		}
		if ( type.equals("vegetable") && big.equals("yes") )
		{
		System.out.println( " You're thinking of a pumpkin!! " );
		}
		if ( type.equals("vegetable") && big.equals("no") )
		{
		System.out.println( " You're thinking of a carrot!! " );
		}
		if ( type.equals("mineral") && big.equals("yes") )
		{
		System.out.println( " You're thinking of a car !! " );
		}
		if ( type.equals("mineral") && big.equals("no") )
		{
		System.out.println( " You're thinking of a paperclip!! " );
		}
		
		System.out.println( " I would ask you if I'm right, but I don't actually care. " );
	}
}