import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main ( String[] args )
	{
	 Scanner keyboard = new Scanner(System.in);
	 
	 System.out.print( "Count From : " );
	 int x = keyboard.nextInt();
	 System.out.print( "Count to : " );
	 int y = keyboard.nextInt();
	 System.out.print( "Count by : " );
	 int n = keyboard.nextInt();
	 
	 	for ( int c = x ; c <= y ; c = c+n )
	 	{
		 System.out.print( " " + c + " " );
	 	}
	 	System.out.println();
	 }
}	
	 