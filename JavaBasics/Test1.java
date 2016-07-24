import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		// Always declare variables and functions with a type
		
		// Hello World
		System.out.println("Hello Johnny!");
		
		// Integers
		int myInt = 33;
		short myShort = 3;
		long myLong = 333;
		
		// Decimals
		float myFloat = 3.3f;
		double myDouble = 3.333;
		System.out.println(myDouble);
		
		// Strings (strings in java are objects)
		String myString = "This is a string.";
		String myString2 = " This is a string, too.";
		System.out.println(myString + myString2);// String concatenate
		System.out.println(myString + myDouble);// String and double concatenate
				
		// Others
		char myChar = 'b';
		boolean myBool = true;
		byte mybyte = 123;
		
		// If...else if...else
		int iIf = 3;
		if(iIf == 1) {
			System.out.println("Condition 1 matched.");
		} else if(iIf == 2) {
			System.out.println("Condition 2 matched.");
		} else {
			System.out.println("Condition 3 matched.");
		}
		
		// For loop
		for(int iFor=100; iFor<=105; iFor++) {
			if(iFor == 103) {
				break; // Break the first loop
			}
			System.out.printf("This is a number %d.\n", iFor); // print format
		}
		
		// While loop
		int iWhile = 10;
		while(iWhile >= 0) {
			System.out.println(iWhile);
			iWhile-=1;
		}
		
		// Do...while loop
		int number = 0;
		do {
			System.out.println("Please enter a number:");
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
		} while(number != 3);

		// Arrays
		int[] values; //declare the array
		values = new int[3]; //initialize the array (assign 0 to each element)
		values[0] = 11;
		values[1] = 22;
		values[2] = 33;
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		
		String[] stringValues = new String[2]; //declare the array and initialize the array (assign null to each element)
		stringValues[1] = "abc";//has to be double quotes for String type
		System.out.println(stringValues[1]);
	}

}
