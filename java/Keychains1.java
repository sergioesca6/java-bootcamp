import java.util.Scanner;

public class Keychains1
{

	public static void main ( String[] args )
	{
	
	Scanner kb = new Scanner(System.in);
	
	System.out.println( "Keychain shop" );
	System.out.println( "1. Add Keychains to Order" );
	System.out.println( "2. Remove Keychains from Order" );
	System.out.println( "3. View Current Order" );
	System.out.println( "4. Checkout" );
	System.out.println( "\n Please enter your choice: " );
	int choice = kb.nextInt();
	
	
	while ( choice <= 4)
	{
		
	if ( choice == 1)
	{
	add_keychain();
	}

	else if (choice == 2)
	{
	remove_keychain();
	}
	
    else if (choice == 3)
	{
	view_order();	
	}
	
    else if (choice == 4)
    {
    checkout();
    }
    
    }
    
    }
    
    public static void add_keychain()
    {
    Scanner kb = new Scanner(System.in);
    System.out.println( "\nADD KEYCHAINS" );
	System.out.println( "\n1. Add Keychains to Order" );
	System.out.println( "2. Remove Keychains from Order" );
	System.out.println( "3. View Current Order" );
	System.out.println( "4. Checkout" );
	System.out.println( "\n Please enter your choice: " );
	int choice = kb.nextInt();
	
	}
	
	public static void remove_keychain()
    {
    Scanner kb = new Scanner(System.in);
    System.out.println( "\nREMOVE KEYCHAINS" );
	System.out.println( "\n1. Add Keychains to Order" );
	System.out.println( "2. Remove Keychains from Order" );
	System.out.println( "3. View Current Order" );
	System.out.println( "4. Checkout" );
	System.out.println( "\n Please enter your choice: " );
	int choice = kb.nextInt();
	
	}
	
	public static void view_order()
    {
    Scanner kb = new Scanner(System.in);
    System.out.println( "\nVIEW ORDER" );
	System.out.println( "\n1. Add Keychains to Order" );
	System.out.println( "2. Remove Keychains from Order" );
	System.out.println( "3. View Current Order" );
	System.out.println( "4. Checkout" );
	System.out.println( "\n Please enter your choice: " );
	int choice = kb.nextInt();
	
	}
	
	public static void checkout()
    {
    System.out.println( "\nCHECKOUT!" );
	}
	
}