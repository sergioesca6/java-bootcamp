import java.util.Scanner;

public class 2Questions
{
	public static void main ( String[] args )
	{
		Scanner.keyboard = new Scanner(System.in);
		
		String type, big;
		
		System.out.println( " 2 questions!! " );
		System.out.println( " Think of an object, and I'll try to guess it. " );
		System.out.println( "Q1) is it an animal, vegetable, or mineral? " );
		type = keyboard.next();
		
		System.out.println( " Q2) is it bigger than a shoebox? " );
		big = keyboard.next();
		
		if ( type = animal && big = yes )
		{
		System.out.println( " You're thinking of a dog!! " );
		}
		if ( type = animal && big = no )
		{
		System.out.println( " You're thinking of a squirrel!! " );
		}
		if ( type = vegetable && big = yes )
		{
		System.out.println( " You're thinking of a pumpkin!! " );
		}
		if ( type = vegetable && big = no )
		{
		System.out.println( " You're thinking of a carrot!! " );
		}
		if ( type = mineral && big = yes )
		{
		System.out.println( " You're thinking of a car !! " );
		}
		if ( type = mineral && big = no )
		{
		System.out.println( " You're thinking of a paperclip!! " );
		}
		
		System.out.println( " I would ask you if I'm right, but I don't actually care. " );
	}
}