package queue;

import java.util.PriorityQueue;

public class Queueing_Comparator {
	
	public void m1() {
		PriorityQueue que=new PriorityQueue<>(15, new QueComparator());
		que.offer(1);
		que.offer(6);
		que.offer(5);
		que.offer(7);
		que.offer(3);
		que.offer(0);
		System.out.println(que);
		
		
	}
	
	public static void main(String[] args) {
		Queueing_Comparator obj=new Queueing_Comparator();
		obj.m1();
	}

}
