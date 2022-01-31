package object_class;

public class EqualsMethod {

	String name;
	int rollNo;

	public EqualsMethod(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	/*
	 * @Override public boolean equals(Object obj) { try { String name1 = this.name;
	 * int rollNo1 = this.rollNo; EqualsMethod ob = (EqualsMethod) obj; String name2
	 * = ob.name; int rollNo2 = ob.rollNo; if (name1.equals(name2) && rollNo1 ==
	 * rollNo2) { return true; } else { return false; } } catch (ClassCastException
	 * e) { return false; } catch (NullPointerException e) { return false; }
	 *
	 * }
	 */

	/*
	 * @Override public boolean equals(Object obj1) { try { EqualsMethod o =
	 * (EqualsMethod) obj1; if (name.equals(o.name) && o.rollNo == o.rollNo) {
	 * return true; } else { return false; } } catch (ClassCastException e) { return
	 * false; } catch (NullPointerException e) { return false; } }
	 */

	@Override
	public boolean equals(Object objx) {
		if (objx instanceof EqualsMethod) {
			EqualsMethod e = (EqualsMethod) objx;
			if (name.equals(e.name) && rollNo == e.rollNo) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		EqualsMethod obj1 = new EqualsMethod("Raman", 123);
		EqualsMethod obj2 = new EqualsMethod("Ra", 30);
		EqualsMethod obj3 = new EqualsMethod("Raman", 123);
		EqualsMethod obj4 = obj1;
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1.equals(obj4));
		System.out.println(obj1.equals("Raman"));
		System.out.println(obj1.equals(null));

	}

}
