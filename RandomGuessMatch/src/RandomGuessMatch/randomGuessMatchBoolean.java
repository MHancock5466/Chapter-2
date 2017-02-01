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
		int random, input, difference;
		final int min = 1;
		final int max = 5;

		random = min + (int)(Math.random() * max);
		
		answer = JOptionPane.showInputDialog(null, "Guess a number between " + min + " and " + max + ".", "Choose A Number", 
				JOptionPane.INFORMATION_MESSAGE);
		input = Integer.parseInt(answer);
		
		difference = java.lang.Math.abs(random - input);
		response = (input == random);
		
		JOptionPane.showMessageDialog(null, "You were " + difference + " off of the correct number.");
		JOptionPane.showMessageDialog(null,	"You put " + input + " when the random number was " + random + " . That's " + response + ".");
	}

}
