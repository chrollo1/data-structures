package ds;

import java.util.Stack;

public class ReverseStringWithStack {

	public static void reverse(StringBuffer s) {
		
		int n = s.length();
		Stack<Character> st = new Stack<>();

		// push chars of string 
		for (int i = 0; i < n; i++) {
			st.push(s.charAt(i));
		}

		for (int i = 0; i < n; i++) { 
			char ch = st.pop();
			s.setCharAt(i,ch);
		}
	} 

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		reverse(sb);

		System.out.println("reversed is: " + sb);
	}
	
}
