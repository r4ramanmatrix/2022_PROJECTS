package strings;

public class StringToint {
	
		static String name="123456";
	
	public static void main(String[] args) {
		
		System.out.println("Value of String: " + name);
		
		name=name+1;
		
		System.out.println("Value after adding 1 to String " + name);
		
		Integer num=new Integer(name);
		
		System.out.println("Value of number after converting : " + num);
		
		num=num+1;
		
		System.out.println(num);
		
		int result=Integer.parseInt(name);
		System.out.println(result+100);
		
		Integer result2=Integer.valueOf(name);
		
		System.out.println(result2);
		
		int i=Integer.parseInt("500");
		System.out.println(i+1);
		
		String s1=String.valueOf(result);
		System.out.println(s1+1);
		
		String s2=Integer.toString(i);
		
		System.out.println(s2+500);
		
		
	}

}


