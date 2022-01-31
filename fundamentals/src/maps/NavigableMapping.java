package maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapping {
	
	public void m1() {
		TreeMap nmap=new TreeMap<>();
		nmap.put(266, "Raman");
		nmap.put(264, "Mohit");
		nmap.put(260, "Naveen");
		nmap.put(20, "Krishan");
		nmap.put(850, "Parveen");
		
		Set s1=nmap.entrySet();
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey() + " - " + m1.getValue());
		}
		
		System.out.println("******************");
		
		System.out.println("FloorKey: "+ nmap.floorKey(264));
		System.out.println("LowerKey: "+ nmap.lowerKey(264));
		System.out.println("LowerKey: "+ nmap.lowerKey(20));
		System.out.println("CeilingKey: "+ nmap.ceilingKey(264));
		System.out.println("HigherKey: "+ nmap.higherKey(264));
		System.out.println("HigherKey: "+ nmap.higherKey(850));
		System.out.println("pollFirstEntry: "+ nmap.pollFirstEntry());
		System.out.println("pollLastEntry: "+ nmap.pollLastEntry());
		
		System.out.println("Tree Map in descending order: "+ nmap.descendingMap());
		
		System.out.println(nmap);
	}
	
	public static void main(String[] args) {
		NavigableMapping obj=new NavigableMapping();
		obj.m1();
	}

}
