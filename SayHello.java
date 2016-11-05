
public class SayHello {
	public static void main(String[] args) {
		Object[] yourName; //Set aside some memory, refer it to as yourName
		yourName = new Object[1];
		yourName[0] = "Tony"; //Set the memory at yourName to value "Tony"
		System.out.printf("Hello, %s!!!!!\n", yourName); //Say hello
	}
}
