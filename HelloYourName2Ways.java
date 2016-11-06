/* Challenge Activity 1
Write a java program to input your first name and last name, then say "hello"
two ways, like this:
Enter your first name: Michael
Enter your last name: Fudge
Hello, Michael Fudge!  
Or should I say: Fudge, Michael!
*/

import java.util.Scanner; //Bring in the scanner to read input
/**
 *@param args the command line arguments
 */
public class HelloYourName2Ways {
	public static void main(String[] args) {
		//Make new object of class Scanner, based on System.in and call it input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String yourFirstName = input.nextLine(); //This is your first name
		System.out.println("Enter your last name:");
		String yourLastName = input.nextLine(); //This is your last name
		System.out.println("Hello, " + yourFirstName + " " + yourLastName + "!");
		System.out.println("Or should I say: " + yourLastName + ", " + yourFirstName + "!");//Say hello
		
	}
}