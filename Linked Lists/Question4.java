package io.github.antoniosj.linkedlists;

import java.util.LinkedList;

/* Write code to partition a linked list around a value x, such that all nodes less than
 * x come before all nodes greater than or equal to x. If x is contained within the list,
 * the values of x only need to be after the elements less than x. The partition x can appear
 * anywhere in the "right partition"; it does not need to appear between the left and right partitions.
 * */

public class Question4 {

	public static LinkedList<Integer> interceptionList(LinkedList<Integer> linkedNodes, int k){
		LinkedList<Integer> newNode = new LinkedList<>();
		LinkedList<Integer> temp = new LinkedList<>();
		for (int i = 0; i < linkedNodes.size(); i++) {
			if (linkedNodes.get(i) < k && linkedNodes.get(i) != null){
				newNode.add(linkedNodes.get(i));
			} else {
				temp.add(linkedNodes.get(i));
			}
		}
		newNode.addAll(temp);
		return newNode;
	} 
	
	public static void main(String[] args) {
		
		LinkedList<Integer> node = new LinkedList<>();
		node.add(3);
		node.add(5);
		node.add(8);
		node.add(5);
		node.add(10);
		node.add(2);
		node.add(1);
		
		LinkedList<Integer> n = interceptionList(node, 5);
		
	}

}
