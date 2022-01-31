package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapping {
	
	public void method() {
		 
		Map m1=new LinkedHashMap<>();
		m1.put(1, "Monday");
		m1.put(2, "Tuesday");
		m1.put(3, "Wednesday");
		m1.put(4, "Thursday");
		m1.put(5, "FRiday");
		m1.put(6, "Saturday");
		m1.put(7, "Sunday");
		
		Set s1=m1.entrySet();
		
		System.out.println(s1);  //All objects are showing in preserved order
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey() + " *** " + m.getValue());
			if(m.getKey().equals(5)) {
				m.setValue("Friday");
			}
		}
		
		HashMap mapping=new HashMap<>(m1);
		
		Set s2=mapping.entrySet();
		
		Iterator itr2=s2.iterator();
		while(itr2.hasNext()) {
			Map.Entry m2=(Map.Entry)itr2.next();
			System.out.println(m2.getKey()+ "-" + m2.getValue());
		}		
	}
	
	public static void main(String[] args) {
		LinkedHashMapping obj=new LinkedHashMapping();
		obj.method();
	}

}
