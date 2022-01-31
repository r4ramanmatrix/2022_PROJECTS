package sorting_searching_techniques;

public class BinarySearch {

	public static int[] arr = { 1, 2, 5, 6, 7, 9 };
	static int search_number = 8;

	public static void search(int[] num) {
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (num[mi] == search_number) {
				System.out.println("Element is at " + mi + " index position.");
				break;
			} else if (num[mi] < search_number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("Element not found in an array!!");
		}
	}

	public static void main(String[] args) {
		search(arr);
	}

}
