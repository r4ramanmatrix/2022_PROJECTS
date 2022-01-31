package arrays_pkg;

public class PassingArrayToMetod {

	public static void main(String[] args) {
		String[] carBrands = { "Audi", "Merc", "BMW", "Hyundai" };
		PassingArrayToMetod obj = new PassingArrayToMetod();
		obj.m1(carBrands);
		String onlyString = "!#!@@%#$R785876a:>>m)(*%$567328&^a<>?n";
		System.out.println("Only String values: " + onlyString.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Numbers: " + onlyString.replaceAll("[^0-9]", ""));
	}

	public void m1(String[] cars) {
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
