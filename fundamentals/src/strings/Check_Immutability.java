package strings;

public class Check_Immutability {

	static String s1 = "Raman";

	// static String s2="Kumar";
	static String s2 = "Raman";

	public static void main(String[] args) {
		System.out.println(s1 == s2);

		System.out.println(s1.equals(s2));

		String s = new String("Raman");
		String ss = new String("Raman");

		s.concat(" Kumar");

		System.out.println(s); // This is immutability
		System.out.println(s == ss);
		System.out.println(s.equals(ss));

		String ss1 = "AB C";
		String ss2 = "ABC";
		String ss3 = new String("ABC");

		System.out.println("*******************");
		System.out.println(ss1 == ss2);
		System.out.println(ss2 == ss3);

		System.out.println(ss1.equals(ss2));
		System.out.println(ss1.equals(ss3));

		String ss4 = ss3.intern();
		System.out.println(ss1 == ss4);

		String msg = String.join(" ", "My", "Name", "is", "machine");
		System.out.println(msg);

	}

}
