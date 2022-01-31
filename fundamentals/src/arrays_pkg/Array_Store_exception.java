package arrays_pkg;

public class Array_Store_exception {
	
	static Object[] name=new String[3];
	
	//static int[] age=new int[-3];   //java.lang.NegativeArraySizeException
	
	static int[] age2=new int[3] ;
	static int[] age3=new int[13] ;
	
	public static void m1() {
		
		//name[0]=100;   // java.lang.ArrayStoreException 
		name[2]="100";
		
		age2=age3;   //Compiler checks only type, not the size
		System.out.println(new int[] {11,22,33,44,55}.length);  //Anonymous array
		System.out.println(new double[] {11.1,22.2,33.3,44.4,55.5}[3]);
	}

	public static void main(String[] args) {
		m1();
	}
	
}
