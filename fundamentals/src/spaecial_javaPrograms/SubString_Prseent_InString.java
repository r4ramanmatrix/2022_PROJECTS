package spaecial_javaPrograms;

public class SubString_Prseent_InString {

	public static void m1(String str, String str2) {

		boolean isPresent = str.contains(str2);
		System.out.println(isPresent);
	}

	public static void m2(String str, String str2) {
		boolean isPresent = str.matches("(.*)" + str2 + "(.*)");
		System.out.println(isPresent);
	}

	public static void m3(String str, String str2) {
		boolean isPresent = str.indexOf(str) != -1;
		System.out.println(isPresent);
	}

	public static void main(String[] args) {
		String str = "this is the string statement";
		String searchString = "string statement";
		m1(str, searchString);
		m2(str, searchString);
		m3(str, searchString);
	}

}
