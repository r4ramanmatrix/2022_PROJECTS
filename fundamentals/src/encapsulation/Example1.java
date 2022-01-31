package encapsulation;

public class Example1 {

	private double balance = 100000.80;
	public int a = 100;

	int age;
	String name;

	public Example1(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public double getBalance() {
		System.out.println("Account balance is: " + balance);
		return balance;
	}

	public static void main(String[] args) {

	}

}
