/* Exercise
 * Create a program that calculates the hypotenuse of a triangle
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x; // side x
		double y; // side y
		double z; // result of the hypotenuse
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		// To calculate the hypotenuse, the formula is √(a^2 + b^2)
		z = Math.sqrt((x*x) + (y*y));
		
		System.out.println("The hypotenuse is " + z + ".");
		scanner.close(); // It's good practise to close your Scanner, but it's not necessary.
		
	}

}
