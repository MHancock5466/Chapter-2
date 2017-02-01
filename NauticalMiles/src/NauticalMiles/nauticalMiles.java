/**
 * 
 */
package NauticalMiles;

/**
 * @author mh137428
 *
 */
import javax.swing.JOptionPane;
public class nauticalMiles 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String answer;
		double kilometersPerNM = 1.852;
		double milesPerNM = 1.150779;
		double nauticalMiles;
		double kilometers;
		double miles;
		
		answer = JOptionPane.showInputDialog(null, "How many nautical miles will you be travling?", "Distance for Travel", 
				JOptionPane.QUESTION_MESSAGE);
		nauticalMiles = Integer.parseInt(answer);
		
		kilometers = kilometersPerNM * nauticalMiles;
		miles = milesPerNM * nauticalMiles;
		
		JOptionPane.showMessageDialog(null, "You will be traveling " + miles + " miles (" + kilometers + " kilometers).");
	}

}
