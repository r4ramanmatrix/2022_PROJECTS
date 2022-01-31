package new_entry;

public class Multiplication_Table_Of_GivenInput {

	public void m1(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "*" + i + "=" + number * i);
		}
	}

	public static void main(String[] args) {
		Multiplication_Table_Of_GivenInput obj1 = new Multiplication_Table_Of_GivenInput();
		obj1.m1(15);
	}

}
