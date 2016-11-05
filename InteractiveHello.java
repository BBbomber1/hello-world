import java.util.Scanner; //Bring in the scanner to read input

public class InteractiveHello {
	/*
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		//Make new object of class Scanner, based on System.in and call it input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name ==>");
		Object[] yourName;
		yourName = new Object[1];
		yourName[0] = input.nextLine();
		System.out.printf("Hello, %s!!!!!", yourName); //Say hello
	}
}
