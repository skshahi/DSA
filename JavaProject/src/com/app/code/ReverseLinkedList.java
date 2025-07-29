package com.app.code;

class Node {
	int value;
	Node next;

	public Node() {

		next = null;
	}
}

class SinglyLinkedList {
	Node head;
	Node tail;
	int size = 0;

	public SinglyLinkedList() {
		head = tail = null;
		size = 0;
		System.out.println("Singly Linked List created successfully.");
	}

	// insert node to linked list
	public void insertNode(int value) {
		Node node = new Node();
		node.value = value;
		node.next = null;

		if (head == null) {
			head = new Node();
			head = node;
			tail = node;

		} else {
//			node.next = null;
//			tail.next = node;
//			tail = node;
			Node currentNode=head;
			while(currentNode!=null)
			{
				currentNode=currentNode.next;
			}
			currentNode=node;
			currentNode.next=null;
			tail.next=currentNode;
			tail=currentNode;
			

		}
		size++;
	}

	public void travarsal() {
		if (head == null) {
			System.out.println("SLL is empty.");
		} else {
			//System.out.println(size);
			Node currentNode = head;
			while (currentNode != null) {
				System.out.println(currentNode.value);
				currentNode = currentNode.next;
			}
		}
	}

}

public class ReverseLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertNode(10);
		sll.insertNode(20);
		sll.insertNode(30);
		sll.insertNode(40);
		sll.insertNode(50);
		sll.insertNode(60);
		sll.travarsal();

	}

}
