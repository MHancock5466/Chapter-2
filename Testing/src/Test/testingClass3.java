/**
 * 
 */
package Test;

/**
 * @author mh137428
 *
 */
import java.util.Scanner;
public class testingClass3 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	int num1;
	int num2;
	int num3;
	int num4;
	int answer;
	
	Scanner inputDevice = new Scanner(System.in);
	
	System.out.print("Please enter your first number >> ");
	num1 = inputDevice.nextInt();
	inputDevice.nextLine();
	
	System.out.print("Please enter your second number >> ");
	num2 = inputDevice.nextInt();
	inputDevice.nextLine();

	System.out.print("Please enter your third number >> ");
	num3 = inputDevice.nextInt();
	inputDevice.nextLine();
	
	System.out.print("Please enter your fourth number >> ");
	num4 = inputDevice.nextInt();
	inputDevice.nextLine();
	
	answer = num1 + num2 + num3 + num4;
	
	System.out.print("The total of all four numbers is = " + answer);
	}

}
