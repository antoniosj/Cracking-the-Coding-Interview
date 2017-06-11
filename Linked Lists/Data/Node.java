package io.github.antoniosj.linkedlists;

	class Node {
		int data;
		Node next = null;
		
		public Node(int d) {
			data = d;
		}
		
		public void appendToTail(int d) {
			Node end = new Node(d);
			Node n = this;
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
			//System.out.println(n.next.data);
		}
		
		public Node deleteNode(Node head, int d){
			Node n = head;
			if (n.data == d){
				return head.next; /* moved head */
			}
			
			while (n.next != null) {
				if (n.next.data == d) {
					n.next = n.next.next;
					return head; /* head didn't change */
				}
				n = n.next;
			}
			return head;
		}
		
		public void myLinkedList(Node head){
			while (head != null){
				System.out.print(head.data + " "); //this is for visualization XD (its ugly, I know).
				head = head.next; 
			}
		}
			
		public static void main(String[] args) {
			Node n = new Node(0);
			n.appendToTail(1);
			n.appendToTail(2);
			n.appendToTail(3);
			n.myLinkedList(n);
			//System.out.println(n.data);
		}
	}
	
