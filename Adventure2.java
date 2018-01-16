import java.util.Scanner;

public class Adventure2
{ 
	public static void main ( String[] args )
	{
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println( "Sergio's Adventure!!" );
	
	int next = 1;
	String choice = " ";
	
		do
		{
			if ( next == 1 )
			{
			System.out.println( "You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"? " );
			System.out.print( ">" );
			choice = keyboard.nextLine();
			if ( choice.equals("upstairs") )
				next = 2;
			else if ( choice.equals("kitchen") )
				next = 3;
			else 
			System.out.println( choice + " wasn't one of the options. Try again." );
			}
		
			if ( next == 2 )
			{
			System.out.println( "Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can go back \"downstairs\". Where would you like to go? " );
			System.out.print( ">" );
			choice = keyboard.nextLine();
			if ( choice.equals("bedroom") )
				next = 4;
			else if ( choice.equals("bathroom") )
				next = 5;
			else if ( choice.equals("downstairs") )
				next = 1;
			else
			System.out.println( choice + " wasn't one of the options. Try again." );
			}
		
			if ( next == 3 )
			{
			System.out.println( "There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\" or go \"back\". " );
			System.out.print( ">" );
			choice = keyboard.nextLine();
			if ( choice.equals("refrigerator") )
				next = 6;
			else if ( choice.equals("back") )
				next = 1;
			else 
			System.out.println( choice + " wasn't one of the options. Try again." );
			}
		
			if ( next == 4 )
			{
			System.out.println( "empty room! nothing to do here go \"back!\" " );
			System.out.print( ">" );
			choice = keyboard.nextLine();
			if ( choice.equals("back") )
				next = 2;
			else 
			System.out.println( choice + " wasn't one of the options. Try again." );
			}
		
			if ( next == 5 )
			{
			System.out.println( "wow!! you've found a guy with a chainsaw and he doesn't like you disturbing him so he cuts you in half!!" );
			next = 0;
			}
		
			if ( next == 6 )
			{
			System.out.println( "Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")" );
			System.out.print( ">" );
			choice = keyboard.nextLine();
			if ( choice.equals("yes") )
				next = 7;
			else if ( choice.equals("no") )
				next = 3;
			else 
			System.out.println( choice + " wasn't one of the options. Try again." );
			}
		
			if ( next == 7 )
			{
			System.out.println( "The food is slimy and foul, but you manage to choke it down. Your stomach starts jumping like a frog in hot water.  You feel faint. Sliding to the floor, the darkness closes in." );
			next = 0;
			}
		}
			while ( next != 0 );

			System.out.println( "You died" );
	}
}
		
	