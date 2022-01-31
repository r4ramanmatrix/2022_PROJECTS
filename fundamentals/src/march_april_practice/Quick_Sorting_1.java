package march_april_practice;

public class Quick_Sorting_1 {

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
	
	

	public void quickSorting(int[] num, int low, int high) {
		int pi = divideConquer(num, low, high);
		if (low < pi - 1) {
			quickSorting(num, low, pi - 1);
		}
		if (pi < high) {
			quickSorting(num, pi, high);
		}
	}
	
	

	public void sortedArray(int[] num) {
		// System.out.println("Sorted Array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 99, 21, 33, 100 };
		Quick_Sorting_1 obj1 = new Quick_Sorting_1();
		obj1.quickSorting(arr, 0, arr.length - 1);
		obj1.sortedArray(arr);
	}

}
