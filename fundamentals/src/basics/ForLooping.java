package basics;

public class ForLooping {
	
	public static void main(String[] args) {
		int count=0;
		System.out.println("Increment: ");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("Decrement: ");
		
		for(int i=10;i>=1;i--) {
			if(i==8) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Skipping number: ");
		
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
			if(i==5) {
				System.out.println("Yes 5 is present");
				break;
			}
		}
		
		int numbers[]= {11,2,3,4,5,6};
		
		for(int num:numbers) {
			System.out.println(num);
		}
	}

}
