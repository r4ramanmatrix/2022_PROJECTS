package interview_basic;

import java.util.Scanner;

public class CreateCalc {
	
	public static void main(String[] args) {
		
		int resut=0;
		Scanner sin=new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num1=sin.nextInt();
		System.out.println("Please enter the second number: ");
		int num2=sin.nextInt();
		System.out.println("Please select the symbol(+,-,/,*) for calculation: ");
		String sym=sin.next();
		switch(sym) {
		case "+" : resut=num1+num2;
		System.out.println("Addition of two numbers are: " + resut);
		break;
		
		case "-":resut=num1-num2;
		System.out.println("Subtraction of two numbers are: " + resut);
		break;
		
		case "/":resut=num1/num2;
		System.out.println("Divison of two numbers are: " + resut);
		break;
		
		case "*":resut=num1*num2;
		System.out.println("Multiplication of two numbers are: " + resut);
		break;
			
		default:
			System.out.println("Invalid Symbol!!!");
			break;
		}
		
		
	}

}
