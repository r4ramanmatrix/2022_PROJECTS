package arrays_pkg;

public class ReturnAnArrayToMetod {

	public int[] m1() {
		int[] num = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
		return num;
	}

	public static void main(String[] args) {
		ReturnAnArrayToMetod obj = new ReturnAnArrayToMetod();
		int[] arr = obj.m1();
		System.out.println("Array elements are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
