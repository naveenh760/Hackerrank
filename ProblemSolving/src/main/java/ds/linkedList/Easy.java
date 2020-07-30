package ds.linkedList;

public class Easy {

	static void printLinkedList(SinglyLinkedListNode head) {
		if (head == null) {
			return;
		}
		SinglyLinkedListNode current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

		if (head == null) {
			return newNode;
		}
		SinglyLinkedListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return head;
	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

		if (llist == null) {
			return newNode;
		}
		newNode.next = llist;
		return newNode;

	}

	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

		if (head == null) {
			return newNode;
		}

		if (position == 0) {
			newNode.next = head;
			return newNode;
		}
		SinglyLinkedListNode current = head;
		for (int i = 1; i < position; i++) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;

		return head;
	}

	static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
		if (position == 0) {
			return head.next;
		}

		SinglyLinkedListNode current = head;
		for (int i = 1; i < position; i++) {
			current = current.next;
		}
		SinglyLinkedListNode deleteNode = current.next;
		current.next = deleteNode.next;
		return head;
	}

	static void reversePrint(SinglyLinkedListNode head) {
		if(head != null) {
			reversePrint(head.next);
			System.out.println(head.data);
		}

	}
	
	static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		SinglyLinkedListNode current = head;
		SinglyLinkedListNode prev = null;
		SinglyLinkedListNode next;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
    }
	
	static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		SinglyLinkedListNode current1 = head1;
		SinglyLinkedListNode current2 = head2;
		
		while( current1 != null && current2 != null) {
			if(current1.data != current2.data) {
				break;
			}
			else {
				current1 = current1.next;
				current2 = current2.next;
			}
		}
		
		if(current1 == null && current2 == null) {
			return true;
		}
		else {
			return false;
		}
		
		

    }
	
	static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		SinglyLinkedListNode current1 = head1;
		SinglyLinkedListNode current2 = head2;
		SinglyLinkedListNode dummyHead = new SinglyLinkedListNode(-1);
		SinglyLinkedListNode newCurrent = dummyHead;
		
		while(current1 != null && current2!= null) {
			if(current1.data < current2.data) {
				newCurrent.next = current1;
				newCurrent = newCurrent.next;
				current1 = current1.next;
			}
			else {
				newCurrent.next = current2;
				newCurrent = newCurrent.next;
				current2 = current2.next;
			}
		}
		
		while(current1 != null) {
			newCurrent.next = current1;
			newCurrent = newCurrent.next;
			current1 = current1.next;
		}
		while(current2 != null) {
			newCurrent.next = current2;
			newCurrent = newCurrent.next;
			current2 = current2.next;
		}
		
		
		return dummyHead.next;
    }
	
	static int getNode(SinglyLinkedListNode head, int positionFromTail) {
		// posFromBeg = n - 1 - posFromTail 
		
		SinglyLinkedListNode posFromBegPtr = head;
		SinglyLinkedListNode posFromTailPtr = head;
		
		for(int i = 0; i < positionFromTail; i++) {
			posFromTailPtr = posFromTailPtr.next;
		}
		
		while(posFromTailPtr.next != null) {
			posFromTailPtr = posFromTailPtr.next;
			posFromBegPtr = posFromBegPtr.next;
		}
		
		return posFromBegPtr.data;
    }
	
	 static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
		 if(head == null) {
			 return null;
		 }
		 SinglyLinkedListNode current = head.next;
		 SinglyLinkedListNode prev = head;
		 while(current != null) {
			 if(prev.data == current.data) {
				 prev.next = current.next;
				 current = current.next;
			 }
			 else {
				 prev = current;
				 current = current.next;
			 }
			 
		 }
		 
		 
		 return head;
	    }

}
