package strings;

public class CompareStrings {

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

		String str1 = "Raman java selenium";
		System.out.println(str1.length());
		int lastIndex = str1.lastIndexOf("java");
		if (lastIndex == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Occurence of of java at position: " + lastIndex);
		}
	}

}
