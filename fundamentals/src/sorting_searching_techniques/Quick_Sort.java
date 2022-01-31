package sorting_searching_techniques;

public class Quick_Sort {

	public int partion(int[] num, int low, int high) {
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
		int pi = partion(num, low, high);
		if (low < pi - 1) {
			quickSort(num, low, pi - 1);
		}
		if (pi < high) {
			quickSort(num, pi, high);
		}
	}

	public void printArray(int[] num) {
		for (int i : num) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 99, 21, 33, 100 };
		Quick_Sort obj1 = new Quick_Sort();
		obj1.quickSort(arr, 0, arr.length - 1);
		obj1.printArray(arr);
	}

}
