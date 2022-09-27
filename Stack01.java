package day05;

import java.util.Stack;

public class Stack01 {
	// LIFO(후입선출)
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println(st);
		
		// 입력값을 리턴
		Integer push =st.push(1);
		System.out.println(push);
		
		Integer pop = st.pop();		
		System.out.println("pop value : "+pop);
		System.out.println(st);
		
		// 마지막 값을 확인하기
		Integer peek = st.peek();
		System.out.println("st : "+st);
		System.out.println("peek : "+peek);
		
		int size = st.size();
		for(int i=0; i < size; i++) {
			Integer getPeek = st.peek();
			System.out.println("getPeek : " + getPeek);
		}
		
		
		
		
		
	}
}
