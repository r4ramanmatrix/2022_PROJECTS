package sorting_searching_techniques;

public class Selection_Sort {

	public static void m1(int[] num) {
		int min, temp = 0;
		for (int i = 0; i < num.length; i++) {
			min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[min]) {
					min = j;
				}
			}
			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 16, 8, 111, 99 };
		m1(arr);
	}

}
