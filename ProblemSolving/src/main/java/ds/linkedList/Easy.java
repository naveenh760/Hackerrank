package ds.linkedList;

public class Easy {

	static void printLinkedList(SinglyLinkedListNode head) {
		if(head == null) {
			return;
		}
		SinglyLinkedListNode current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		
		if(head == null) {
			return newNode;
		}
		SinglyLinkedListNode current = head;
		while(current.next != null) {
			current  = current.next;
		}
		current.next = newNode;
		return head;
    }
	
	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
		SinglyLinkedListNode newNode= new SinglyLinkedListNode(data);
		
		if(llist == null) {
			return newNode;
		}
		newNode.next = llist;
		return newNode;

    }
	
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
		
		if(head == null) {
			return newNode;
		}
		
		if(position == 0) {
			newNode.next = head;
			return newNode;
		}
		SinglyLinkedListNode current = head;
		for(int i=1; i < position; i++) {
			current = current.next;
		}
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
}
