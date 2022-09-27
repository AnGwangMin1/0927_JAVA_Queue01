package day05;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack02 {
	public static void main(String[] args) {
		Stack st = new Stack();
		String exp = "((((2+3)*1)+1)";
		
		try {
			for(int i = 0; i<exp.length(); i++) {
				char ch = exp.charAt(i);
				
				if(ch == '(') {
					st.push(ch);
				}else if(ch == ')') { 
					st.pop();
				}
			} // for
			
			if(st.isEmpty()) {
				System.out.println("괄호 일치");
			} else {
				System.out.println("괄호 불일치");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호 불일치");
		}
	}
}
