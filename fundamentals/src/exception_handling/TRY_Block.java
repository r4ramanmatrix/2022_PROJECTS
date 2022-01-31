package exception_handling;

public class TRY_Block {

	public void m1() {
		try {
			int result = 10 / 0;
		} finally {
			System.out.println("FINALLY BLOCK!!");
		}
	}

	public static void main(String[] args) {
		new TRY_Block().m1();
	}

}
