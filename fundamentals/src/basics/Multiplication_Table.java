package basics;

public class Multiplication_Table {

	/*
	 * public void print() { for (int i = 0; i <= 10; i++) {
	 * System.out.printf("%d * %d=%d", 5, i, 5 * i).println(); } }
	 */

	public void print() {
		print(5);
	}

	/*
	 * public void print(int table) { for (int i = 1; i <= 10; i++) {
	 * System.out.printf("%d * %d = %d", table, i, table * i).println(); } }
	 */

	public void print(int table) {
		print(table, 1, 10);
	}

	public void print(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}

}
