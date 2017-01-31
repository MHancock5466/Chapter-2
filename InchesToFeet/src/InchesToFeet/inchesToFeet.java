/**
 * 
 */
package InchesToFeet;

import javax.swing.JOptionPane;

/**
 * @author mh137428
 *
 */
public class inchesToFeet 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String answer;
		int inches;
		int inchesInFeet = 12;
		int inchesLeft;
		int feet;
				
		answer = JOptionPane.showInputDialog(null, "How many inches?", "Total Inches", JOptionPane.QUESTION_MESSAGE);
		inches = Integer.parseInt(answer);
		
		feet = inches/inchesInFeet;
		inchesLeft = inches%inchesInFeet;
		
		JOptionPane.showMessageDialog(null, feet + " feet and " + inchesLeft + " inches");
		
	}

}
