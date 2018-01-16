
import javax.swing.JOptionPane;

/**
 * A test class for the ChangeMaker class
 */
public class ChangeMakerTester
{
   public static void main(String[] args)
   {
      double amountDue;         // total cost of purchases
      double amountPaid;        // amount paid
      String input;             // user input
      
      // get amount due and amount paid from user

      input = JOptionPane.showInputDialog("What is the amount due?");

      amountDue = Double.parseDouble(input) ;

      input = JOptionPane.showInputDialog("What is the amount paid?");

      amountPaid = Double.parseDouble(input);

      // create a ChangeMaker object (myChangeMaker) using these values
      ChangeMaker myChangeMaker = new ChangeMaker(amountDue, amountPaid);

      // call computeChange method for myChangeMaker object
      myChangeMaker.computeChange();

	   System.exit(0) ;
   }
}   // end of ChangeMakerTester class declaration
