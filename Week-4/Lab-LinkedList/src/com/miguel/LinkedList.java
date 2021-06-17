package com.miguel;

public class LinkedList {
	static Node head;
	
	//utility methods
	public static void add(int data) {
		Node newNode = new Node(data);
		//Make New Node
		newNode.next = head;
		//New Node.next is made into the current head;
		head= newNode;
		//Now the head is added as the new Node
		
	}
	public static void printList() {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		LinkedList myLinkedList = new LinkedList();
		LinkedList.add(6);
		LinkedList.add(456);
		LinkedList.add(546);
		LinkedList.add(23);
		LinkedList.add(87);
		printList();
		
	}
}
