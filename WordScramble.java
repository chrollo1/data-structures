package ds_practice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class WordScramble {

	static PriorityQueue<String> pq = new PriorityQueue<>();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean[] vis = new boolean[s.length()];
		app("", s, vis);
		
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}
	
	public static void app(String s1, String s2, boolean[] vis) {
		
		/* if edited string->length ==  init string->:
		 * 		add it to pq (it will order lexo.)
		 * else:
		 * 		loop through the init string [i...len]
		 * 			if !vis[i]:
		 * 				vis[i] = true
		 * 				recurse: s1 + charat[i], init, vis
		 * 				vis[i] = false (must reset)
		 */
		
		
		if (s1.length() == s2.length()) {
			pq.add(s1);
		} else {
			for (int i = 0; i < s2.length(); i++) {
				if (!vis[i]) {
					vis[i] = true;					
					app(s1 + s2.charAt(i), s2, vis);
					vis[i] = false;
				}
			}			
		}		
	}

}
