package com.miguel.test;

import com.miguel.LinkedList;
import com.miguel.Node;
import com.miguel.Stack;

public class Test {
	public static void main(String[] args) {
		
		LinkedList mylinkedList = new LinkedList();
		mylinkedList.add(6);
		mylinkedList.add(456);
		mylinkedList.add(546);
		mylinkedList.add(23);
		mylinkedList.add(87);
		mylinkedList.printList();
		
		Stack myStack = new Stack();
		myStack.push(new Node(12));
		myStack.push(new Node(1));
		myStack.push(new Node(98));
		myStack.printList();
		
		myStack.pop();
		
		myStack.printList();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.printList();
		myStack.push(new Node(12));
		myStack.push(new Node(1));
		myStack.push(new Node(98));
		myStack.push(new Node(12));
		myStack.push(new Node(1));
		myStack.push(new Node(98));
		myStack.printList();

		int peeked = myStack.peek().data;
		System.out.println("Peeked: " + peeked);
		myStack.printList();

		
		




		
	}
}

