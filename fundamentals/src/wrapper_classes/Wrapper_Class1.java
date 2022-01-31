package wrapper_classes;

public class Wrapper_Class1 {

	public static void main(String[] args) {
		int a = 99;
		String str = "100";

		System.out.println(str + 100);

		Integer i = new Integer(str);

		System.out.println(i + 100 + 1);

		System.out.println();

		Integer in = Integer.valueOf(a);

		System.out.println(in);

		Integer.toString(in, 2);

		System.out.println(in);

		Integer seven = 7;

		Integer sevenAgain = 7;

		System.out.println(seven == sevenAgain);

		Integer i1 = new Integer(7);

		System.out.println(i1 == seven);

		System.out.println(Integer.MAX_VALUE);
	}

}
