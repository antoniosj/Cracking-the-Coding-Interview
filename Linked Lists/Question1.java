package io.github.antoniosj.linkedlists;

import java.util.Hashtable;

/* Remove Dups
 * Write code to remove duplicates from an unsorted linked list 
 * FOLLOW UP 
 * How would you solve this problem if a temporary buffer is not allowed?
 */

public class Question1 {
	
	Hashtable<Integer, Integer> hash = new Hashtable<>();
	int qty = 0;
	
	public void removeDups(Node node) {
		Node a = node;
		 
		while (node != null){
			
			if (!hash.containsKey(node.data)){
				hash.put(node.data, 1);
			} else {
				node.deleteNode(a, node.data);
			}
			
			node = node.next; 
		}
		
	}

	public static void main(String[] args) {
		Node n = new Node(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		
		n.myLinkedList(n);
		
		Question1 q = new Question1();
		q.removeDups(n);
		n.myLinkedList(n);
		
	}

}
