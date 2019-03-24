package introductoryJavaLangFeatures;

public class Operators {
	public static void main(String[] agrs) {
	
	int k;
	int i = 1;
	k = 1 + i++;//1 + i will be implemented first.
	System.out.println(k);
	
	i = 1;
	k = 1 + ++i;//++ has higher precedence over +
	System.out.println(k);
	
	}
}
