import java.util.Random;

public class FortuneCookie
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		
		int s = 1 + r.nextInt(5), a = 1 + r.nextInt(54), b = 1 + r.nextInt(54), c = 1 + r.nextInt(54), d = 1 + r.nextInt(54), e = 1 + r.nextInt(54), f = 1 + r.nextInt(54);
		
		if ( s == 1 )
		{
		System.out.println( "Fortune Cookie says: \"You will find happiness with a new love.\"" );
		}  
		if ( s == 2 )
		{
		System.out.println( "Fortune Cookie says: \"leave your past behind, and find something better.\"" );
		}  
		if ( s == 3 )
		{
		System.out.println( "Fortune Cookie says: \"do the best you can each and everyday.\"" );
		}  
		if ( s == 4 )
		{
		System.out.println( "Fortune Cookie says: \"strive for greatness and nothing else.\"" );
		}  
		if ( s == 5 )
		{
		System.out.println( "Fortune Cookie says: \"everything will come to you, eventually.\"" );
		}  
		
		System.out.println( a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f );
	}
}