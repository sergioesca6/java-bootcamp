import java.util.Scanner;

public class BMICalculator
{
	public static void main ( String[] args )
	{
		Scanner Keyboard = new Scanner(System.in);
		double m , kg, bmi;
		
		System.out.print( "Your weight in kg: " );
		kg = Keyboard.nextDouble();
		
		System.out.print( "Your height in m: " );
		m = Keyboard.nextDouble();
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
		
		if ( bmi < 18.5 )
		{
		System.out.println( "your BMI category: underweight " );
		}
		if ( bmi > 18.5 && bmi < 24.9 )
		{
		System.out.println( "your BMI category: normal weight " );
		}
		if ( bmi > 25.0 && bmi < 29.9 )
		{
		System.out.println( "your BMI category: overweight " );
		}
		if ( bmi > 30 )
		{
		System.out.println( "your BMI category: obese " );
		}
	}
}