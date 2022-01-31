package sorting_searching_techniques;

public class Bubble_Sort {

	public static void m1(int[] num) {
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println("Array sorted by using bubble sort:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 80, 5, 1, 4, 77, 11, 22, 100 };
		m1(arr);
	}

}
