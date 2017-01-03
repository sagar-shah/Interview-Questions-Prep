
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList l1 = new MyLinkedList();
		MyLinkedList l2 = new MyLinkedList();
		l1.addNodeAtEnd(5);
		l1.addNodeAtEnd(10);
		l1.addNodeAtEnd(15);
		
		l2.addNodeAtEnd(4);
		l2.addNodeAtEnd(8);
		l2.addNodeAtEnd(9);
		l2.addNodeAtEnd(12);
		
		MyLinkedList l = merge(l1,l2);
		l.print();
	}

	private static MyLinkedList merge(MyLinkedList l1, MyLinkedList l2) {
		// TODO Auto-generated method stub
		Node h1 = l1.head;
		Node h2 = l2.head;
		
		Node h = merge(h1,h2);
		
		MyLinkedList l = new MyLinkedList();
		l.head = h;
		return l;
	}

	private static Node merge(Node h1, Node h2) {
		// TODO Auto-generated method stub
		if(h1 == null)
			return h2;
		if(h2 == null)
			return h1;
		
		if(h1.data < h2.data){
			h1.next = merge(h1.next,h2);
			return h1;
		}
		else{
			h2.next = merge(h1,h2.next);
			return h2;
		}
	}

}
