/**
 * 
 */
package Initials;

/**
 * @author mh137428
 *
 */
import javax.swing.JOptionPane;
public class initials 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String answer;
		String firstInitial;
		String secondInitial;
		String thirdInitial;
		
		answer = JOptionPane.showInputDialog(null, "What is the first initial in your full name?", "First Initial", JOptionPane.QUESTION_MESSAGE);
		firstInitial = answer;
		
		answer = JOptionPane.showInputDialog(null, "What is the second initial in your full name?", "Second Initial", JOptionPane.QUESTION_MESSAGE);
		secondInitial = answer;
				
		answer = JOptionPane.showInputDialog(null, "What is the third initial in your full name?", "Third Initial", JOptionPane.QUESTION_MESSAGE);
		thirdInitial = answer;
		
		JOptionPane.showMessageDialog(null, "Your full initials are " + firstInitial + "." + secondInitial + "." + thirdInitial + ".");
	}

}
