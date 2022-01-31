package thread_Concepts;

public class By_ExtendingThread_Class extends Thread {

	public void start() {
		super.start();
		System.out.println("Start method");

	}

	public void run() {
		for (int i = 0; i < 1; i++) {
			System.out.println("Child Thread!!");
		}
	}

	public void run(int i) {
		System.out.println(i);
	}

	public void m1(String str) {
		if (str == null) {
			System.out.println("VOID");
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
		System.out.println(sb);
	}

	public void m2(String str) {
		int index = 2;
		String[] sSplit = str.split(" ");
		if (index >= 0 && index < sSplit.length) {
			System.out.print("Output:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("Invalid index");
		}
	}

	public void m3(int Value) {
		System.out.println("\n**************");
		int k = 1;
		for (int i = 1; i <= Value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m4(String str) {
		int count = 0;
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		for (char c : ch) {
			count++;
		}
		System.out.println("length of string is:: " + count);
	}

}
