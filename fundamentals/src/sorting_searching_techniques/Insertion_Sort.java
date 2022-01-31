package sorting_searching_techniques;

public class Insertion_Sort {

	public static void m1(int[] num) {
		int temp, j = 0;
		for (int i = 1; i < num.length; i++) {
			temp = num[i];
			j = i;
			while (j > 0 && num[j - 1] > temp) {
				num[j] = num[j - 1];
				j = j - 1;
			}
			num[j] = temp;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 80, 5, 1, 4, 77, 11, 22, 100 };
		m1(arr);
		System.out.println("****************");
		int temp, j = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
