package coma.app;
class Node11 {
    int data;
    Node11 next;

    Node11(int new_data) {
        data = new_data;
        next = null;
    }
}

public class ReverseLinkedList {

	   static Node11 reverseList(Node11 head) {
	        
	        // Initialize three pointers: curr, prev and next
	        Node11 curr = head, prev = null, next;

	        // Traverse all the nodes of Linked List
	        while (curr != null) {
	            
	            // Store next
	            next = curr.next;
	            
	            // Reverse current node's next pointer
	            curr.next = prev;
	            
	            // Move pointers one position ahead
	            prev = curr;
	            curr = next;
	        }
	        
	        // Return the head of reversed linked list
	        return prev;
	    }

	    // This function prints the contents
	    // of the linked list starting from the head
	    static void printList(Node11 node) {
	        while (node != null) {
	            System.out.print(" " + node.data);
	            node = node.next;
	        }
	    }

	    public static void main(String[] args) {

	        // Create a hard-coded linked list:
	        // 1 -> 2 -> 3 -> 4 -> 5
	        Node11 head = new Node11(1);
	        head.next = new Node11(2);
	        head.next.next = new Node11(3);
	        head.next.next.next = new Node11(4);
	        head.next.next.next.next = new Node11(5);

	        System.out.print("Given Linked list:");
	        printList(head);
	        
	        head = reverseList(head);

	        System.out.print("\nReversed Linked List:");
	        printList(head);
	    }
}
