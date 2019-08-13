import java.util.Stack;

public class SortStack {
	// Recursive Method to insert an item x in sorted way
	static void sortedInsert(Stack<Integer> st, int x) {
		
		/* 
		 * if stack is empty:
		 *	then push x
		 *		
		 *		or
		 *
		 *  if x is greater than top of curr stack
		 *  	then push x
		 *
		 */
		
		if (st.isEmpty() || x > st.peek()) {
			st.push(x);
			return;
		}

		// if top is greater... pop top and recur
		int temp = st.pop();
		sortedInsert(st, x);

		// return prev removed item
		st.push(temp);
	}

	static void sortStack(Stack<Integer> st) {
		if (!st.isEmpty()) {
			// store and remove top
			int x = st.pop();

			// sort after removal
			sortStack(st);

			// push top item back into stack
			sortedInsert(st, x);
		}
	}

	public static void main(String[] args) {	
		Stack<Integer> st = new Stack<>();
		
		st.push(-1);
		st.push(-Integer.MIN_VALUE);
		st.push(Integer.MAX_VALUE);
		st.push(0);
		st.push(46);

		System.out.println("before sort:\n" + st);

		sortStack(st);

		// from left to right... max to min
		System.out.println("\n\nafter sort:\n" + st);

	}
}
