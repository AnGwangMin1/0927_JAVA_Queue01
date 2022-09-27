package day05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
	// FIFO(선입선출)
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		q.offer("플랜트 사업부");
		q.offer("엔진 사업부");
		q.offer("로봇 사업부");
		q.offer("에너지 사업부");
		
		System.out.println(q);
		
		int size = q.size();
		
		for(int i=0; i < size; i++) {
			String poll = q.poll();
			System.out.println("poll value : " + poll);
		}
		
		q.add("호텔");
		q.add("리조트");
		q.add("여행업");
		q.add("면세점");
		
		System.out.println(q);
		// Iterator 이용해서 출력하기 
		Iterator<String> iterator = q.iterator();
		
		while(iterator.hasNext()) {
			String nextVal = iterator.next();
			System.out.println(nextVal);
		}
		
	}
}
