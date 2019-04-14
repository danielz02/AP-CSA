package introductoryJavaLangFeatures;

public class ControlStructures {
	public static void main(String[] args) {
		/**Input and Output
		 * Because of the variety means to provide input, user input is not a part of the AP Java subset.
		 * If necessary, input will be indicated like:
		 * double x = IO.readDouble();//read user input
		 * double x = call to a method that reads a floating-point number
		 * 
		 * Testing of output is restricted to System.out.println and System.out.print.
		 * The println method prints an item and then goes to a new line while the print method prints an item without going to a new line.
		 * The print (println) method can output string, number, or the value of boolean.
		 * Note: The Scanner class, which simplifies console and file input, will not be tested in AP.
		 * 		 To print the "value" of user defined objects, the toString() method is invoked.
		 */
		System.out.println("Below are examples of the print and println method.");
		System.out.print("Hot");
		System.out.println("dog");//print Hotdog
		System.out.println("Hot");//print Hot
		System.out.println("dog");//      dog
		System.out.println(7 + 3);//print a integer
		System.out.println(7 == 3 + 5);//print the value of a boolean
		classesAndObjects.BankAccount daniel = new classesAndObjects.BankAccount();
		System.out.println(daniel);
		System.out.println("-------------------------------------------------------");
		
		/**Escape Sequence
		 * An escape sequence, which is used to print special character, is a backlash followed by a single character.
		 * \n newline
		 * \" double quote ""
		 * \\ backslash
		 */
		System.out.println("Below are examples of escape sequence.");
		System.out.println("Welcome to\na new line");
		System.out.println("He is known as \"Daniel Z\".");
		System.out.println("The path of the file is C:\\Users\\Daniel\\Documents\\Git\\repository");
		System.out.println("-------------------------------------------------------");

		/**Control Structure
		 * Control structures are the mechanism through which we can make the statements run following a certain logical order.
		 * 
		 * Decision-Making Control Structures
		 * if, if ... else, and switch are all selection controls that help the program make decisions.
		 * Based on the value of a certain boolean expression, the program will decide which path to follow. 
		 * The switch statement is not in the AP Java subset.
		 * 
		 * The if statement will be executed only if the boolean expression is true.
		 * If it is false, control passes immediately to the statement following the if statement.
		 */
		System.out.println("Below are examples of if statement and nested if.");
		int a = (int)(Math.random() * 11);
		if (a > 5) {
			System.out.println("a > 5");//The console will print "a > 5" when a > 5.
		}
		if (a <= 5) {
			System.out.println("a <= 5");//The console will print "a <= 5" when a <= 5.
		}////The code segment from line 51 to line 57 is equivalent to the code segment below.
		if (a > 5) {
			System.out.println("a > 5");
		}
		else {
			System.out.println("a <= 5");
		}//If the boolean expression is true, only the statements immediately following the test will be executed.
		 //If the boolean expression is false, only the statements immediately following the else will be executed.
		
		//If the statement part of an if statement is itself an if statement, the result is a nested if statement.
		if (a > 3)
			if (a < 5)
				System.out.println("3 < a < 5");
		//This is equivalent to
		if (a > 3 && a < 5)
			System.out.println("3 < a < 5");
		System.out.println("-------------------------------------------------------");

		/**Be careful of the indentation, or the space at the beginning of a line, of your code.
		 * Be careful with the arrangement of your control structure.
		 * Pay attention that else always gets matched with the nearest unpaired if.
		 * Specifically, use {} delimiters to group your statement correctly.
		 * 
		 * Below is a segment of a poorly organized code.
		 * The intention of the following program is to tell whether integer a is a positive even number or a is not positive.
		 * However, when a is an positive odd number, the program still tells that a is not positive.
		 * The reason is that the else is always matched with the nearest unpaired if.
		 * Also, the debug process will be more difficult because of the poor indentation of else statement.
		 * A proper indentation can increase the readability of the program although compiler cares nothing about it.
		 */
		System.out.println("Be careful of the dangling else!");
		if (a > 0)
			if (a % 2 == 0)
				System.out.println(a + " is a positive even number.//incorrect output");
		else
			System.out.println(a + " is not positive.//incorrect output");
		
		//Below is a correct implementation of the preceding code segment.
		if (a > 0) {
			if (a % 2 == 0)
				System.out.println(a + " is a positive even number.//correct output");
		}
		else
			System.out.println(a + " is not positive.//correct output");
	
		//Below is another correct implementation if the preceding code segment.
		if (a <= 0)
			System.out.println(a + " is not positive.//correct output");
		else if (a % 2 == 0)
			System.out.println(a + " is a positive even number.//correct output");
		System.out.println("-------------------------------------------------------");
		
		System.out.println("If statement can be extended by else if");
		String[] grade = {"A", "B", "C", "F", "0"};
		int b = (int)(Math.random()*5);
		if (grade[b].equals("A"))
			System.out.println("Excellent");
		else if (grade[b].equals("B"))
			System.out.println("Good");
		else if (grade[b].equals("C"))
			System.out.println("Poor");
		else if (grade[b].equals("F"))
			System.out.println("Egregious!");
		else
			System.out.println("Invalid grade");
		System.out.println("-------------------------------------------------------");

		/**Iteration
		 * Java has three control structures that allow the program to perform iterative tasks:
		 * for
		 * while
		 * do ... while (not in the AP Java subset)
		 */
		System.out.println("Below are examples of for loop.");
		int c = 1;
		for (c = 1; c < 5; c++)
			System.out.print(c + " ");
		
		System.out.println("\nAfter execuating the loop, c changed from 1 to " + c + "because c is an instance variable.\n");
		for (int i = 20; i >= 15; i--)
			System.out.print(i + " ");
		System.out.println("\nAfter execuating the loop, i is terminated because i is a local variable.");

		/**Note
		 * 1.The loop variable should not have its value changed inside the loop.
		 * 2.The initializing and update statement can use any valid constants, variables, or expressions.
		 * 3.The scope of the loop variable can be restricted to the loop body by combing the loop variable with initialization.
		 */
	}
	
}
