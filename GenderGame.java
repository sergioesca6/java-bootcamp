import java.util.Scanner;

public class GenderGame
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String gender, first, last, Status;
		
		System.out.print( " What is your gender (M or F): " );
		gender = keyboard.next();
		
		System.out.print( " First name: " );
		first = keyboard.next();
		
		System.out.print( " Last name: " );
		last = keyboard.next();
		
		System.out.print( "Age: " );
		age = keyboard.nextInt();
		
		if ( age > 20 && gender.equals("M") )
		{
		System.out.println( "Then i shall call you Mr." + last + "." );
		}
		
		if ( age > 20 && gender.equals("F") )
		{
		System.out.println( "Are you married, " + first + " (y or n)? " );
		}
			else 
			{ 
			System.out.println( "Then i shall call you " + first + " " + last + "." );
			}
		Status = keyboard.next();
		
		if ( Status.equals("y") )
		{
		System.out.println( "Then i shall call you Mrs." + last + "." );
		}
		if ( Status.equals("n") )
		{
		System.out.println( "Then i shall call you Ms." + last + "." );
		}
	}
}
		 
		
