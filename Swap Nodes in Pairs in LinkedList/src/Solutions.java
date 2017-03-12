
public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = generateLinkedList();
		
//		print(head);
		
		Node ptr = head;
		Node newHead = head;

		if(head !=null && head.next!=null){
			newHead = head.next;
		}

		Node prev = null;
		while(ptr != null){
			swap(ptr,prev);
			prev = ptr;
			ptr = ptr.next;
		}

		print(newHead);
		
	}
	private static void print(Node n){
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	private static void swap(Node ptr, Node prev){
		Node next = ptr.next;
		if(prev != null && next!=null){ //middle of list
			prev.next = next;
			ptr.next = next.next;
			next.next = ptr;
		}
		
//		if(prev != null && next == null){ //last element in list
//			prev.next = ptr;
//		}
		if(prev == null && next!=null){ //first element in list
			ptr.next = next.next;
			next.next = ptr;
		}
	}
	private static Node generateLinkedList(){
		
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
