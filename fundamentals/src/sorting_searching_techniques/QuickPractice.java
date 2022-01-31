package sorting_searching_techniques;

public class QuickPractice implements Cloneable {

	public int divideConquer(int[] num, int low, int high) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (num[low] < pivot) {
				low++;
			}
			while (num[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = num[low];
				num[low] = num[high];
				num[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	public void quickSort(int[] num, int low, int high) {
		int pi = divideConquer(num, low, high);
		if (low < pi - 1) {
			quickSort(num, low, pi - 1);
		}
		if (pi < high) {
			quickSort(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("\nSorted elements:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}



	public static void main(String[] args) {
		int[] arr = { 44, 5, 6, 8, 1, 2, 11, 0 };
		System.out.println("Array elements:: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		QuickPractice obj1 = new QuickPractice();
		try {
			QuickPractice obj2 = (QuickPractice) obj1.clone();
			obj2.quickSort(arr, 0, arr.length - 1);
			obj2.sortedArray(arr);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
