package strings;

public class ImmutabilityCheck {

	private int i;

	public ImmutabilityCheck(int i) {
		this.i = i;
	}

	public ImmutabilityCheck modify(int i) {

		if (this.i == i) {
			return this;
		} else {
			return new ImmutabilityCheck(i);
		}
	}

	public static void main(String[] args) {
		ImmutabilityCheck obj1 = new ImmutabilityCheck(100);
		System.out.println(obj1);
		
		System.out.println(obj1.modify(200));
		System.out.println(obj1);
	}

}
