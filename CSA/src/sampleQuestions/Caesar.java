package sampleQuestions;

public class Caesar {
	private final static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u","v", "w", "x", "y", "z"};
	private String text;
	private static int shift;
	private boolean encryptionStatus;
	
	//constructor
	public Caesar(String text, int shift) {
		this.text = text;
		Caesar.shift = shift;
		this.encryptionStatus = false;
	}
	
	//convert a given index to the corresponding letter in alphabet
	public static String numToLetter(int index) {
		index = (index + 26 * (shift / 26 + 1)) % 26;
		return alphabet[index];
	}
	
	//convert a given character to its corresponding index in alphabet
	//return -1 when the given character is not in alphabet
	public static int letterToNum(String letter) {
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i].equals(letter))
				return i;				
		}
		return -1;
	}
	
	//implement Caesar shift and apply it to a single letter according to parameter shift
	public static String shiftLetter(String letter, int amount) {
		int index = letterToNum(letter);
		String result = "";
		if(index == -1)
			result += "";
		else
			result += numToLetter(index + amount);
		return result;
	}
	
	//apply Caesar shift to a given string
	private String encodeText() {
		String result = "";
		for(int i = 0; i < this.text.length(); i++) {
			String currentLetter = this.text.substring(i, i + 1);//retrieve every character in the string
			result += shiftLetter(currentLetter, shift);//apply Caesar shift to that retrieved letter
		}
		this.encryptionStatus = true;//change encryption mark to true
		this.text  = result;//assign the encrypted string to text
		return result;
	}
	
	//reverse Caesar shift to a encrypted string
	private String decodeText() {
		String result = "";
		for(int i = 0; i < this.text.length(); i++) {
			String currentLetter = this.text.substring(i, i + 1);
			result += shiftLetter(currentLetter, - shift);
		}
		this.encryptionStatus = false;
		this.text = result;
		return result;	
	}
	
	//encapsulate encode and decode methods
	public String shiftText() {
		if(encryptionStatus) {
			this.text = decodeText();
			return this.text;
		}
		else {
			this.text = encodeText();
			return this.text;
		}
	}
	
	//return true if the text is encrypted, false otherwise
	public boolean isValid() {
		return this.encryptionStatus;
	}
	
	//override the toString() method in the Object class
	public String toString() {
		if(encryptionStatus) {
			return "Your input text \"" + this.text + "\" is encrypted.";
		}
		else {
			return "Your input text \"" + this.text + "\" is not encrypted.";
		}
	}
	
	public static void main(String[] args) {
		Caesar a = new Caesar("xyz", -1);
		System.out.println(a.shiftText());
		System.out.println(a.shiftText());
		System.out.println(a);
	}
	
	
}
