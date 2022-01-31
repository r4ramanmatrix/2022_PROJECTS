package strings;

public class Reverse_Sentence_By_Words {

	public void m1(String str) {
		int i = str.length() - 1;
		String res = "";

		while (i >= 0) {
			while (i >= 0 && str.charAt(i) == ' ')
				i--;
			int j = i;
			
			if (i < 0) {
				break;
			}
			
			while (i >= 0 && str.charAt(i) != ' ')
				i--;
			if (res.isEmpty()) {
				res = res.concat(str.substring(i + 1, j + 1));
			} else {
				res = res.concat(" " + str.substring(i + 1, j + 1));
			}
		}

		System.out.println("Result is:: " + res);
	}

	public String reverseString(String s) {
		int i = s.length() - 1;
		String result = "";
		while (i >= 0) {
			while (i >= 0 && s.charAt(i) == ' ')
				i--;
			int j = i;
			if (i < 0) {
				break;
			}
			while (i >= 0 && s.charAt(i) != ' ')
				i--;
			if (result.isEmpty()) {
				result = result.concat(s.substring(i + 1, j + 1));
			} else {
				result = result.concat(" " + s.substring(i + 1, j + 1));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String sentence = "welcome to java";
		String ransomsentence = " this     is the    string statement     ";
		Reverse_Sentence_By_Words obj1 = new Reverse_Sentence_By_Words();
		obj1.m1(ransomsentence);
		System.out.println(obj1.reverseString(sentence));
	}
}
