package method_type;

public class PassingArrayToMethod {
	
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5};
		PassingArrayToMethod obj=new PassingArrayToMethod();
		obj.m1(num);
	}
	
	public void m1(int numbers[]) {
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}

}
