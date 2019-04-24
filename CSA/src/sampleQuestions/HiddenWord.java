package sampleQuestions;

public class HiddenWord {
	private String actual;
	public HiddenWord(String word) {
		actual = word;
	}
	public String getHint(String word) {
		if (actual.length() != word.length())
			return "Invalid input.";
		
		String result = "";
		for (int i = 0; i < word.length(); i++) {
			String current = word.substring(i, i + 1);
			String actualCurrent = actual.substring(i, i + 1);
			if (current.equals(actualCurrent))
				result += current;
			else if (this.actual.indexOf(current) != -1) 
				result += "*";
			else 
				result += "+";
		}	
		return result;
	}
	
	public static void main(String[] args) {
		HiddenWord x = new HiddenWord("HARPS");
		System.out.println(x.getHint("HEART"));
	}
}
