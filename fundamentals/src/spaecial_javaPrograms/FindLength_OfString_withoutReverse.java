package spaecial_javaPrograms;

public class FindLength_OfString_withoutReverse {

	public static void m1(String str) {
		str = str.replaceAll(" ", "");
		int count = 0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			count++;
		}
		System.out.println("Length of string is:: " + count);
	}

	public static void main(String[] args) {
		String str = " Raman kumar sharma ";
		m1(str);
	}

}
