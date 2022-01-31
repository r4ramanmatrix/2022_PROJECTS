package strings;

public class Count_Uppercase_Character {

	public static void m1(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println("Count of uppercase character is:: " + count);
	}

	public static void m2(String str) {
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count2++;
			}
		}
		System.out.println("Count of uppercase character using ASCII Value:: " + count2);
	}

	public static void m3(String str) {
		int count3 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count3++;
			}
		}
		System.out.println("Count of uppercase character using isUpperCase() method:: " + count3);
	}
	
	

	public static void main(String[] args) {
		String statement = "     Hel   lo, This Is ThE CRUEL WORLD!!";
		m1(statement);
		m2(statement);
		m3(statement);
	}

}
