package basics;

import java.util.Scanner;

public class If_Statement {
	
	public static void main(String[] args) {
		
		
		
		Scanner sin=new Scanner(System.in);
		System.out.println("Please enter a day: ");
		String day=sin.next();
		System.out.println("Please enter the day number: ");
		int iDay=sin.nextInt();
		
		if(day=="Sunday") {
			System.out.println("Today is sunday");
		}else if(iDay==7) {
			System.out.println("Today is Sunday");
		}else if(day.equalsIgnoreCase("Sunday") && iDay==7) {
				System.out.println("Today is 100% Sunday!!");
		}else {
			System.out.println("Today is not Sunday :-( !!!");
		}
	}

}
