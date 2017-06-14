package io.github.antoniosj.linkedlists;

/* Return Kth to last
 * Implement an algorithm to find the Kth to last element of a singly linked list
 */
public class Question2 {

	public static Node findKthToLast(Node head, int k) {

		Node p1 = head;
		Node p2 = head;
		
		for(int i = 0; i < k; i++) {
			if (p1 == null) return null;
			p1 = p1.next;
		}
		
		while (p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}

	public static void main(String[] args) {

		Node node = new Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(4);
		node.appendToTail(5);
		node.appendToTail(6);
		node = findKthToLast(node, 3);
		node.myLinkedList(node);
	}
}
