import java.util.Scanner;

public class SpaceBoxing 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
	    int weight, number;
	    double a, b, c, d, e, f;
	    
	    System.out.print( "Please enter your current earth weight: " );
	    weight = keyboard.nextInt();
	    
	    System.out.println( "I have information for the following planets: " );
	    System.out.println( " \t 1.Venus \t 2.Mars \t 3.Jupiter " ); 
	    System.out.println( " \t 4.Saturn \t 5.Uranus \t 6.Neptune " );
	   
	    System.out.print( " which planet are you visiting? " );
	    number = keyboard.nextInt();
	    
	    a = number * 0.78;
	    b = number * 0.39;
	    c = number * 2.65;
	    d = number * 1.17;
	    e = number * 1.05;
	    f = number * 1.23;
	    
	    if ( number == 1 )
	    {
	    System.out.println( "Your weight would be " + a + " pounds on that planet." );
	    }
	    
	    if ( number == 2 )
	    {
	    System.out.println( "Your weight would be " + b + " pounds on that planet." );
	    }
	    
	    if ( number == 3 )
	    {
	    System.out.println( "Your weight would be " + c + " pounds on that planet." );
	    }
	    
	    if ( number == 4 )
	    {
	    System.out.println( "Your weight would be " + d + " pounds on that planet." );
	    }
	    
	    if ( number == 5 )
	    {
	    System.out.println( "Your weight would be " + e + " pounds on that planet." );
	    }
	    
	    if ( number == 6 )
	    {
	    System.out.println( "Your weight would be " + f + " pounds on that planet." );
	    }
	    }
}