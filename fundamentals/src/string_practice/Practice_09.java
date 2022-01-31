package string_practice;

public class Practice_09 {

	public void m1(String[] str) {
		String search = "is";
		String temp = null;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted string array elements:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		int count = 0;

		System.out.println("Search an element using linear search algorithm:: ");
		for (int i = 0; i < str.length; i++) {
			if (search.equalsIgnoreCase(str[i])) {
				count++;
				System.out.println("Yes " + search + " Present");
			}
		}
		if (count == 0) {
			System.out.println("Not Present");
		}

	}

	public int m2(String[] str) {
		String temp = null;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted string array elements:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		System.out.println("Search an element using Binary search algorithm:: ");
		String search = "base";
		int left = 0, right = str.length - 1;
		int m;
		while (left <= right) {
			m = (left + right) / 2;
			if (str[m].compareTo(search) < 0) {
				left = m + 1;
			} else if (str[m].compareTo(search) > 0) {
				right = m - 1;
			} else {
				return m;
			}
		}

		return -1;
	}

	public void m1(String str) {
		
	}

	public static void main(String[] args) {
		String str1 = "processor";
		String str2 = "this is the processor based string";
		String[] arr = str2.split(" ");
		new Practice_09().m1(arr);
		System.out.println("the searching string element present at index number :: " + new Practice_09().m2(arr));
	}

}
