package basics;

//for-each loop in java is the enhanced version of for loop. It is introduced from JDK 5. 
//It is used to iterate all elements of an array or Collection.

public class Foreach_Loop {
	
	double[] weight= {66.7,70.5,88.5,68.7,87.3,54.3};
	
	public void m1() {
		
		for(double d:weight) {
			System.out.println(d);
		}
	}
	
	public double[] m2() {
		double[] data=weight;
		
		System.out.println("***********************");
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		return data;
	}
	
	public static void main(String[] args) {
		Foreach_Loop obj=new Foreach_Loop();
		obj.m1();
		obj.m2();
	}

}
