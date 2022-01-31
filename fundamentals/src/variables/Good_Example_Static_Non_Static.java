package variables;

public class Good_Example_Static_Non_Static {
	
	static int i=0;
	int j=0;
	
	public Good_Example_Static_Non_Static() {
		i++;
		j++;
		System.out.println("Value of j(non-static variable): " + j +  " Value of i(static variable): " + i);
	}
	
	public static void main(String[] args) {
		Good_Example_Static_Non_Static obj1=new Good_Example_Static_Non_Static();
		Good_Example_Static_Non_Static obj2=new Good_Example_Static_Non_Static();
		Good_Example_Static_Non_Static obj3=new Good_Example_Static_Non_Static();
	}

}
