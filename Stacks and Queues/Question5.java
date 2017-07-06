package io.github.antoniosj.stack_queue;

import java.util.Stack;

/*
 * Write a program to sort a stack such that the smallest items are on the top. You can use an addtional temporary stack,
 * but you may not copy the elements into any other data structure (such as an array). The stack supports the following operations: 
 * push, pop, peek, isEmpty
 */

public class Question5 {

	public static Stack<Integer> sortStack(Stack<Integer> mainStack) {
		Stack<Integer> auxStack = new Stack<>();
		int tmp = 0;

		while (!mainStack.isEmpty()) {
			tmp = mainStack.pop();
			while (!auxStack.isEmpty() && auxStack.peek() > tmp) {
				mainStack.push(auxStack.pop());
			}
			auxStack.push(tmp);
		}

		while (!auxStack.isEmpty()){
			mainStack.push(auxStack.pop());
		}
		return mainStack;
	}
	
	
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		myStack.add(1);
		myStack.add(3);
		myStack.add(2);
		myStack.add(4);
		
		myStack = sortStack(myStack);
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}
	
}
