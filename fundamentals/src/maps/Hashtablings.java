package maps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashtablings {
	
	public void m1() {
		Hashtable h=new Hashtable<>();
		h.put(1, "A");
		h.put("B", 171);
		//h.put('D', null);
		//h.put(null, null);
		//h.put(null, "X");
		h.put(10.5, "Floating");
		h.put("String", "Raman");
		h.put("Double", 99.9);
		
		//System.out.println(h);
		
		Set s=h.entrySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+ " - " + m.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		Hashtablings hobj=new Hashtablings();
		hobj.m1();
	}

}
