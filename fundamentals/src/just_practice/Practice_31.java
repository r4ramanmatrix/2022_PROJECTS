package just_practice;

public class Practice_31 implements Cloneable {

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reversed:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void m2(int[] num) {
		int sum = 0;
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
		System.out.println("Sorted array elements:: ");
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.println(num[i]);
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Second heighest array element:: " + num[num.length - 2]);
		System.out.println("Average of array:: " + sum / num.length);
	}

	public void m3(int[] num) {
		
	}

	public static void main(String[] args) {
		int[] arr = { 77, 1, 22, 0, 11, 0, -99 };
		Practice_31 obj1 = new Practice_31();
		try {
			Practice_31 obj2 = (Practice_31) obj1.clone();
			obj2.m1(arr);
			obj2.m2(arr);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
