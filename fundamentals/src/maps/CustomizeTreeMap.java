package maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CustomizeTreeMap {
	
	public void m1() {
		TreeMap tmap=new TreeMap<>(new ComparatorForTree());
		tmap.put("AAA", 1);
		tmap.put("BBB", 2);
		tmap.put("CCC", 3);
		tmap.put("ccc", 4);
		tmap.put("DDD", 5);
		tmap.put("EEE", 6);
		tmap.put("ABC", 7);
		
		Set s=tmap.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}
	
	public static void main(String[] args) {
		CustomizeTreeMap cobj=new CustomizeTreeMap();
		cobj.m1();
	}

}
