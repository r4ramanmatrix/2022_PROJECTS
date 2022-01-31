package strings;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring {

	public static int lengthOfLongestSubstring(String str) {
		int maxCount = 0;
		int i = 0;
		int j = 0;
		int strLength = str.length();

		Set<Character> sSet = new HashSet<>();
		while (i < strLength && j < strLength) {
			if (!sSet.contains(str.charAt(j))) {
				sSet.add(str.charAt(j));
				j++;
				maxCount = Math.max(maxCount, j - i);
			} else {
				sSet.remove(str.charAt(i));
				i++;
			}
		}
		return maxCount;

	}

	public static void main(String[] args) {
		String str1 = "ramnkumar";
		int lengthOfSub = lengthOfLongestSubstring(str1);
		System.out.println("Length:: " + lengthOfSub);
	}

}
