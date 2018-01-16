import java.util.Scanner;

public class AreaCalculator
{
	public static void main ( String[] args ) 
	{
	Scanner kb = new Scanner(System.in);	
	
	System.out.println( "WELCOME TO SERGIO'S AREA CALCULATOR!! " );
	System.out.println( "1) triangle " );
	System.out.println( "2) Rectangle " );
	System.out.println( "3) Square " );
	System.out.println( "4) Circle " );
	System.out.println( "5) Quit " );
	System.out.println( "Choose a number: " );
	
	int shape = 0;
	
	while ( shape <= 4 )
	{
	shape = kb.nextInt();
		
		if ( shape == 1 )
		{
		int base, height;
		System.out.println( "base: " );
		base = kb.nextInt();
	
		System.out.println( "height: " );
		height = kb.nextInt();
		double areat = (base* height)/2;
		System.out.println( "The area of the triangle is " + areat );
	
		}
	
		else if ( shape == 2 )
		{
		int length, width;
		System.out.println( "length: " );
		length = kb.nextInt();
	
		System.out.println( "width: " );
		width = kb.nextInt();
	    int arear = length*width;
		System.out.println( "The area of the rectangle is " + arear );
	
		}
	
		else if ( shape == 3 )
		{
		int side;
		System.out.println( "side: " );
		side = kb.nextInt();
	    int areas = side*side;
		System.out.println( "The area of the square is " + areas );
	
		}
	
		else if ( shape == 4 )
		{
		double radius;
	
		System.out.println( "radius: " );
		radius = kb.nextDouble();
	    double areac = Math.PI * (radius * radius);
		System.out.println( "The area of the circle is " +  areac );
		}
	System.out.println( "WELCOME TO SERGIO'S AREA CALCULATOR!! " );
	System.out.println( "1) triangle " );
	System.out.println( "2) Rectangle " );
	System.out.println( "3) Square " );
	System.out.println( "4) Circle " );
	System.out.println( "5) Quit " );
	System.out.println( "Choose a number: " );
	
	}
	
	
	if ( shape == 5 )
	{
	System.out.println( "goodbye");
	}
	
	
	}
}