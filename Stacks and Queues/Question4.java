package io.github.antoniosj.stack_queue;

import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Stack;

/*
 * 3.4 Implement a MyQueue class which implements a queue using two stacks.
 * */

public class Question4 {

	public static class MyQueue {

		Stack<Integer> mainStack;
		Stack<Integer> auxStack;

		public MyQueue() {
			mainStack = new Stack<Integer>();
			auxStack = new Stack<Integer>();
		}

		public void add(int value) {
			mainStack.add(value);
		}

		public Integer remove() {
			if (mainStack.isEmpty()) return null;
			while (!mainStack.isEmpty()){
				int i = mainStack.pop();
				auxStack.push(i);
			}
			int poll = auxStack.pop();
			
			while (!auxStack.isEmpty()){
				int i = auxStack.pop();
				mainStack.push(i);
			}			
			return poll;
		}
		
		public Integer peek() {
			if (mainStack.isEmpty()) return null;
			
			while (!mainStack.empty()) {
				int i = mainStack.pop();
				auxStack.push(i);
			}
			
			int peekInteger = auxStack.peek();
			
			while (!auxStack.isEmpty()){
				int i = auxStack.pop();
				mainStack.push(i);
			}			
			return peekInteger;
		}

	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.peek());
		q.remove();
		System.out.println(q.peek());
		q.remove();
		q.remove();
		
	}

}
