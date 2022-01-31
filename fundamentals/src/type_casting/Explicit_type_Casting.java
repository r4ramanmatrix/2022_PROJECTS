package type_casting;

public class Explicit_type_Casting {

	int x = 965097550;
	short s = (short) x;
	byte b = (byte) x;

	double d = 190.231;
	int i = (int) d;

	public static void main(String[] args) {
		Explicit_type_Casting obj = new Explicit_type_Casting();
		System.out.println(obj.b);
		System.out.println(obj.s);
		System.out.println(obj.i);
	}
}
