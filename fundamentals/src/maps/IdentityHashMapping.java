package maps;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class IdentityHashMapping {
	
	
	public void m1() {
	
		IdentityHashMap imap=new IdentityHashMap<>();
		Integer I1=new Integer(7);
		Integer I2=new Integer(7);
		imap.put(1, "Monday");
		imap.put(2, "Tuesday");
		imap.put(3, "Wednesday");
		imap.put(4, "Thursday");
		imap.put(5, "FRiday");
		imap.put(6, "Saturday");
		imap.put(I1, "Sunday");
		imap.put(7, "Another Day");  //Duplicate Key allowed
		imap.put(I2, "Tired Day");
		
		Set s=imap.entrySet();
		System.out.println(s); //Order not preserved
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		IdentityHashMapping ihm=new IdentityHashMapping();
		ihm.m1();
	}

}
