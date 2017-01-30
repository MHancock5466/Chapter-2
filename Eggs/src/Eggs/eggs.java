/**
 * 
 */
package Eggs;

/**
 * @author mh137428
 * January 30th, 2017
 */
import javax.swing.JOptionPane;
public class eggs 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//Number of eggs to buy and the amount left over
	String answer;
	final double dozenEggCost = 3.25;
	final double remainEggCost = .45;
	int dozenEggs = 12;
	int eggsWanted;
	int numDozen;
	double dozenCost;
	int remainEgg;
	double remainCost;
	double cost;
	
	answer = JOptionPane.showInputDialog(null, "How many eggs would you like?", "Place Your Order Here", JOptionPane.QUESTION_MESSAGE);
	eggsWanted = Integer.parseInt(answer);
	
	numDozen = eggsWanted/dozenEggs;
	remainEgg = eggsWanted%dozenEggs;
	
	dozenCost = numDozen*dozenEggCost;
	remainCost = remainEgg*remainEggCost;
	
	cost = dozenCost + remainCost;
	JOptionPane.showMessageDialog(null, "You ordered " + eggsWanted + " eggs. That's " + numDozen + " dozen at $3.25 per dozen and " + 
			remainEgg + " loose egg(s) at 45 cents each for a total of $" + cost + ".");
	}

}
