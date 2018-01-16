import java.util.Scanner;

public class Learning
{
	public static void main ( String[] args )
	{
		String name, flight, destination;
		int number;
		double time;
	
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print( "Hello, what is your name? " );
		name = Keyboard.next();
		
		System.out.print( name + " ! where are you heading today? " );
		destination = Keyboard.next();
		
		System.out.println( "that is great do you have the flight number? " );
		number = Keyboard.nextInt();
		
		System.out.print( "ok " + name + " do you happen to know at what time the flight leaves? " );
		time = Keyboard.nextDouble();
		
		System.out.println( name + " here is your ticket. " );
		System.out.println( "+---------------------------------------------------------+" );
        System.out.println( "|                                                         |" );
        System.out.println( "|                                                         |" );
        System.out.println( "|                                                         |" );
        System.out.println( "|                                                         |" );
        System.out.println( "|                                                         |" );
        System.out.println( "|                " + name + "                                   |" );
        System.out.println( "|                " + number + destination + "                               |" );         
        System.out.println( "|                " +  time + "                                      |" );
        System.out.println( "|                                                         |" );
        System.out.println( "+---------------------------------------------------------+" );
	}
}
	