package strings;

public class String_Programming {

	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos + 1);
	}

	public static void main(String[] args) {
		String x = "A";
		String y = x;
		String z = "A";
		String v = new String(y);
		System.out.println(x == z);
		System.out.println(x.equals(z));
		System.out.println(y == x);
		System.out.println(z == x);
		System.out.println(y.equals(z));

		System.out.println(v == y);
		System.out.println(y.equals(v));

		System.out.println(v.compareTo(z));
		System.out.println(v.compareTo(y));

		// How to search last occurrence of a substring inside a substring?
		String str1 = "Raman java selenium";
		System.out.println(str1.length());
		int lastIndex = str1.lastIndexOf("java");
		if (lastIndex == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Occurence of of java at position: " + lastIndex);
		}

		// How to remove a particular character from a string?
		System.out.println(removeCharAt(str1, 6));

		// How to search a word inside a string ?
		System.out.println(str1.contains("Raman"));

		String str = "Welcome to Oracle";
		String str2 = "I am working on Oracle software";
		boolean match = str.regionMatches(11, str2, 16, 15);
		System.out.println(match);

	}

}
