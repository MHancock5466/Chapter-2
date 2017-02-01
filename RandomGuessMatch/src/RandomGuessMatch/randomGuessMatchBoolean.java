/**
 * 
 */
package RandomGuessMatch;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class randomGuessMatchBoolean 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		boolean response;
		String answer;
		int random, input;
		
		random = 1 + (int)(Math.random() * 5);
		
		answer = JOptionPane.showInputDialog(null, "Guess a number between 1 and 5.");
		input = Integer.parseInt(answer);
		
		response = (input == random);
		
		JOptionPane.showMessageDialog(null, "Your number was " + input + ". The random number was " + random + " . That is " + response + ".");
	}

}
