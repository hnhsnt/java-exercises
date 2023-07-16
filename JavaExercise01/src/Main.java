/* Exercise
 * Create a prompt that will ask somebody for their name, age and their favorite food. Display everything that the user
 * has inputed in the console.
 */

import java.util.Scanner; // Allows us to use the Scanner.
// The Scanner class is found in the Java utility package of your library

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Created a scanner object. We can use the scanner to accept some user input.
		
		
		System.out.println("What is your name?");
		// To enter a line of text, we can use the name of the Scanner object, named scanner in our case then call out the method nextLine().
		String name = scanner.nextLine(); // Take our user input and assign it to a variable called name.
		
		System.out.println("How old are you?");
		int age = scanner.nextInt(); // Here, we can only accept a whole integer.
		// If we do not enter in a number, it gives us an error. We will encounter an exception, specifically an InputMismatchException,
		// because when our scanner is looking for an integer, if we type in another value, it will always encounter that exception.
		// We need to make sure that the data type matches. In the future we can also handle exceptions.
		scanner.nextLine(); // Without this nextLine(), the next scanner.nextLine() will never be used. 
		// Always put in nextLine() right after nextInt().
		// The nextLine() method will read an entire line of text and stop when it reaches a new line, with the nextLine() method,
		// \n is automatically written.
		// With the nextInt(), we put in the number and press enter, and it would write for example 18\n.
		// The nextInt() method only reads the numeric portion of the scanner. When we submit it, the new line \n character
		// is still going to be within our scanner, and if we were to use our scanner again like we did with String food = scanner.nextLine();, 
		// our nextLine() method thinks that we're at the end because of the new line character within the scanner
		// To clear this out, we could use scanner.nextLine() right after we use nextInt(), so that that scanner.nextLine() gets the value of the
		// new line character only.
		
		
		
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name + "!"); // Prints this out into the console, with the variable name included since it's in the parenthesis.
		System.out.println("You are " + age + " years old.");
		System.out.println("You like " + food);
		
		
		
	}
}
