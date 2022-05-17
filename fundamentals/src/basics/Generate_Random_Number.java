package basics;

import java.util.Random;

public class Generate_Random_Number {
	
	public static void main(String[] args) {
		Random ran = new Random();
		int x = ((int)(Math.random() * 100000)) % 1000;
		System.out.println(x);
		long l = ((long)(Math.random() * 10000000000l)) % 10000000000l;
		System.out.println(l);
		
		int y = ((int)(Math.random() * 100000)) % 100000;
		System.out.println(y);
	}

}
