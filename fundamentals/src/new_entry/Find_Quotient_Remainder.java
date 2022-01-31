package new_entry;

public class Find_Quotient_Remainder {

	public void m1(int number1, int number2) {
		if (number1 > number2) {
			System.out.println("Quotient is:: "+number1/number2);
			System.out.println("Remainder is:: "+number1%number2);
		}else{
			System.out.println("Quotient is:: "+number2/number1);
			System.out.println("Remainder is:: "+number2%number1);
		}
	}

	public static void main(String[] args) {
		Find_Quotient_Remainder obj = new Find_Quotient_Remainder();
		obj.m1(3, 55);
		
	}

}
