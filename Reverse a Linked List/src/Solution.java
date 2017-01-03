
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList ll = generateLinkedList();
		System.out.println("Before reverse");
		ll.print();
		System.out.println("After reverse");
		Node reverse = reverse(ll.head,null);
		while(reverse!=null){
			System.out.println(reverse.data);
			reverse = reverse.next;
		}
//		System.out.println("After reverse - Iteratively");
//		Node reverseIteratively = reverseIteratively(ll.head);
//		while(reverseIteratively!=null){
//			System.out.println(reverseIteratively.data);
//			reverseIteratively = reverseIteratively.next;
//		}
	}
	private static Node reverseIteratively(Node node) {
		// TODO Auto-generated method stub
		Node previous = null;
		Node current = node;
		while(current != null){
			Node next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		return previous;
	}
	private static Node reverse(Node n, Node p){
		if(n.next == null){
			n.next = p;
			return n;
		}
		Node n2 = reverse(n.next, n);
		
		n.next = p;
		
		return n2;
		
	}
	private static MyLinkedList generateLinkedList(){
		MyLinkedList ll = new MyLinkedList();
		for(int i=0 ; i<10 ; i++){
			ll.addNodeAtEnd(i);
		}
		return ll;
	}

}
