package strings;

public class WordsInString {
	
	public static void m1(String name) {
		//char values[]=name.toCharArray();
		int count=0;
		for(int i=0;i<name.length();i++) {
			//System.out.println(name.charAt(i));
			count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		m1("This is the Java World!");
	}

}
