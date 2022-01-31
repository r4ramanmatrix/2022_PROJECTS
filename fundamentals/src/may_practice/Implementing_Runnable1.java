package may_practice;

public class Implementing_Runnable1 implements Runnable {

	public void run() {
		String statement = "thIS iS tHe String statEMent";
		m1(statement);
		m2(statement);
		int val = 10;
		m3(val);
		m4(val);
		m5(statement);
		m6(statement);
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
		} else {
			System.out.println("Invalid index!");
		}
	}

	public void m2(String str) {
		if (str == null || str.isEmpty()) {
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
		System.out.println("\n" + sb);
	}

	public void m3(int Value) {
		int k = 1;
		for (int i = 1; i <= Value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m4(int div) {
		System.out.println("****************");
		for (int i = 1; i <= div; i++) {
			if (div % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m5(String str) {
		System.out.println("*********************");
		int count = 0;
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();

		for (char c : ch) {
			count++;
		}
		System.out.println("count of character in string:: " + count);
	}

	public void m6(String str) {
		System.out.println("*********************");
		String search_String = "thIS";
		boolean isPresent = str.contains(search_String);
		System.out.println("Result is:: " + isPresent);

		System.out.println("*********************");
		boolean isPresent_1 = str.matches("(.*)" + search_String + "(.*)");
		System.out.println("Result is:: " + isPresent_1);

		System.out.println("*********************");
		boolean isPresent_2 = str.indexOf(str) != -1;
		System.out.println("Result is:: " + isPresent_2);
	}
}
