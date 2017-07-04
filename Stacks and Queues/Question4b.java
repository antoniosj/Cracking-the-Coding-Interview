package io.github.antoniosj.stack_queue;

import java.util.Stack;

public class Question4b {

	public static class MyQueue<E> {

		Stack<E> mainStack;
		Stack<E> auxStack;

		public MyQueue() {
			mainStack = new Stack<E>();
			auxStack = new Stack<E>();
		}

		public void add(E value) {
			mainStack.add(value);
		}

		public E remove() {
			if (mainStack.isEmpty())
				return null;
			transferStack(mainStack, auxStack);

			E poll = auxStack.pop();

			transferStack(auxStack, mainStack);

			return poll;
		}

		public E peek() {
			if (mainStack.isEmpty())
				return null;

			transferStack(mainStack, auxStack);

			E peekInteger = auxStack.peek();

			transferStack(auxStack, mainStack);

			return peekInteger;
		}

		private void transferStack(Stack<E> from, Stack<E> to) {
			while (!from.empty()) {
				E i = from.pop();
				to.push(i);
			}
		}

	}

	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<>();
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
