package com.miguel;

public class LinkedList {
	Node head;
	
	//utility methods
	public void add(int data) {
		Node newNode = new Node(data);
		//Make New Node
		newNode.next = head;
		//New Node.next is made into the current head;
		head= newNode;
		//Now the head is added as the new Node
		
	}
	public void printList() {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
}
