package io.github.antoniosj.linkedlists;

import java.util.HashMap;
import java.util.LinkedList;

/* Delete Middle Node
 * Implement an algorithm to delete a node in the middle of a singly linked list, given only access 
 * to that node.
 * Ex: 1, 2, 3. Del: 2.
 * */

public class Question3 {

	
	public static Node deleteMidNode(Node n){
		
		if (n == null || n.next == null) {
			return n;
		}
		
		Node delNode = n.next;
		n.data = delNode.data;
		n.next = delNode.next;
		
		return n;
	}
	
	public static void main(String[] args) {
		
		Node node = new Node(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.myLinkedList(node);
		deleteMidNode(node.next);
		node.myLinkedList(node);
		
		
	}

}
