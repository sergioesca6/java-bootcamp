import java.util.Scanner;

public class RudeQuestions
{
	public static void main ( String[] args )
	{
		String name;
		int age;
		double weight, income;
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print( "Hello what is your name? " );
		name = Keyboard.next();
		
		System.out.print( "hi, " + name + "! how old are you? " );
		age = Keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", thats not old at all." );
		System.out.print( "How much do you weight, " + name + "? ");
		weight = Keyboard.nextDouble();
		
		System.out.print( weight + "!! better keep that quiet. finally what is your income, " + name + "? " );
		income = Keyboard.nextDouble();
		
		System.out.println( "well, " + income + " is not bad at all!!" );
		System.out.println( "thank you for answering my questions, " + name + "." );
	}
}