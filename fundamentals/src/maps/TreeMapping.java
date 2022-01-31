package maps;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapping {
	
	public void m1() {
		SortedMap smap=new TreeMap<>();
		smap.put(101, "A");
		smap.put(102, "B");
		smap.put(103, "C");
		smap.put(104, "D");
		smap.put(107, "E");
		smap.put(125, "F");
		smap.put(135, "G");
		
		
		Set s1=smap.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey() + " - " + m1.getValue());
		}
		
		//smap.put(null, "Z");
		
		//System.out.println(s1);
		
		/*SortedMap asmap=new TreeMap();
		asmap.put(null, "Z");
		
		System.out.println(asmap);*/   //Valid till 1.6 version
		
		smap.put(147, null);
		smap.put(150, 000.01);
		//smap.put("A", 123);  //ClassCastException due to key is String type or heterogeneous
		
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		TreeMapping obj=new TreeMapping();
		obj.m1();
	}

}
