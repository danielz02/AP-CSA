package introductoryJavaLangFeatures;

public class NumberStorage {

	public static void main(String[] args) {
		/**
		 * An identifier is a name for variable, parameter, constant, method, or class.
		 * In Java identifier can be any sequence of letters, digits, and the underscore character.
		 * Identifiers may not begin with a digit, which will lead to Compile-time error.
		 * Wherever possible identifiers should be explicit.
		 * By convention identifiers for method and variables are lower-case with upper-case letters separating them into words.
		 * By convention class names start with a upper-case letter.
		 */
		System.out.println("Below is an example of the case sensitivity of the identifiers in Java");
		int age = 3;
		int Age = 5;
		System.out.print("age equals to " + age + " ");
		System.out.println("while Age equals to " + Age);//Identifiers are case-sensitive.
		
		/**
		 Every identifier in a Java program has an associated type.
		 Below are the built-in or primitive types in AP Java Subset.
		 */
		System.out.println("Below are theree examples of the primitive types in AP Java Subset.");
		int x;//An integer. For example, 2, -26, 3000
		boolean y;//True or false
		double z;//A double precision floating-point number
		
		/**
		 * Integers are stored exactly but they are bounded.
		 * The storage of a value whose magnitude is too big in an int will lead to an overflow error.
		 */
		x = Integer.MAX_VALUE;
		System.out.println(x);//The largest positive integer, 2^31 - 1, in 32 bit. 
		y = true;
		System.out.println(y);
		z = 3.1415926;
		System.out.println(z);
		
		/**
		 * An identifier, for example a variable, is introduced with a declaration of its type.
		 * A variable is often initialized in its declaration .
		 */
		System.out.println("Below are the examples about the features of the built-in types in Java.\nFor more details about these features, refer to the JavaDoc comments below.");
		int count = 2;//count initialized to 2
		double p = 2.3, q = 4.1;//p and q initialized to 2.3 and 4.1
		int totalRounded = (int)p + (int)q;//Assigning a double to an int requires a cast.
		System.out.println(totalRounded);
		double average = (p + q) / count ;//Assigning an int to a double automatically cast the int to double.
		System.out.println(average);
		System.out.println((int)(average + 0.5));//round a positive number to the nearest integer
		double negAmount = -4.8;
		System.out.println((int)(negAmount - 0.5));//round negative number to the nearest integer
		
		/**
		 *Integer values in Java are stored exactly, as a string of bits (binary digits).
		 * One of the bits stores the sign of the integer, 0 for positive, 1 for negative.
		 * The Java built-in integral type, byte, uses one byte (eight bits) of storage.
		 * The largest positive integer that can be stored using type byte is 2^7 - 1.
		 */
		System.out.println("The largest positive integer that can be stored in type byte is 2^7-1=" + Byte.MAX_VALUE);
		
		/**
		 * Type int uses four bytes (32 bits).
		 * In general, an n-bit integer uses n/8 bytes of storage.
		 * An n-bit integer stores integers from -2^(n-1) to 2^(n-1)-1.
		 * The extra value on the negative side come from not having to store -0.
		 * Built-in types in Java are byte (one byte), short (two bytes), int(four bytes), and long(eight bytes).
		 */
		System.out.println("The largest positive integer that can be stored in type int is " + Integer.MAX_VALUE);
		
		/**
		 *There are two built-in types in Java that store real number:
		 *float, which uses for bytes, and double, which uses eight bytes.
		 *A floating-point number is stores in two parts:
		 *a mantissa, which specifies the digits of the number, and an exponent.
		 *The JVM represents the number using scientific notation:
		 *sign*mantissa*2^exponent
		 *In this expression, 2 is the base or radix of the number.
		 *In types double eleven bits are allocated for the exponent, and (typically) 52 bits for the mantissa.
		 *One bit is allocated for the sign.
		 *This is a double-precision number.
		 *Type float, which is single precision, is not in the AP Java subset.
		 *When floating-point number are converted to binary, most cannot be represented exactly.
		 *The inaccuracy in conversion leads to round-off error, compounded by arithmetic operation.
		 */
		double m = 0.1*26, n = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		boolean roundOff = m == n;
		System.out.println("m equals to " + m + " " + "while n equals to " + n + ".");
		System.out.println("Due to round-off error, m == n is " + roundOff + ".");
		
		/**
		 * A final variable or user-defined constant is identified by the keyword final.
		 * A final variable is used to name a quantity whose value will not change.
		 * Constant identifiers are, by convention, capitalized.
		 * A final variable can be declared without initializing it immediately.
		 */
		final double TAX_RATE;
		double price = Math.random()*50;
		if (price > 25)
			TAX_RATE = 0.08;
		else 
			TAX_RATE = 0.0;
		System.out.println("Your tax rate is " + TAX_RATE + " and it can be given a value just once.");
		
		final int MAXSTUDENTS = 25;
		int[] classList = new int[MAXSTUDENTS];
		System.out.println(classList);
	}

}
