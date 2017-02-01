/**
 * 
 */
package QuartsToGallons;

/**
 * @author mh137428
 *
 */
import javax.swing.JOptionPane;
public class quartsToGallonsInteractive
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	String quarts;
	int quartsToGallons = 4;
	int quartsNeeded;
	int quartsTotal;
	int quartsLeft;
	
	quarts = JOptionPane.showInputDialog(null, "Please enter necessary quarts >> ", "Place your order here", JOptionPane.QUESTION_MESSAGE);
	quartsNeeded = Integer.parseInt(quarts);
	
	quartsTotal = quartsNeeded/quartsToGallons;
	quartsLeft = quartsNeeded%quartsToGallons;
	
	JOptionPane.showMessageDialog(null, "You will need " + quartsTotal + " gallons and " + quartsLeft + " quarts.");
	}

}
