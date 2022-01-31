package basics;

public class Multiplication_Table_Runner {

	public void printing() {
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d + %d=%d", 5, i, 5 + i).println();
			;
		}
	}

	public static void main(String[] args) {

		Multiplication_Table obj = new Multiplication_Table();
		obj.print();
		Multiplication_Table_Runner obj1 = new Multiplication_Table_Runner();
		System.out.println();
		obj1.printing();
		System.out.println();
		obj.print(10);

	}
}
