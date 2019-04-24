package sampleQuestions;

public class ValueExchange {
	private int x;
	private int y;
	public ValueExchange(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void changeIt(Integer x, Integer y) {
		Integer temp = x;
		x = y;
		y = temp;
	}
	public void changeIt() {
		int temp = this.x;
		this.x = y;
		this.y = temp;
	}
	public String toString() {
		return "x = " + this.x + " y = " + this.y;
	}
	public static void main(String[] args) {
		Integer x = 1;
		Integer y = 2;
		changeIt(x, y);
		System.out.print(x + " ");
		System.out.println(y);
		ValueExchange a = new ValueExchange(1, 2);
		System.out.println(a);
	}
}


	