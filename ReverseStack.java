package ds;

import java.util.Stack;

public class ReverseStack {
	
    public static Stack<Character> st = new Stack<>();

    static void insert_at_bottom(char x) {
 
        if(st.isEmpty()) {
            st.push(x);
        }
        else {
             
        	/* peek items, call until end of stack reached
        	 *
        	 *  if empty:
        	 *  	-> size is 0
        	 *  	x is interted at bottom
        	 */
        	
            char a = st.peek();
            st.pop();
            insert_at_bottom(x);
 
            /*
             * push all items 
             * call stack once x is at bottom
             * 
             */

            st.push(a);
        }
    }
     
    static void reverse() {
        if(st.size() > 0) {
             
            // store items, call until end of stack reached
            char x = st.peek();
            st.pop();
            reverse();
             
            // bot to top...
            insert_at_bottom(x);
        }
    }
     
    public static void main(String[] args) {
         
        st.push('a');
        st.push('b');
        st.push('c');
        st.push('d');
         
        System.out.println("original: " + st);
        
        reverse();        
        
        System.out.println("reversed: " + st);
    }
	
}
