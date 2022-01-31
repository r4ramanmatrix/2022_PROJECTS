package arrays_pkg;

public class UsingStudent {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(21, "Raman");
		arr[1] = new Student(24, "Rama");
		arr[2] = new Student(23, "Ram");
		arr[3] = new Student(25, "Ra");
		arr[4] = new Student(27, "R");
		// arr[5] = new Student(30, "");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at " + i + " :: " + arr[i].roll_no + " " + arr[i].name);
		}

	}

}
