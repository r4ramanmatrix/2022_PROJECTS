package basics;

public class WrapperClass {

	public static void main(String[] args) {
		Boolean b = new Boolean("yes");

		int i = 99;
		String s = "999";
		Integer I = Integer.valueOf(i);
		System.out.println("int to Integer using valueOf() method " + I);
		I = Integer.valueOf(s);
		System.out.println("String to Integer using valueOf() method " + I);

		Integer I2 = Integer.valueOf("1111", 36);
		System.out.println("int to Integer using valueOf() method " + I2);

		System.out.println("**************************");

		Integer i3 = new Integer(999);
		int iVal = i3.intValue();
		byte by = i3.byteValue();
		System.out.println(iVal);
		System.out.println(by);
		System.out.println();
	}

}
