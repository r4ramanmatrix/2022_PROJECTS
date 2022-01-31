package arrays_pkg;

public class ArrayClass1 {
	
	static int[] age=new int[5];
	
	static int[] age2=new int[6];
	
	public static void m1() {
		
		System.out.println("Length of the array is : "+ age.length);
		System.out.println("Length of the array is : "+ age2.length);
		
		age[1]=99;
		age[2]=0;
		age[0]=101;
		age[3]=808;
		age[4]=909;
		
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i]);
		}
		
		age2=age;
		
		System.out.println("***************");
		
		for(int i=0;i<age2.length;i++) {
			System.out.println(age2[i]);
		}
		
		System.out.println("XXXXXXXXXXXXXXXX");
		
		age2[4]=999;
		
		for(int q:age2) {
			System.out.println(q);
		}
		
		
	}
	
	public static void main(String[] args) {
		m1();
	}

}
