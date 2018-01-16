import java.util.Scanner;
  
  public class Permision
  {
      public static void main( String[] args )
      {
          Scanner keyboard = new Scanner(System.in);
  
         int age;
         double income, attractiveness;
         boolean allowed;
 
         System.out.print( "Enter your age: " );
         age = keyboard.nextInt();
 
         System.out.print( "Enter your yearly income: " );
         income = keyboard.nextDouble();
 
         System.out.print( "How attractive are you, on a scale from 0.0 to 10.0? " );
         attractiveness = keyboard.nextDouble();
 
         allowed = ( age > 25 && income > 40000 && attractiveness >= 8 );
 
         System.out.println( "You are allowed to date my grandchild: " + allowed );
      }
}