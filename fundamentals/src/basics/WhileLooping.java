package basics;

public class WhileLooping {
	
	public static void main(String[] args) {
		
	
	
	int numbers=987654321;
	
	int rev=0;
	int num=1;
	int num2=1;
	
	while(numbers!=0) {
		rev=rev*10+numbers%10;
		numbers=numbers/10;
	}
	System.out.println("Numbers after reversing: " + rev);
	
	
	int count=0;
	
	while(count<25) {
		count = count +5;
		System.out.println(count);
	}
	System.out.println("printing numbers from 1 t0 10");
	while(num<=10) {
		System.out.println(num);
		num++;
	}
	
	System.out.println("***********");
	
	do {
		System.out.println(num2);
		num2++;
	}while(num2<=10);
	
	System.out.println("*************");
	
	do {
		count=count+5;
		System.out.println(count);
	}while(count<=25);
	
	
}
}