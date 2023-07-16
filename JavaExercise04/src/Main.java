/* Lesson
 * Generate some random values.
 */

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		
		// int x = random.nextInt(); 
		// The results of random.nextInt() is between a scale of just under negative 2 billion to just over 2 billion
		// In order to limit the scale or the size of the random number that we'll generate, we can pass in a value to our nextInt() method
		
		// If we would like a 6-sided dice, we're going to place 6 here.
		// int x = random.nextInt(6); // Although, this would generate a random number within 0 and 5 because computers always start with 0.
		// if we want the numbers 1 through 6, we could just add 1 after the method.
		
		int x = random.nextInt(6) + 1;
		System.out.println(x);
		
		
		double y = random.nextDouble(); // nextDouble() is going to give us a decimal value between 0 and 1.
		System.out.println(y);
		
		
		boolean z = random.nextBoolean(); // nextBoolean() is going to give us either true or false.
		System.out.println(z);
	}

}
