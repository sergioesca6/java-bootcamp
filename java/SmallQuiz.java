import java.util.Scanner;

public class SmallQuiz
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int first, second, third;
		
		System.out.println( " Are you ready for a quiz? " );
		keyboard.next();
		
		System.out.println( " Okay here it comes! " );
		
		System.out.println( "Q1) What is the capital of the U.S.A? " );
		System.out.println( "     1) Washington D.C. " );
		System.out.println( "     2) Colorado " );
		System.out.println( "     3) New York " );
		System.out.print( ">" );
		first = keyboard.nextInt();
		
		if ( first == 1 )
		{
		System.out.println( " good job!! " );
		}
		if ( first == 2 )
		{
		System.out.println( " oops! the correct answer is Washington D.C. " );
		}
		if ( first == 3 )
		{
		System.out.println( " oops! the correct answer is Washington D.C. " );
		}
		
		System.out.println( "Q2) The world cup is played every 3 years. " );
		System.out.println( "     1) true " );
		System.out.println( "     2) false  " );		
		System.out.print( ">" );
		second = keyboard.nextInt();
		
		if ( second == 1 )
		{
		System.out.println( " oops! the statement is false. " );
		}
		if ( second == 2 )
		{
		System.out.println( " good job!! " );
		}
		
		System.out.println( "Q3) What is the result of 9+6/3? " );
		System.out.println( "     1) 5 " );
		System.out.println( "     2) 11 " );
		System.out.println( "     3) 15/3 " );
		System.out.print( ">" );
		third = keyboard.nextInt();
		    
	    if ( third == 1 )
		{
		System.out.println( " oops! the correct answer is 11 " );
		}
		if ( third == 2 )
		{
		System.out.println( " great job!! " );
		}
		if ( third == 3 )
		{
		System.out.println( " oops! the correct answer is 11 " );
		}
	
		if ( first == 1 && second == 2 && third == 2 )
		{
		System.out.println( "Overall, you got 3 out of 3 correct. good job! " );
		}
	    if ( first == 2 && second == 2 && third == 2 )
	    {
	    System.out.println( "Overall, you got 2 out of 3 correct. " );
	    }
	    if ( first == 3 && second == 2 && third == 2 )
	    {
	    System.out.println( "Overall, you got 2 out of 3 correct. " );
	    }
	    if ( first == 1 && second == 1 && third == 2 )
        {
	    System.out.println( "Overall, you got 2 out of 3 correct. " );
	    }
	    if ( first == 1 && second == 1 && third == 1 )
        {
	    System.out.println( "Overall, you got 1 out of 3 correct. " );
	    }
        if ( first == 1 && second == 1 && third == 3 )
        {
	    System.out.println( "Overall, you got 1 out of 3 correct. " );
	    }
	    if ( first == 1 && second == 2 && third == 1 )
        {
	    System.out.println( "Overall, you got 2 out of 3 correct. " );
	    }
	}
}