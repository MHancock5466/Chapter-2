/**
 * 
 */
package RandomGuessMatch;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class randomGuessMatch 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int random, input;
		String answer;
		random = 1 + (int)(Math.random() * 5);
		
		answer = JOptionPane.showInputDialog(null, "Guess a number between 1 and 5.");
		input = Integer.parseInt(answer);
		
		if(input == random)
		{
			JOptionPane.showMessageDialog(null, "You were right! You put " + input + " and the number was " + random + ".");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Aww, too bad. You put " + input + " but the actual number was " + random + ".");
		}
	}
	
}
