package strings;

public class String_Reverse {

	public String reverseStr(String str) {
		int i = str.length() - 1;
		String result = "";
		while (i >= 0) {
			while (i >= 0 && str.charAt(i) == ' ')
				i--;
			int j = i;
			if (i < 0) {
				break;
			}
			while (i >= 0 && str.charAt(i) != ' ')
				i--;
			if (result.isEmpty()) {
				result = result.concat(str.substring(1 + i, 1 + j));
			} else {
				result = result.concat(" " + str.substring(1 + i, 1 + j));
			}
		}
		return result;
	}

	public void m1(String str) {
		str = str.replaceAll("\\s+", " ").trim();
		System.out.println("Before String :: " + str);
		if (str == null || str.isEmpty()) {
			System.out.println("VOID!!");
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
		System.out.println("After String:: " + sb);
	}

	public static void main(String[] args) {
		String statement = "welcome to the  java world  ";
		String statement_1 = "welComE tO thE  jAVa wORLd  ";
		String_Reverse obj1 = new String_Reverse();
		System.out.println(obj1.reverseStr(statement));
		obj1.m1(statement_1);
	}
}
