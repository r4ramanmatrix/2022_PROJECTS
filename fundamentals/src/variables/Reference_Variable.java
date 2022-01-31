package variables;

public class Reference_Variable {

	int id;
	Reference_Variable ref;

	public Reference_Variable(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		Reference_Variable obj = new Reference_Variable(266);

		System.out.println(obj);
		obj.ref = obj;
		System.out.println(obj.ref);
	}

}
