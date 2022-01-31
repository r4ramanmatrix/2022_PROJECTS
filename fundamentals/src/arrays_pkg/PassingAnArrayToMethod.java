package arrays_pkg;

public class PassingAnArrayToMethod {
	
	
	public static void main(String[] args) {
		String carBrands[]= {"Audi","BMW","Merc","Honda"};
		PassingAnArrayToMethod obj=new PassingAnArrayToMethod();
		obj.Print_Array(carBrands);
		
		String name="643957436&*%^$00*%&Raman";
		String name2=name.replaceAll("[^a-zA-Z]", "");
		System.out.println("After removing numbers and special characters: "+name2);
		
		System.out.println("Only numbers: " + name.replaceAll("[^0-9]", ""));
		for(int i=name2.length()-1;i>=0;i--) {
			System.out.println(name2.charAt(i));
		}
		
		int numbers[]= {1,2,3,4,5,6,7,8,9};
		
		obj.Print_Numbers(numbers);
		
	}
	
	
	public void Print_Array(String []brands) {
		System.out.println("Brands of cars are: " );
		for(int i=0;i<brands.length;i++) {
			System.out.println(brands[i]);
		}
	}
	
	public void Print_Numbers(int num[]) {
		System.out.println("**************");
		System.out.println("Numbers are: ");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}		
		
	}

}
