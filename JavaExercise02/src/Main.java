/* Exercise
 * Create a GUI program.
 * GUI - Graphic User Interface
 * GUI is a visual program that we can see and interact with.
 * 
 * We can achieve this by using the JOptionPane class.
 */

import javax.swing.JOptionPane; // can be used to create message dialogue boxes.

public class Main {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name"); // This will show a dialogue box that allows us to type in our name.
		JOptionPane.showMessageDialog(null, "Hello " + name + "!"); // This shows a message.
		
		
		// JOptionPan.showInputDialog(value) will return a string based on what the user types in.
		
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); // using parseInt() will convert the following in the parenthesis into an integer
		// that we can store into the variable age, which is an int.
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
		
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in centimeters"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall.");
	}

}
