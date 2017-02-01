/**
 * 
 */
package MadLibs;

/**
 * @author mh137428
 *
 */
import javax.swing.JOptionPane;
public class madLibs 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		String color, wordEst, pluralBody, animal, singleNoun, pluralNoun, wholeNumber;
		int a, b, c;
		
		color = JOptionPane.showInputDialog(null, "Choose a color");
		wordEst = JOptionPane.showInputDialog(null, "Pick a word that ends in 'est'");
		pluralBody = JOptionPane.showInputDialog(null, "Choose a body part in the plural form");
		animal = JOptionPane.showInputDialog(null, "Choose an animal");
		singleNoun = JOptionPane.showInputDialog(null, "Choose a singular noun");
		pluralNoun = JOptionPane.showInputDialog(null, "Choose a plural noun");
		
		wholeNumber = JOptionPane.showInputDialog(null, "Give me a whole number");
		a = Integer.parseInt(wholeNumber);
		
		wholeNumber = JOptionPane.showInputDialog(null, "Give me another whole number");
		b = Integer.parseInt(wholeNumber);
		
		c = a - b;
		
		JOptionPane.showMessageDialog(null, "The " + color + " Dragon is the " + wordEst + " dragon of all. It has " + c + " " + pluralBody + 
				", and a " + animal + " shaped like a " + singleNoun + ". It loves to eat " + pluralNoun + 
				", although it will feast on nearly anything.");
	}

}
