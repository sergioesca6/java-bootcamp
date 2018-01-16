import java.util.Scanner;

public class WeaselOrNot
{ 
	public static void main ( String[] args )
	{
		Scanner Keyboard = new Scanner(System.in);
		
		String word;
		boolean yep, nope;
		
		System.out.println( " type the word \"joy\" please? " );
		word= Keyboard.next();
		
		yep = word.equals("joy");
		nope = ! word.equals("joy");
		
		System.out.println( "You typed what was requested: " + yep );
		System.out.println( "You ignored polite instructions: " + nope );
	}
}