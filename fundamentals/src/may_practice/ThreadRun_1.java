package may_practice;

public class ThreadRun_1 extends Thread {

	public void run() {
		System.out.println("Using Child Thread!");
		int[] arr = { 44, 88, 99, 22, 1, 0, 0, -9, 100 };
		quickSort(arr, 0, arr.length - 1);
		sortedArray(arr);

	}

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
		if (low < pi-1) {
			quickSort(num, low, pi - 1);
			
		}
		if (pi < high) {
			quickSort(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Sorted Array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

}
