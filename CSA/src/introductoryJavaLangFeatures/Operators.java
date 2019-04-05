package introductoryJavaLangFeatures;

public class Operators {
	public static void main(String[] agrs) {
	/**Arithmetic Operations
	 * + addition
	 * - subtraction
	 * * multiplication
	 * / division
	 * % mod (remainder)
	 * Operators can be applied to types int and double, even if both types occur in the same expression.
	 * For an operation involving both double and int, the int is promoted to double, and the result is double.
	 * Integer division a/b where a and b are of type int returns the integer quotient only.
	 * If at least one of the operands is of type double, then the operation becomes floating-point division.
	 * 
	 * The arithmetic operators follow the normal precedence rules.
	 * 1. parentheses from the inner ones out
	 * 2. *, /, and %
	 * 3. + and -
	 * Operators on the same line have the same precedence, and, in the absence of parentheses, are invoked from left to right.
	 * Casting has precedence over all of theses operators
	 */
	System.out.println("Be careful and don't trust your instincts when evaluating arithmetic operations in Java.");
	System.out.println("3.0 / 4 = " + 3.0 / 4);
	System.out.println("3 / 4.0 = " + 3 / 4.0);//int will be promoted to double automatically.
	System.out.println("3 / 4 = " + 3 / 4);
	System.out.println("(double)3 / 4 = " + (double)3 / 4);
	System.out.println("(double)(3 / 4) = " + (double)(3 / 4));
	System.out.println("19 % 5 * 3 + 14 / 5 = " + (19 % 5 * 3 + 14 / 5));
	
	/**Relational Operators
	 * == equal to
	 * != not equal to
	 * >  greater than
	 * <  less than
	 * >= greater than or equal to
	 * <= less than or equal to
	 * Relational operators are used in boolean expressions that evaluate to true or false.
	 * Relational operators should be generally used only in the comparison of primitive types.
	 * User-defined types are compared using the equals and compareTo method.
	 * CAUTION: Be careful with the round-off error when comparing floating-point numbers.
	 */
	double a = 3.0;
	int b = 4;
	boolean c = (a == b);//b is promoted to double.
	boolean d = (a != b);
	System.out.println("Because 3 is not equal to 4, 3 == 4 will evaluate to " + c + ", while 3 != 4 will evaluate to " + d + ".");
	
	/**Comparing Floating-Point Numbers
	 * Because of the round-off errors in the storage of floating-point numbers, we can't rely on == or != to compare two double values for equality.
	 * They may differ in their last significant digit or two because of the round-off error.
	 * Instead, we should test the magnitude of the difference between two numbers.
	 * The machine precision, denoted by ¦Å, is about 10^(-16) for double precision.
	 * |x - y| ¡Ü ¦Å
	 * However, this is no good if x and y are very large.
	 * In general, we should check the relative difference by |x - y| ¡Ü ¦Å*max(|x|,|y|)
	 */
	double x = 1234567890.123456;
	double y = 1234567890.123457;//x = y at machine precision.
	System.out.println("When both x and y are very large, |x - y| ¡Ü ¦Å will evaluate to " + (Math.abs(x - y) <= 10e-16) + ".");
	System.out.println("When comparing the relative difference, |x - y| ¡Ü ¦Å*max(|x|,|y|) will evaluate to " + (Math.abs(x - y) <= 10e-16*Math.max(Math.abs(x), Math.abs(y))) + ".");
	
	/**Logical Operators
	 * !  NOT
	 * && AND
	 * || OR
	 * Logical operators are applied to boolean types to form compound boolean expressions.
	 * The values of compound booleans are evaluated following the truth table, which is the same as what you learned in high school.
	 * However, machines are lazy and evaluates the boolean expression in the most efficient manner, the short-circuit evaluation.
	 * The subexpression in a compound boolean expression are evaluated from left to right.
	 * The evaluation automatically stops as soon as the value of the expression is known.
	 * For example, the OR expression evaluates to true when one of the two subexpressions is true, and the AND expression evaluates to false when one of the two subexpressions evaluates to false.
	 * If the value of the first subexpression can determine the value of the whole expression, then the evaluation stops after evaluating the first subexpression regardless of the second operand.
	 * In a short-circuit evaluation, the entire expression will end up with a value even if the second subexpression is syntactically incorrect.
	 */
	@SuppressWarnings("unused")
	boolean e = (8 == 0 && 9 / 0 > 0);//8 == 0 will evaluate to false, causing the entire expression to evaluate to false without evaluating the second subexpression.
	System.out.println("Below is an example of short-circuit evaluation.\n8 == 0 && 9 / 0 > 0 evaluates to " + e + " without causing a run-time ArithmeticException.");
	
	/**Assignment Operators
	 * =   x = 2  means assigning 2 to x.
	 * +=  x += 4 equals to x = x + 4.
	 * -=
	 * *=
	 * /=
	 * %=
	 * All those operators, with the exception of simple assignment, are called compound assignment operators.
	 * Chaining of assignment is allowed and is evaluated from right to left.
	 */
	int next = 1, prev = 2, sum = 3;
	next = prev = sum;
	System.out.println("The result of chaining assignment is " + next + " " + prev + " " + sum + ".");//The assignment is performed from right to left.
	
	/**Increment and Decrement Operators
	 * ++  i++ or ++i means that i is incremented by 1.
	 * --  k-- or --k means that k is decremented by 1.
	 * Although i++ and ++i both have the net effect of incrementing i by 1, they are not equivalent.
	 * If ++ is first, you first do the increment.
	 */
	System.out.println("Execuating a++ will first print a = " + a++ + " and then incremented a to " + a + ".");//a = 3 is first printed out and then is incremented to 4
	a = 3.0;
	System.out.println("Execuating ++a will first increment a by 1 and print out a = " + ++a + ".");//a = 4 is first incremented to 4 and then is printed out.

	/**Operator Precedence
	 * 1. !, ++, --
	 * 2. *, /, %
	 * 3. +, -
	 * 4. <, >, <=, >=
	 * 5. ==, !=
	 * 6. &&
	 * 7. ||
	 * 8. =, +=, -=, *=, /=, %=
	 * Above operators on the same line have equal precedence.
	 * The evaluation of operators with the same precedence is from left to right, except for 1 and 8 where the order is from left to right.
	 */
	int k;
	int i = 1;
	k = 1 + i++;//1 + i will be implemented first.
	System.out.println("1 + i++ equals to " + k + ", where 1 + 1 first and then i ++.");
	
	i = 1;
	k = 1 + ++i;//++ has higher precedence over +
	System.out.println("1 + ++i equals to " + k + ", where ++1 first because of the higher precedence of ++ operator.");
	
	}
}
