package com.miguel;

public class Stack {
	private Node top;

    public void push(Node newNode) {
        // your implementation here
    	//push() : adds an element to the top/front of the stack
    	if(top == null) {
    		System.out.println("top is null adding to the top ");
    		top = newNode;
    	}else {
    		System.out.println("adding top is not null");
    		newNode.next = top;
    		top = newNode;
    	}
    	
    }
    public Node pop() {
        // your implementation here
    	//pop() : removes the first element from the stack, and returns it.
    	if(top==null) {
    		System.out.println("top is null nothing done");
    		return null;
    	}else {
    		Node popped = top;
    		top = top.next;
    		System.out.println("Popped from the top");
    		return popped;
    	}
    	
    }
    public Node peek() {
        // your implementation here
    	//peek() : returns the first element from the stack without removing it.
    	Node peek = top;
    	return peek;
    }

	public void printList() {
		// TODO Auto-generated method stub
		Node node = top;
		while(node != null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
}
