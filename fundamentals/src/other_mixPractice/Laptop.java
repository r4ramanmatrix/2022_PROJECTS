package other_mixPractice;

public class Laptop {

	String Brand;
	int life;
	int serial_number;

	public Laptop(String Brand, int life, int serial_number) {
		this.Brand = Brand;
		this.life = life;
		this.serial_number = serial_number;
	}

	public String toString() {
		return "Laptop Brand Name:: " + Brand + " Life of Laptop:: " + life + " Serial Number is:: " + serial_number;
	}

}
