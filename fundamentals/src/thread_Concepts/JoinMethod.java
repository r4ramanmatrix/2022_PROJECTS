package thread_Concepts;

public class JoinMethod extends Thread {

	public void run() {
		System.out.println("Hallo, This is the child thread!!");
		String str = "hallo this is the statement";

		try {
			Thread.sleep(2000);
			m1(str);
			Thread.sleep(5000);
			m2(str);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void m1(String str) {
		int index = 2;
		String[] sSplit = str.split(" ");
		if (index >= 0 && index <= sSplit.length) {
			System.out.print("Output:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		}
	}

	public void m2(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("Void!!");
		}
		final StringBuilder sb = new StringBuilder(str.length());
		for (final String word : str.split(" ")) {
			if (!word.isEmpty()) {
				sb.append(Character.toUpperCase(word.charAt(0)));
				sb.append(word.substring(1).toLowerCase());
			}
			if (!(word.length() == str.length())) {
				sb.append(" ");
			}
		}
		System.out.println("\n"+sb);
	}
}
