public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = generateLinkedList();
		
		

		head = reverseLinkedList(head);

		printList(head);
	}
	private static Node reverseLinkedList(Node head){
		
		Node current = head;
		Node prev = null;
		
		while(current!=null){
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}

	private static void printList(Node head) {
		// TODO Auto-generated method stub
		if(head == null){
			System.out.println("List empty");
			return;
		}
		
		Node ptr = head;
		while(ptr!=null){
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}

	private static Node generateLinkedList() {
		// TODO Auto-generated method stub
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		return n1;
	}

}
