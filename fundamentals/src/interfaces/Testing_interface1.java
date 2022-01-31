package interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Testing_interface1 {
	
	String name="Raman";
	
	final String name2="Kumar";
	
	int age=30;
	
	public void m1();
	
	default void m1(String name) {
		System.out.println(name);
		
	}
	
	public static void m1(int age) {
		System.out.println(age);
		
	}
	
	
	List<Integer> store=new ArrayList<Integer>();
	
	
	
	public static void main(String[] args) {
		
		Testing_interface1.m1(age);
		Testing_interface1 obj;
	}

}
