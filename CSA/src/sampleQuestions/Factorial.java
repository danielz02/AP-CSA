package sampleQuestions;

public class Factorial {
	public static int doFactorial(int n) {
		if (n < 0)
		if (n <= 1)
			return 1;
		return n * doFactorial(n - 1);
	}
	public static void main(String[] args) {
		System.out.println(doFactorial(0));
	}
}