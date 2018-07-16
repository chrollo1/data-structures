package linkedlist;

//A simple Java program for traversal of a linked list
public class LinkedListTraversal {

	public Node head;  // head of list

	static class Node {
		int data;
		Node next;
		Node(int d)  { 
			this.data = d; 
			next = null; 
		} 
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}

	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args) {
		LinkedListTraversal llist = new LinkedListTraversal();

		llist.head  = new Node(1);
		Node second = new Node(2);
		Node third  = new Node(3);

		llist.head.next = second;
		second.next = third; 

		llist.printList();
	}

}