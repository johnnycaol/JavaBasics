import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// Get the user input (Scanner class)
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Your name is " + name + ".");
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		System.out.println("You are " + age + ".");
	}
}
