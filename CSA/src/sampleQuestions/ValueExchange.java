package sampleQuestions;

public class ValueExchange {
	private int x;
	private int y;
	
	//construct a wrapper class
	public ValueExchange(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//swap the value of x and y
	public ValueExchange changeIt() {
		int temp = this.x;
		this.x = this.y;
		this.y = temp;
		return new ValueExchange(x, y);
	}
	
	//not gonna work
	public static void changeIt(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}
	
	//swap the value of x and y
	public static ValueExchange changeIt(Integer x, Integer y) {
		Integer temp = x;
		x = y;
		y = temp;
		return new ValueExchange(x, y);
	}
		
	@Override
	public String toString() {
		return "x = " + this.x + " y = " + this.y;
	}//override the toString method of the Object class
	
	public static void main(String[] args) {
		Integer x = 1;
		Integer y = 2;
		System.out.println(ValueExchange.changeIt(x, y));
		ValueExchange a = new ValueExchange(1, 2);
		System.out.println(a.changeIt());
		
		//not gonna work
		int c = 2;
		int d = 3;
		changeIt(c, d);
		System.out.println("c = " + c + " and d = " + d);
	}
}


	