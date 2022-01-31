package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queueing  {
	
	public void m1() {
		PriorityQueue que=new PriorityQueue<>();
		que.add(9);
		que.add(6);
		que.add(5);
		que.add(0);
		que.add(9);
		que.add(7);
		que.add(5);
		que.add(5);
		que.add(0);
		que.add(4);
		//que.add(null);
		
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		que.offer(0);
		System.out.println(que);
		
		PriorityQueue q=new PriorityQueue<>();
		System.out.println(q.peek());
		//System.out.println(q.element());
		for(int i=0;i<=10;i++) {
			q.offer(i);
		}
		
		System.out.println(q);
		
	}

	public static void main(String[] args) {
		Queueing obj=new Queueing();
		obj.m1();
	}
	
}
