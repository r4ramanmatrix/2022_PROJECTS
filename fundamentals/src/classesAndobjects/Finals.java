package classesAndobjects;

public final class Finals {
	
	final static int num=99;
	
	public final void m1() {
		System.out.println("This is non static final method!");
	}
	
	public static final void m1(String name) {
		System.out.println("This is static final method!!");
		System.out.println("Name is: " + name);
	}
	
	public static int[] numbers() {
		int[] numbers= {11,2,3,-10,99};
		return numbers;
	}
	public static void main(String[] args) {
		System.out.println("Final Static Variable is: " + num);
		Finals obj=new Finals();
		obj.m1();
		m1("Raman Kumar");
		
		int[] arr=numbers();
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}

}
